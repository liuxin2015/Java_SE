package com.practice.test;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wb-liuxin.aj on 2016/9/26.
 */
public class MapUtilsTest {
    public static String getStringByKeys(final Map<String,String> map,String... keys){
        if (map == null||keys.length==0||keys==null) {
            return "";
        }
        for (String key:keys) {
            String answer=map.get(key);
            if (answer != null) {
                return answer;
            }
        }
        return "";
    }

    @Test
    public void testGetStringByKeys(){
        Map<String,String> map=new HashMap<String,String>();
        map.put("name","张三");
        map.put("age","18");
        map.put("sex","男");
        String value = getStringByKeys(map, new String[]{"name", "age"});
        System.out.println(value);
    }
}
