package com.igouc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = GtuApplication.class)
@WebAppConfiguration
public class ElasticsearchTest {
    @Test
    public void testElasticsearchIndex() {

    }


}
