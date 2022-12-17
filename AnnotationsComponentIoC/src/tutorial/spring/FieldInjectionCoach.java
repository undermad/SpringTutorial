package tutorial.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FieldInjectionCoach implements Coach {
    @Autowired
    @Qualifier("amazingFortuneNight")
    private FortuneService fortuneService;

    @Override
    public String getDailyCoach() {
        return "Isn't amazing?";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
