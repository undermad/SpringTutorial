package tutorial.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        TennisCoach igaSwiatek = context.getBean("tennisCoach", TennisCoach.class);
        System.out.println(igaSwiatek.getDailyCoach());

        context.close();

    }
}