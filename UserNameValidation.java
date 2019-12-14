/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usernamevalidation;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class UserNameValidation {
    
    public void length(String input){
        int length = input.length();
        System.out.println(((length>=6 && length<=16) ? "Valid" : "Invalid" )+ " Username");
    }
    
    public void content(String input) {
        System.out.println(((input.matches("^[a-z0-9-]$") || input.matches("[0-9]+"))? 
                "Valid" : "Invalid") + " Username"); 
    }
    
    public void firstLetter(String input){
       char c = input.charAt(0);
       System.out.println((((c >= 'a' && c<='z') || (c >= 'A' && c<='Z')) ? "Valid" : "Invalid" )+ " Username"); 
    }
    
    public void checkHyphen(String input){
       System.out.println(((input.charAt(0) != '-') ? "Valid" : "Invalid" )+ " Username"); 
    }
    
    public void checkCountofHyphen(String input){
        char set[] = input.toCharArray();
        int count = 0;
        for(int i=0;i<input.length();i++){
            if(set[i] == '-' )
               count++;
        }
        System.out.println(((count <= 1) ? "Valid" : "Invalid" )+ " Username"); 
    }       

    public static void main(String[] args) {
        
        String input;
        Scanner in = new Scanner(System.in);
        input = in.nextLine();
        
        UserNameValidation u = new UserNameValidation();
        u.length(input);
        u.content(input);
        u.firstLetter(input);
        u.checkHyphen(input);
        u.checkCountofHyphen(input);
        
    }
    
}
