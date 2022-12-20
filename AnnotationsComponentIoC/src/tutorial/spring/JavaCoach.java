package tutorial.spring;

import org.springframework.beans.factory.annotation.Value;

public class JavaCoach implements Coach {

    @Value("${email.dom}")
    private String email;
    @Value("${name.dom}")
    private String name;

    private FortuneService fortuneService;

    public JavaCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyCoach() {
        return "Don't worry, take your time! Java is great and easy!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String toString() {
        return "Email: " + this.email + "\n" +
                "Name: " + this.name;
    }
}
