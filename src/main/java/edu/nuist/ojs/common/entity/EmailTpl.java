package edu.nuist.ojs.common.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import lombok.Data;

@Data
public class EmailTpl {
    private long id;
    private String configPoint;
    private String tplZH;
    private String tplEN;
    private String titleEN;
    private String titleCH;
    private String recipient;
    private List<String> available;
    private String name;
    private long jid;
    private boolean defaultTpl;

    public EmailTpl(){}

    public static EmailTpl get(JSONObject obj ){
        return JSONObject.toJavaObject(obj, EmailTpl.class);
    }

    public String render(HashMap<String, String> parameters, boolean isZh){
        return render( parameters, isZh, false);
    }

    public String render(HashMap<String, String> parameters, boolean isZh, boolean isHtml){
        String tpl = "";
        if( isZh ){
            tpl = tplZH;
            if( tpl == null || "".equals(tpl)) tpl = tplEN;
        }else{
            tpl = tplEN;
            if( tpl == null || "".equals(tpl)) tpl = tplZH;
        }
        return render(tpl, parameters, isHtml);
    }

    public String renderTitle(HashMap<String, String> parameters, boolean isZh, boolean isHtml){
        String title="";
        if( isZh ){
            title = titleCH;
            if( title == null || "".equals(title)) title = titleEN;
        }else{
            title = titleEN;
            if( title == null || "".equals(title)) title = titleCH;
        }
        return renderTitle(title, parameters, isHtml);
    }

    public String renderTitle(HashMap<String, String> parameters, boolean isZh){
        return renderTitle(parameters, isZh, false);
    }
    
    public  String render(String tpl, Map<String, String> model, boolean htmlFlag ) {
        String tmp = tpl;
        
        for(Entry<String, String> entry : model.entrySet()) {
            String key = entry.getKey();
            while( tmp.indexOf( key ) != -1  ) {
                String pre =  tmp.substring(0, tmp.indexOf( key ));
                String post = tmp.substring(tmp.indexOf(key)+ key.length());
                tmp = pre + entry.getValue() + post;
            }
        }
        if( !htmlFlag )
            tmp = tmp.replaceAll("<br>|<br />|<br/>|<p>|</p>", "\n");
        return tmp;
    }
    public  String renderTitle(String title, Map<String, String> model, boolean htmlFlag ){
        String tmp = title;
        for(Entry<String, String> entry : model.entrySet()) {
            String key = entry.getKey();
            while( tmp.indexOf( key ) != -1  ) {
                String pre =  tmp.substring(0, tmp.indexOf( key ));
                String post = tmp.substring(tmp.indexOf(key)+ key.length());
                tmp = pre + entry.getValue() + post;
                
            }
        }
        if( !htmlFlag )
            tmp = tmp.replaceAll("<br>|<br />|<br/>|<p>|</p>", "\n");
        return tmp;

    }
   public boolean checkCompleteness(String tpl,Map<String,String> model){
        String tmp=tpl;
       boolean flag;
       String regex = "#{1}[^#]*#{1}"; //正则表达式
       Pattern pattern = Pattern.compile(regex);
       Matcher m = pattern.matcher(tmp);
       List<String> matchRegexList = new ArrayList<String>();
       while(m.find()){
           matchRegexList.add(m.group());
       }
       for(String key:matchRegexList){
           flag=false;
           for(Entry<String, String> entry : model.entrySet()) {
               if(key.indexOf(entry.getKey())!=-1){
                   flag=true;
                   break;
               }
           }
           if(flag==false)return false;
       }
       return true;
   }
   public boolean checkAvailable(Map<String,String> model){
        boolean flag;
       for(Entry<String, String> entry : model.entrySet()) {
           flag=false;
           String key=entry.getKey();
               for(String ava:available){
                   if(key.equals(ava)){
                       flag=true;
                       break;
                   }
               }
               if(flag==false) return false;
       }
       return true;
   }
    public static String renderHtml(String tpl, Map<String, String> model ) {
        String tmp = tpl;
        for(Entry<String, String> entry : model.entrySet()) {
            String key = entry.getKey();
            while( tmp.indexOf( key ) != -1  ) {
                String pre =  tmp.substring(0, tmp.indexOf( key ));
                String post = tmp.substring(tmp.indexOf(key)+ key.length());
                tmp = pre + entry.getValue() + post;				
            }
        }
        return tmp;
    }
}
