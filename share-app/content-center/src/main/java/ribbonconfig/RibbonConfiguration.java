package ribbonconfig;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName
 * @Description TODO
 * @Author wanghuanle
 * @Date
 **/
//@Configuration
public class RibbonConfiguration {
    @Bean
    public IRule ribbonRule(){
        //ctrl+alt+b:快速查看
        return new RandomRule();
    }
}
