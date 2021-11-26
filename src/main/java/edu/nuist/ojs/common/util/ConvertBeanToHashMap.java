package edu.nuist.ojs.common.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.HashMap;

public class ConvertBeanToHashMap {
    public static HashMap<String, String> to(Object o){
        HashMap<String, String> rst = new HashMap<String, String>();
        JSONObject json = JSON.parseObject(JSON.toJSONString(o));

        for(String key : json.keySet()){
            rst.put(key, json.getString(key));
        }
        return rst;
    }
}
