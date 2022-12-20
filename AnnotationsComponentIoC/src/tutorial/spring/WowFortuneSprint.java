package tutorial.spring;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class WowFortuneSprint implements FortuneService {
    @Override
    public String getFortune() {
        return "Pull, kill, push, repeat!";
    }
}
