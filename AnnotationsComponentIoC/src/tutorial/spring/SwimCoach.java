package tutorial.spring;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
    private FortuneService fortuneService;
    @Value("${email.swim}")
    private String email;
    @Value("${name.swim}")
    private String name;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyCoach() {
        return "Swim 2000m as a warm up! You are professional. ";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String toString() {
        return "Email: " + this.email + "\n"
                + "Name: " + this.name;
    }
}
