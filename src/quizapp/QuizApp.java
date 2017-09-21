/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author admin
 */
public class QuizApp implements Serializable {
    private quiz_model_class total_quizes[];
    private LinkedList <questions> listq;
    
    QuizApp(){
    listq = new LinkedList(); 
    questions q1 = new questions(1,"Q1. This is first question","1");
    questions q2 = new questions(2,"Q2. This is second question","true");
    questions q3 = new questions(1,"Q3. This is third question","2");
    questions q4 = new questions(3,"Q4. This is fourth question","islo");
    
    listq.add(q1);
    listq.add(q2);
    listq.add(q3);
    listq.add(q4);
    
    total_quizes = new quiz_model_class[]{new quiz_model_class(1,3,"Networks", listq),
    new quiz_model_class(1,3,"Physics", listq), new quiz_model_class(1,3,"Maths", listq)};
    }
    
    public void save_data(){
        try {   
            FileInputStream store = new FileInputStream("total_quizes.txt");
            try {
                ObjectInputStream obj = new ObjectInputStream(store);
                listq=(LinkedList<questions>)obj.readObject();
                obj.close();
            } catch (IOException ex) {
                Logger.getLogger(QuizApp.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(QuizApp.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(QuizApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void load_data(){
        try {   
            FileOutputStream store = new FileInputStream("total_quizes.txt");
            try {
                ObjectOutputStream obj = new ObjectInputStream(store);
                obj.writeObject(listq);
                obj.close();
            } catch (IOException ex) {
                Logger.getLogger(QuizApp.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(QuizApp.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(QuizApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void quiz_options(){
    int option;
    Scanner scan = new Scanner (System.in);
    
    int attempt = 1;
    
    while(attempt == 1){
    System.out.println("Please select a Quiz from the following:\n");
    for (int i = 0; i < total_quizes.length; i++){
    System.out.println(i+1+"."+total_quizes[i].get_title());
}
    option = scan.nextInt();
    
    if (option>0 && option <= total_quizes.length){
        total_quizes[option-1].print_quiz();
    }
    
    
     System.out.println("Press 1 if you want to attemt another quiz or 0 to exit!");
     attempt = scan.nextInt();
    } 
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        login abc = new login();
        abc.run();
        
        QuizApp xyz = new QuizApp();
        xyz.quiz_options();
    }
    
}
