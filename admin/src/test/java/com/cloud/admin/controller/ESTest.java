package com.cloud.admin.controller;

import com.cloud.admin.entity.Item;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author zhangqiao
 * @date 2020/1/14 10:11
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ESTest.class)
public class ESTest {
    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Test
    public void createIndex(){
        elasticsearchTemplate.createIndex(Item.class);
    }
}
