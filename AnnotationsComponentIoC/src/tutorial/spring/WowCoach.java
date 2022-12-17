package tutorial.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WowCoach implements Coach {
    @Value("${dominik.email}")
    private String email;

    @Value("${dominik.age}")
    private int age;
    private FortuneService fortuneService;

    public WowCoach() {
    }

    @Autowired
    @Qualifier("wowFortuneSprint")
    public void howAreYou(FortuneService fortuneService) {
        System.out.println("Inside howAreYou()");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyCoach() {
        return "mythic+";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String toString() {
        return "Email: " + email + ". Age: " + age;
    }
}
