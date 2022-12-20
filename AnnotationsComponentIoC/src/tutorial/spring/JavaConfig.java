package tutorial.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:java_coach.properties")
public class JavaConfig {

    @Bean
    public FortuneService motivationService(){
        return new MotivationFortune();
    }

    @Bean
    public JavaCoach javaCoach(){
        return new JavaCoach(motivationService());
    }

}
