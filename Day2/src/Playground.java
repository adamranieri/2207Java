public class Playground {

    public static void main(String[] args) {
        // the new keyword instructs Java to allocate memory for NEW object
        CreditCard c1 = new CreditCard("hank hill", 10_000, 4300);
        CreditCard c2 = new CreditCard("hank hill", 10_000, 4300);
        CreditCard c3 = c2;
        CreditCard c4 = new CreditCard("Kim");

        // == for objects returns true if the memory address is the SAME and thus the same object
        System.out.println(c1 == c2);// false
        System.out.println(c3 == c2);// true

       System.out.println(c1.getLimit() == c2.getLimit());// true because you are really comparing 2 primitives
//
//        c1.limit = -10_000; // completely ILLOGICAL with access modifiers it is now PROGRAMITCALLY IMPOSSIBLE for it to be set negative

        CreditCard rc = new RewardsCard("vance",6000, 500);

        //A RewardsCard IS A CreditCard
        // it can do anything a credit card can do
        rc.makePurchase(500);// despite being labelled as a credit card. The method used is the overidden one
        //System.out.println(rc.points); not avaialbe
        // disconnecting the left-hand LABEL of the varaible datatype
        // the right-hand which actually defines what object you are referencing



    }
}
