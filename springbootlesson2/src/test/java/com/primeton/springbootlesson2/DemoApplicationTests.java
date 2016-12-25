package com.primeton.springbootlesson2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



import com.primeton.springbootlesson2.config.DiscoveryConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes={DemoApplication.class})
public class DemoApplicationTests {

    @Autowired
    private DiscoveryConfig config;

    @Test
    public void getConfigTest() throws Exception {
         Assert.assertEquals(config.getRegProtocol(), "etcd");
         Assert.assertEquals(config.getAddress(), "10.15.15.119:12379");
    }
}
