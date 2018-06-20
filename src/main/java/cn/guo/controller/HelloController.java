package cn.guo.controller;

import cn.guo.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


/**
 * Created by administrator on 2018/6/7.
 */

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

//    @RequestMapping(value = {"/say"},method = RequestMethod.GET)
    @GetMapping(value = "/say")
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer id){
        return "id:"+id;
//       return girlProperties.getCupSize();
    }
}
