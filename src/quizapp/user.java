/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class user {
    private String username;
    private String password;
    private String role;
    private int score;
    
    public user(String username, String password, String role, int score) {
    this.username = username;
    this.password = password;
    this.role = role;
    this.score = score;
    }
    
    public void get_user(String username, String password, String role, int score){
    Scanner sc=new Scanner(System.in); 
    
    System.out.println("Enter your Name");  
    username = sc.next();  
    
    System.out.println("Enter your Password");  
    password = sc.next(); 
    
    System.out.println("What is your Role, Admin or Student?");  
    role = sc.next(); 
    
    System.out.println("Enter your score");  
    score = sc.nextInt(); 
    
    }
    
}
