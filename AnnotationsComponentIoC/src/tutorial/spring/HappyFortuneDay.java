package tutorial.spring;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneDay implements FortuneService {
    @Override
    public String getFortune() {
        return "This is your magnificent day!";
    }
}
