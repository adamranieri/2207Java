package dev.ranieri.lambdas;

import java.util.ArrayList;
import java.util.List;

public class LambdaPlayground {

    public static void main(String[] args) {
        // lambdas are a type of functional programming
        // we store code as a value in a variable
        // All Lambdas must be created from functional interfaces
        Calculate add = (n1,n2) -> {
            return n1 + n2;
        };

        double sum = add.calc(90,10);
        System.out.println(sum);

        // lambda expressions are another syntax for lambdas
        // if the code is a single line there is an implicit return
        Calculate multiply = (n1,n2) -> n1*n2;
        multiply.calc(7,7);// 49

        // Useful situation for lambdas.
        // Javalin Handlers

        List<Integer> integerList = new ArrayList();
        integerList.add(10);
        integerList.add(-9);
        integerList.add(20);
        integerList.add(-15);
        integerList.add(30);
        integerList.add(-20);

//        for(Integer i: integerList){
//            System.out.println(i);
//        }

        integerList.forEach(i ->{
            System.out.println(i);
        });

        // remove all the negative values from the list
        integerList.removeIf(i -> i < 0 ); // removes all negative values
        System.out.println(integerList);


    }
}
