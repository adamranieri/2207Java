package dev.ranieri.app;

import dev.ranieri.configs.DonutShopConfig;
import dev.ranieri.models.Box;
import dev.ranieri.models.Donut;
import dev.ranieri.models.Jelly;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        // will create an Application Context IoC Container with the beans defined in the class
        ApplicationContext ac = new AnnotationConfigApplicationContext(DonutShopConfig.class);

        Jelly strawberry = ac.getBean("Strawberry Jelly", Jelly.class);
        //System.out.println(strawberry);

        Jelly blueberry = ac.getBean("Blueberry Jelly",Jelly.class);
        //System.out.println(blueberry);

        Donut strawberrySwirl = ac.getBean("Large Strawberry Swirl", Donut.class);
        //System.out.println(strawberrySwirl);

//        Box box = ac.getBean("Small Box", Box.class);
//        System.out.println(box);
//        box.setValue(200);
//
//        Box box2 = ac.getBean("Small Box",Box.class);
//        System.out.println(box2);

        Box largeBox1 = ac.getBean("Large Box", Box.class);
        largeBox1.setValue(5000);

        Box largeBox2 = ac.getBean("Large Box", Box.class);
        largeBox2.setValue(4000);

        System.out.println(largeBox1);
        System.out.println(largeBox2);

    }
}
