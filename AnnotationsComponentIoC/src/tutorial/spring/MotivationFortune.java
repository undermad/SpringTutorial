package tutorial.spring;

public class MotivationFortune implements FortuneService{
    @Override
    public String getFortune() {
        return "Keep going, no body gonna take from you that what you already have! Every day with little steps!";
    }
}
