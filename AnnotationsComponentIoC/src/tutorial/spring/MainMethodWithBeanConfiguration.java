package tutorial.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainMethodWithBeanConfiguration {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);
        System.out.println(swimCoach.getDailyCoach());
        System.out.println(swimCoach.getDailyFortune());
        System.out.println(swimCoach.toString());


    }
        }
