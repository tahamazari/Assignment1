/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class questions implements Serializable {
    private int type_of_ques;
    protected String ques;
    protected String ans; 
    
    questions(int type_of_ques, String ques, String ans){
    this.type_of_ques = type_of_ques;
    this.ques = ques;
    this.ans = ans;
    }
    
    questions(int type_of_ques){
    this.type_of_ques = type_of_ques;
    }
    
    
    public boolean validate_answer(String ans){
    return this.ans.equals(ans); 
}
    public boolean print_confirm_question(){
        Scanner sc=new Scanner(System.in); 
        
        String temp;
        System.out.println(this.ques);
        temp = sc.next();
        return validate_answer(temp);
    }
    
    public void initialize(){
        
    Scanner sc=new Scanner(System.in); 
    
    System.out.println("Enter your question.");
    ques = sc.next();
    
    System.out.println("Now type the answer of this question");
    ans = sc.next();
    }
    
}
