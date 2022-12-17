package tutorial.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BodyBuildingCoach implements Coach {
    private FortuneService fortuneService;

    public BodyBuildingCoach() {
    }

    @Autowired
    @Qualifier("happyFortuneDay")
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyCoach() {
        return "Squats!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
