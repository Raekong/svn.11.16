package edu.nuist.ojs.common.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Publisher implements SessionKey {
    private long id;

    private String name; //名称

    private String abbr; //缩写

    private String i18n; //中英文配置，值来自于类I18N.EN = "en"; I18N.CN = "zh";

    private String contact; //快递地址，电话，主页地址什么的，

    private String emailSender; 	//出版社默认邮箱的发件人名称
    private String emailAddress;	  //出版社默认的邮箱
    private int port;
    private String host;
    private String password;

    private boolean disable;	//出版社是否可用，相当于是否拉黑

    private String moduleJson;	//许可出版社使用的功能模块，是一个json字符串
    private String paymentSetting; //出版社支付配置


    private String[] modules;	//这个是功能字符串数据，由moduleJson转换得到

    public String[] getModules(){
        if(this.modules!=null){
            return this.modules;
        }
        this.modules = JSONObject.parseObject(moduleJson, String[].class);

        return  this.modules;

    }

    @Override
    public String get(Object o) {
       if(o==null)return this.getClass().getSimpleName()+this.id;
        else return this.getClass().getSimpleName()+this.abbr;
    }
}
