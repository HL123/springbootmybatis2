package com.example.domain;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by huanglei on 17/4/2.
 */
public class Author {
    private Long id;

    @JSONField(name="real_name")
    private String realName;

    @JSONField(name = "nick_name")
    private String nickName;

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
