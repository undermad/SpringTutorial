package tutorial.spring;

public class SadFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "It is your worst day in your life!";
    }
}
