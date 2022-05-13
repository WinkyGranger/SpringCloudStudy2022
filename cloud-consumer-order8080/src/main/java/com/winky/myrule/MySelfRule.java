package com.winky.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * @auther Li Wenjie
 * @create 2022-01-10 21:50
 * 因为ribbon在使用时，官方文档明确给出了警告:
 *
 * 这个自定义配置类不能放在@ComponentScan所扫描的当前包下以及子包下，
 *
 * 否则我们自定义的这个配置类就会被所有的Ribbon客户端所共享，达不到特殊化定制的目的了。
 *
 * （也就是说不要将Ribbon配置类与主启动类同包）
 *
 * @SpringbootApplication 中包含了 @ComponentScan 注解，因此要独立一个包出来
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return new RandomRule(); //将原始定义的轮询改为自定义的随机端口
    }
}
