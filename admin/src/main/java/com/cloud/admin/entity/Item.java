package com.cloud.admin.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @author zhangqiao
 * @date 2020/1/14 10:09
 */
@Document(indexName = "item",type = "docs", shards = 1, replicas = 0)
public class Item {
    @Id
    private Long id;
    /**
     * 标题
     */
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String title;
    /**
     * 分类
     * */
    @Field(type = FieldType.Keyword)
    private String category;
    /**
     * 品牌
     * */
    @Field(type = FieldType.Keyword)
    private String brand;
    /**
     * 价格
     * */
    @Field(type = FieldType.Double)
    private Double price;
    /**
     * 图片地址
     * */
    @Field(index = false, type = FieldType.Keyword)
    private String images;
}
