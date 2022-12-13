package tutorial.spring;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String getDailyCoach() {
        return "Amazing coach with Iga Swiatek!";
    }
}
