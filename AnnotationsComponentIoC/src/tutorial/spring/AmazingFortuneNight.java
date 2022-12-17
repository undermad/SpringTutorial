package tutorial.spring;

import org.springframework.stereotype.Component;

@Component
public class AmazingFortuneNight implements FortuneService{
    @Override
    public String getFortune() {
        return "Amazing night with amazing people!";
    }
}
