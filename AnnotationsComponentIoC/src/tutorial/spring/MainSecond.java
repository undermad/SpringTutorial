package tutorial.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSecond {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        ScopeCoach scopeCoach = context.getBean("scopeCoach", ScopeCoach.class);

        System.out.println(scopeCoach.getDailyCoach());
        System.out.println(scopeCoach.getDailyFortune());
        scopeCoach.setFortuneService(() -> "This fortune has been changed!");
        System.out.println(scopeCoach.getDailyFortune());

        System.out.println("*******************");

        ScopeCoach scopeCoach1 = context.getBean("scopeCoach", ScopeCoach.class);
        System.out.println(scopeCoach1.getDailyCoach());
        System.out.println(scopeCoach1.getDailyFortune());

        System.out.println(scopeCoach);
        System.out.println(scopeCoach1);

        context.close();

    }
}
