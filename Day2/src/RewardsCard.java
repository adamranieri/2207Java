public class RewardsCard extends CreditCard {

    // A rewards card has ALL the fields and methods of CreditCard
    // plus any extras
    int points;

    RewardsCard(String owner, int limit, double balance){
        // first task of any constructor is build an instance of tits parent
        super(owner,limit,balance);
        this.points = 0;
    }

    // A lot times when inheriting you need to selectively EDIT
    // an inherited method. Overriding
    // Redecalring the same method
    // throws a compiler error if you are not actually overriding something
    @Override
    void makePurchase(double purchase){
        if(purchase + this.balance < this.getLimit()){
            this.balance += purchase;
            this.points += purchase*0.01;
            System.out.println("Current points: " + this.points);
        }else{
            System.out.println("Purchase exceeds limit");
        }
    }
}
