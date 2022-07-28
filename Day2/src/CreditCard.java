// Class is a template for creating an object that has these three fields
public class CreditCard {

    // variables declared within the class but NOT STATIC are instance variables
    // every time you create a credit card. Each credit card object gets it own copy of these variables
    String owner;
    private int limit; // should NEVER be made negative
    // by making it private I prevent that variable from being accessed ANYWHERE but this class
    double balance;

    // constructors create an instance of a class
    // 1. only methods with no return type
    // 2. They must be named the same as a class
    // CreditCard(String, int, double)
    CreditCard(String paramOwner, int paramLimit, double paramBalance){
        this.owner = paramOwner;
        this.limit = paramLimit;
        this.balance = paramBalance;
    }

    // overloaded constructor
    // CreditCard(String)
    CreditCard(String paramOwner){
        this.owner = paramOwner;
        this.balance = 0;
        this.limit = 1000;
    }

    void makePurchase(double purchase){
        if( purchase + this.balance < this.limit){
            this.balance += purchase;
        }else{
            System.out.println("purchase exceeds limit");
        }

    }

    // if your method does not use instance variables it should be static
    void showDetails(){
        // this keyword is used to specify the instance variable owned by the object
        System.out.println("Owner: " + this.owner + " Limit: " + this.limit + " Balance: " + this.balance) ;
    }

    // setter
    void setLimit(int newLimit){
        if(newLimit > 0){
            this.limit = newLimit;
        }else{
            System.out.println("unable to set a negative limit to card");
        }
    }

    int getLimit(){
        return this.limit;
    }

}
