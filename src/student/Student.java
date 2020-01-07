


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Studentclass [] s= new Studentclass[5];
       // student st1= new student();
       // st1.setName("Megha");
       // s[0]=st1;
        Scanner scan= new Scanner(System.in);
        System.out.println("length: "+s.length);
        for(int i=0;i<s.length;i++)
        {
            s[i]=new Studentclass();
            System.out.println("Enter names");
            s[i].setName(scan.nextLine());
        }
        
    }
    
}
