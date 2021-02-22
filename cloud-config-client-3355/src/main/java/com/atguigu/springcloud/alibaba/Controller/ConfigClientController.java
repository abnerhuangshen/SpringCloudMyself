package com.atguigu.springcloud.alibaba.Controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: abner-shen
 * @Date: 2021/01/07/14:50
 * @Description:
 */
@RefreshScope
@RestController
public class ConfigClientController {
    @Value("${config.info}")
    private String  configInfo;
    @GetMapping("/configInfo")
    public String getConfigInfo()
    {
        return configInfo;
    }

}
