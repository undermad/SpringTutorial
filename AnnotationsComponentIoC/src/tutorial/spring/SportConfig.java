package tutorial.spring;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("tutorial.spring")
@PropertySource("classpath:sport.properties")
public class SportConfig {

    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }

    @Bean
    @Scope("prototype")
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }

}
