package ribbonconfig;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName RibbonConfiguration
 * @Description TODO
 * @Author 田震
 * @Date 2020/9/25
 **/
//@Configuration
public class RibbonConfiguration {
    @Bean
    public IRule ribbonRule(){
//        ctrl+alt+b查看规则
  return  new RandomRule();
    }
}