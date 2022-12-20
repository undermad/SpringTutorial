package tutorial.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class ScopeCoach implements Coach {

    private static int instancesCreated = 0;
    private int id;

    @Autowired
    @Qualifier("randomFortune")
    private FortuneService fortuneService;

    public ScopeCoach() {
        this.id = 100000 + instancesCreated;
    }

    @PostConstruct
    public void addInstance() {
        System.out.println("Instance created. ID: " + this.id);
        instancesCreated++;
    }


    //PROTOTYPE BEANS DON'T SUPPORT PRE-DESTROY METHOD!!!!!!!!!
    @PreDestroy
    public void printId() {
        System.out.println("ScopeCoach id: " + this.id + " has been destroyed.");
    }


    @Override
    public String getDailyCoach() {
        return "This is Scope prototype Coach";
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
