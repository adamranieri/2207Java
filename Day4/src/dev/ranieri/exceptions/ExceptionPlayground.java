package dev.ranieri.exceptions;

import java.util.Scanner;

public class ExceptionPlayground {

    // username must be 6 characters or longer
    // no illegal characters ! #

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// Scanner class can be used to read in information
        System.out.println("Enter you username");
        String username = scanner.nextLine();

        // we must put it in a try catch block or the code will not compile
        // defensive programming
        try {
            validateUsername(username); // it could be danagerous to call methods that throw RuntimeExcpetions. Likely to go unhandled
        }catch (InvalidUsernameException e){
            System.out.println("Invalid username");
            e.printStackTrace();
        } finally {
            System.out.println("Code that will always run regardless of an exception occurring or not");
        }

        System.out.println("That is a valid username");

    }

    // returns false for multiple different reasons
    // Exceptions are objects that hold information about the FAILURE of snippet of code
    // Exceptions can have useful messages and have a stack trace which shows exactly where they occurred
    // any thrown checked excpetions must be added to the method signature
    static boolean validateUsername(String username) throws InvalidUsernameException{

        if(username.length() > 5){
            if(username.contains("!") || username.contains("#")){
                throw new InvalidUsernameException("username contained an Illegal character");
            }
            return true;
        }

        throw  new InvalidUsernameException("username was too short. was " + username.length() + " but must be at least 6");
    }

}
