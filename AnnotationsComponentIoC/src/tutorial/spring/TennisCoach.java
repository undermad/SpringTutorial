package tutorial.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    @Autowired
    public TennisCoach(@Qualifier("happyFortuneDay") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyCoach() {
        return "Amazing coach with Iga Swiatek!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
