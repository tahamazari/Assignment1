/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class quiz_model_class {
    private int type_of_quiz;
    private int num_of_ques;
    //private int score;
    private String quiz_title;
    private LinkedList <questions> quiz_questions;
    
    quiz_model_class(int type_of_quiz, int num_of_ques, String quiz_title, LinkedList <questions> listq){
    this.type_of_quiz =  type_of_quiz;
    this.num_of_ques = num_of_ques;
    this.quiz_title = quiz_title;
    this.quiz_questions = listq;
    }
    
    public String get_title(){
    return quiz_title;
    }
    
    public void make_quiz(){
    Scanner sc=new Scanner(System.in); 
    
    int status = 1;
    int num_status = 1;
    
    while(status == 1){
    System.out.println("Enter your Quiz Title!");
    quiz_title = sc.next();
    System.out.println("Enter the type of Quiz you want to make: \n1. MCQ\n2. True/False\n3. Numeric");
    type_of_quiz = sc.nextInt();
    
    while(num_status == 1){
    questions current = new questions(type_of_quiz); 
    current.initialize();
    quiz_questions.add(current);
    
    
    System.out.println("Do you want to make another question? Press 1 to continue or 0 to complete quiz!");
    num_status = sc.nextInt();
    }
    System.out.println("Do you want to make another Quiz? Press 1 to continue or 0 to complete exit!");
    status = sc.nextInt();
    }
    } 
    
    public void print_quiz(){
        int score = 0;
        for (questions temp : quiz_questions) {
            if(temp.print_confirm_question()){
            score = score + 1;
            }
        }
        System.out.printf("Your score is %d\n", score);
    }
    
    
    
}
