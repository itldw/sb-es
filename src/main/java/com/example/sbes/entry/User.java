package com.example.sbes.entry;


import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 17:02 2019/8/15
 * @Modified By :
 */


@Document(indexName = "userinfo",type = "user",shards = 5,replicas = 1)
public class User {

    @Id
    private String id;

    @Field(type = FieldType.Text)
    private String name;

    @Field
    private String phone;

    @Field(type = FieldType.Integer)
    private int age;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
