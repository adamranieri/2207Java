package dev.ranieri.configs;

import dev.ranieri.models.Box;
import dev.ranieri.models.Donut;
import dev.ranieri.models.Jelly;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration //A stereotype in Spring. It defines the purpose of the class
// @Configuration is a class used as a registry for Spring Beans
public class DonutShopConfig {

    @Bean(name = "Strawberry Jelly") // this method creates a bean to be managed by the application context
    public Jelly strawberryJelly(){
        return new Jelly("Strawberry");
    }

    @Bean(name = "Blueberry Jelly")
    public Jelly blueberryJelly(){
        return new Jelly("Blueberry");
    }

    @Bean(name = "Small Strawberry Swirl")
    public Donut strawberrySwirl(){
        // Dependency injection is the process of building an object and adding the dependency it needs to work
        // a Donut needs a jelly
        // Angular does this with components and services
        // Constructor Dependency Injection
        Donut donut = new Donut("Strawberry Swirl", 1.25, this.strawberryJelly() );
        return donut;
    }

    @Bean(name = "Large Strawberry Swirl")
    public Donut strawberrySwirlLarge(){
        // Setter Dependency Inejction
        Donut donut = new Donut();
        donut.setName("Strawberry Swirl");
        donut.setPrice(2.45);
        donut.setJelly(this.strawberryJelly());
        return donut;
    }

    // by default all beans in the AC are Singletons
    // Spring creates one instance of the bean, stores it then gives you the only instance of that object
    // Singletons get created when the AC is created
    @Bean(name = "Small Box")
    public Box smallBox(){
        System.out.println("Small Box Being created");
        Box box = new Box(100);
        return box;
    }

    // a prototype bean will have a new instance created each time you get it
    @Bean(name = "Large Box")
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Box largeBox(){
        System.out.println("large box created");
        Box box = new Box(1000);
        return box;
    }




}
