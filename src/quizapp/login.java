/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class login {
    
    public void run() {
     String username;
     String password;
    
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Enter your Name:\n");
    username = scan.nextLine();
    
    System.out.println("Enter your Password:\n");
    password = scan.nextLine(); // looks at selected file in scan

//    if (user.equals(user) && pass.equals(pass)) {
//        System.out.print("your login message");
//    } else {
//        System.out.print("your error message");
//    }
      if( username.equals("taha") && password.equals("asd")){
      System.out.println("Welcome dear student!:\n");
      }
      else if ( username.equals("saif") && username.equals("asd")){
      System.out.println("Welcome Instructor:\n");
      }
      else{System.out.println("Username/Password Incorrect!:\n");}

  
}

}
