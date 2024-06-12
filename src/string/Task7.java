package string;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        String emailDB ="user@gmainl.com";
        String passwordDB = "user1234";
        // ask a user to enter 2 things: email and password
        // if given email matches with emailDB AND given password matches with passwordDB
        //Logging in
        // otherwise print -- wrong Credentials

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your email");
        String email = in.next();
        System.out.println("Enter a password");
        String password = in.next();
        boolean validCredentials = emailDB.equals(email)&&passwordDB.equals(password);
        if(validCredentials) System.out.println("Logging in...");
        else System.out.println("Wrong credentials");
        if(!emailDB.equals(email)) System.out.println("email is incorrect");
        if(!passwordDB.equals(password)) System.out.println("Password id incorrect");


    }
}
