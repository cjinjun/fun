package com.fun;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jason on 2017/11/9
 * @author jason
 */
@RestController
public class HelloFun {

    @RequestMapping("/getFun")
    public Map<String,Object> getFun(){
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("status","0");
        map.put("data","hello new fun");
        return map;
    }
}
