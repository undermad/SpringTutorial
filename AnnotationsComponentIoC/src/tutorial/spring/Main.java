package tutorial.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        TennisCoach igaSwiatek = context.getBean("tennisCoach", TennisCoach.class);
        System.out.println(igaSwiatek.getDailyCoach());
        System.out.println(igaSwiatek.getDailyFortune());

        System.out.println("****************************");
        BodyBuildingCoach dominikTworek = context.getBean("bodyBuildingCoach", BodyBuildingCoach.class);

        System.out.println(dominikTworek.getDailyCoach());
        System.out.println(dominikTworek.getDailyFortune());

        System.out.println("****************************");

        WowCoach wowCoach = context.getBean("wowCoach", WowCoach.class);
        System.out.println(wowCoach.getDailyCoach());
        System.out.println(wowCoach.getDailyFortune());

        System.out.println("****************************");

        FieldInjectionCoach fieldInjectionCoach = context.getBean("fieldInjectionCoach", FieldInjectionCoach.class);
        System.out.println(fieldInjectionCoach.getDailyCoach());
        System.out.println(fieldInjectionCoach.getDailyFortune());

        System.out.println(wowCoach.toString());


        context.close();

    }
}