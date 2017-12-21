package com.ccq.article.api;

import com.ccq.article.dto.UserInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RequestMapping("/article")
@RestController("articleController")
public class ArticleController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/list")
    public String articleList() {
        ServiceInstance instance = loadBalancerClient.choose("memberCenter");
        return "用户服务中心" + instance.getHost() + instance.getPort();
    }

    @RequestMapping("/dis")
    public String dis() {
        List<ServiceInstance> services = discoveryClient.getInstances("memberCenter");
        return "用户中心" + services.get(0).getHost() + services.get(0).getPort();
    }

    @RequestMapping("/userinfo/{id}")
    public UserInfoDto getUserInfo(@PathVariable("id") Long id) {
        List<ServiceInstance> services = discoveryClient.getInstances("memberCenter");
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForEntity("http://" + services.get(0).getHost() + ":" + services.get(0).getPort() +
                "/member/info/{id}" ,UserInfoDto.class,id).getBody();
    }

}
