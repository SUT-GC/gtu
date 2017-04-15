package com.igouc.job;

import com.igouc.component.elasticsearch.ElasticsearchComponent;
import com.igouc.repository.GtuGaoXiaoFenShuRepository;
import com.igouc.repository.po.GtuGaoxiaoFenshuPO;
import com.igouc.service.bo.GtuGaoXiaoFenShuBo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RepositoryToEsJob extends BaseJob<GtuGaoXiaoFenShuBo> {
    private static final Logger LOG = Logger.getLogger(RepositoryToEsJob.class);
    private static final int LIMIT = 1000;
    private static final int POOL_SIZE = 10;
    private static final int GROUP_SIZE = 1000;
    private static final String JOB_NAME = "高效分数 表数据导入 ES";
    private static final int LAST_ID = 0;

    @Autowired
    private GtuGaoXiaoFenShuRepository gaoXiaoFenShuRepository;

    @Autowired
    private ElasticsearchComponent esComponent;

    @Override
    protected long getLastListId(List<GtuGaoXiaoFenShuBo> dataList) {
        return dataList.get(dataList.size() - 1).getId();
    }

    @Override
    protected void disposeData(GtuGaoXiaoFenShuBo data) {
        esComponent.indexDocById(ElasticsearchComponent.INDEX_GTU, ElasticsearchComponent.TYPE_GXFS, data.toJsonString(), data.getId().toString());
    }

    @Override
    protected List<GtuGaoXiaoFenShuBo> getDataList(long lastId, int limit) {
        return gaoXiaoFenShuRepository.getGtuGaoXiaoFenShuByLastIdAndLimit(lastId, limit);
    }

    @Override
    protected Logger getLog() {
        return RepositoryToEsJob.LOG;
    }

    @Override
    protected int getLimit() {
        return RepositoryToEsJob.LIMIT;
    }

    @Override
    protected int getPooSize() {
        return RepositoryToEsJob.POOL_SIZE;
    }

    @Override
    protected int getGroupSize() {
        return RepositoryToEsJob.GROUP_SIZE;
    }

    @Override
    protected String getJobName() {
        return RepositoryToEsJob.JOB_NAME;
    }

    @Override
    protected long getLastId() {
        return RepositoryToEsJob.LAST_ID;
    }
}
