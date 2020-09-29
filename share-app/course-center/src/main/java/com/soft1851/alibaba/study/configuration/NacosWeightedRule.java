package com.soft1851.alibaba.study.configuration;

import com.alibaba.cloud.nacos.NacosDiscoveryProperties;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;
import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.BaseLoadBalancer;
import com.netflix.loadbalancer.Server;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName NacosWeightedRule
 * @Description 根据Nacos的权重来制定负载均衡规则
 * @Author 田震
 * @Date 2020/9/26
 **/
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class NacosWeightedRule extends AbstractLoadBalancerRule {
    private  final NacosDiscoveryProperties nacosDiscoveryProperties;
    @Override
    public void initWithNiwsConfig(IClientConfig clientConfig) {
   //读取配置文件，并初始化NacosWeightedRule
    }

    @Override
    public Server choose(Object key) {
        try {
            BaseLoadBalancer loadBalancer=(BaseLoadBalancer) this.getLoadBalancer();
            //想要请求的微服务的名称
            String name=loadBalancer.getName();
            //拿到微服务发现的相关的api
            NamingService namingService=nacosDiscoveryProperties.namingServiceInstance();
            //nacos client自动通过基于权重的负载均衡算法，给我们选择一个实例
            Instance instance=namingService.selectOneHealthyInstance(name);
            log.info("选择的实例是:port={},instance={}",instance.getPort(),instance);
        } catch (NacosException e) {
            e.printStackTrace();
        }
        return null;
    }
}