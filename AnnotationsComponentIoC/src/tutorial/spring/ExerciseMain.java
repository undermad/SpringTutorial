package tutorial.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExerciseMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(JavaConfig.class);

        JavaCoach javaCoach = context.getBean("javaCoach", JavaCoach.class);
        System.out.println(javaCoach.getDailyCoach());
        System.out.println(javaCoach.getDailyFortune());
        System.out.println(javaCoach.toString());


    }
}
