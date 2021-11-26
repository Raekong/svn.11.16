package edu.nuist.ojs.common.entity;

import java.util.LinkedList;
import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import lombok.Data;

@Data
public class EmailConfigPoint {
    private long id;
    private String configPoint;
    private boolean email;
    private List<EmailTpl> tpls;

    public EmailTpl getDefault(){
        for(EmailTpl tpl : tpls){
            if( tpl.isDefaultTpl() )
                return tpl;
        }
        return null;
    }

    public EmailTpl getTpl(String tplName){
        for(EmailTpl tpl : tpls){
            if( tpl.getName().equals(tplName) )
                return tpl;
        }
        return null;
    }

    public EmailConfigPoint(){};

    public EmailConfigPoint( JSONObject obj ){
        this.id = obj.getLongValue("id");
        this.configPoint = obj.getString("configPoint");
        this.email = obj.getBooleanValue("email");
        this.tpls = new LinkedList<>();

        JSONArray arr = obj.getJSONArray("tpls");
        for(int i=0; i<arr.size(); i++){
            EmailTpl tpl = EmailTpl.get(arr.getJSONObject(i).getJSONObject("jsonData"));
            tpl.setId(arr.getJSONObject(i).getLongValue("id"));
            tpl.setDefaultTpl(arr.getJSONObject(i).getBooleanValue("defaultTpl"));
            this.tpls.add(tpl );
        }
    };
}
