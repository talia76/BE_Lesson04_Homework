import animals.Config;
import animals.Eagle;
import animals.Lion;
import animals.Wolf;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.WildcardType;

public class Main {
    public static void main(String[] args) {
        //ApplicationContext context = new AnnotationConfigApplicationContext("animals");
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);


        Lion lion = context.getBean(Lion.class);
        Wolf wolf = context.getBean(Wolf.class);
        Eagle eagle = context.getBean(Eagle.class);

        System.out.println("Lion's name: " + lion.getName());
        System.out.println("Wolf's name: " + wolf.getName());
        System.out.println("Eagle's name: " + eagle.getName());

    }
}


























