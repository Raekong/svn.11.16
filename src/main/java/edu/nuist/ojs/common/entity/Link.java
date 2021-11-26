package edu.nuist.ojs.common.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import cn.hutool.crypto.SecureUtil;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Link {
    private long id;
    private String MD5;
    private String api;
    private String jsonData;
    private boolean isClosed;

    public String getMD5( ){
        if( this.MD5 != null) return this.MD5;
        this.MD5 = SecureUtil.md5( api + jsonData + System.currentTimeMillis());
        this.MD5 = this.MD5.substring(0,8);
        return this.MD5;
    }


} 
