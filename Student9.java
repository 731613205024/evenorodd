/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple;

import java.util.Scanner;

/**
 *
 * @author Siva
 */

    /**
     * @param args the command line arguments
     */
   

class Student9
{  
 
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a%2!=0)
        {
            System.out.println("Num is Odd: "+a);
        }
        else
        {
        System.out.println("Num is Even "+a);
        }
    }
} 
    
    
