package com.igouc;

import com.igouc.repository.GtuGaoXiaoFenShuRepository;
import com.igouc.service.bo.GtuGaoXiaoFenShuBo;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GtuApplication.class)
@WebAppConfiguration
public class RepostoryTest {

    private static final Logger LOG = Logger.getLogger(RepostoryTest.class);
    @Autowired
    GtuGaoXiaoFenShuRepository repository;

    @Test
    public void testGetGtuGaoXiaoFenShuById() {
        GtuGaoXiaoFenShuBo gtuGaoxiaoFenshuPO = repository.getGtuGaoXiaoFenShuById(2);
        LOG.info(gtuGaoxiaoFenshuPO);
    }
}
