package com.igouc.component.elasticsearch;

import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.elasticsearch.action.bulk.BulkRequestBuilder;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequestBuilder;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.net.InetSocketAddress;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

@Component
public class ElasticsearchComponent {
    private static final Logger LOG = Logger.getLogger(ElasticsearchComponent.class);
    private static final String CLUSTER_NAME = "elasticsearch";
    private static final String[] HOSTS = {"120.25.94.221:9200",};
    private static final String INDEX_GTU = "gtu";
    private static final String TYPE_GXFS = "gxfs";
    private TransportClient client;

    @PostConstruct
    public void init() {
        Settings settings = Settings.settingsBuilder().
                put("client.transport.sniff", true).
                put("discovery.zen.fd.connect_on_network_disconnect", true).
                put("cluster.name", CLUSTER_NAME).build();

        TransportClient client = TransportClient.builder().settings(settings).build();
        try {
            for (String host : HOSTS) {
                int index = host.indexOf(":");
                if (index > 0) {
                    client.addTransportAddress(new InetSocketTransportAddress(new InetSocketAddress(host.split(":")[0], Integer.parseInt(host.split(":")[1]))));
                }
            }
        } catch (NumberFormatException e) {
            LOG.error(String.format("获取ES客户端失败[%s]", e));
        }
    }

    public void indexDocById(String index, String type, String doc, String id) {
        try {
            client.prepareIndex(index, type, id)
                    .setSource(doc)
                    .execute()
                    .get();
        } catch (Exception e) {
            LOG.error(String.format("索引文档失败 index[%s], type[%s], doc[%s], id[%s], message[%s]", index, type, doc, id, e));
        }
    }

    public void updateDocById(String index, String type, String doc, String id) {
        try {
            client.prepareUpdate(index, type, id)
                    .setDoc(doc)
                    .execute()
                    .get();
        } catch (Exception e) {
            LOG.error(String.format("更新文档失败 index[%s], type[%s], doc[%s], id[%s], message[%s]", index, type, doc, id, e));
        }
    }

    public String getDocById(String index, String type, String id) {
        try {
            GetResponse getResponse = client.prepareGet(index, type, id)
                    .execute()
                    .actionGet();
            return getResponse.getSourceAsString();
        } catch (Exception e) {
            LOG.error(String.format("获取文档失败 index[%s], type[%s], id[%s], message[%s]", index, type, id, e));
        }

        return "";
    }

    public void deleteDocById(String index, String type, String id) {
        try {
            DeleteResponse deleteResponse = client.prepareDelete(index, type, id)
                    .execute()
                    .actionGet();
        } catch (Exception e) {
            LOG.error(String.format("删除文档失败 index[%s], type[%s], id[%s], message[%s]", index, type, id, e));
        }
    }

    public void upsetDocById(String index, String type, String doc, String id) {
        try {
            client.prepareUpdate(index, type, id)
                    .setDoc(doc)
                    .setUpsert(doc)
                    .execute()
                    .get();
        } catch (Exception e) {
            LOG.error(String.format("upSert文档失败 index[%s], type[%s], doc[%s]", index, type, doc, id, e));
        }
    }

    public void blukIndexDocByIds(String index, String type, List<List<String>> docs) {
        try {
            BulkRequestBuilder bulkRequestBuilder = client.prepareBulk();
            for (List<String> doc : docs) {
                bulkRequestBuilder.add(client.prepareIndex(index, type, doc.get(0)).setSource(doc.get(1)));
            }
            bulkRequestBuilder.execute().get();
        } catch (Exception e) {
            LOG.error(String.format("批量索引失败index[%s], type[%s], doc[%s], message[%s]", index, type, JSONObject.toJSONString(docs), e));
        }
    }
}
