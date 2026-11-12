/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mejillano_problem2;

import java.util.Scanner;

/**
 *
 * @author Prince Dary
 */
public class Mejillano_Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner input = new Scanner (System.in);
        input.useDelimiter("[,\\s]+");
        
        int a = input.nextInt();
        int b = input.nextInt();
        
        //user input validation
        if (a == 0 && b == 0) {
            System.out.println("Invalid. the GCD is undefined.");
        } else if (a < 0 || b < 0) {
            System.out.println("Please input two positive integers.");
        } else 
            //result
        System.out.println(gcd (a, b));
    }
 
    
    public static int gcd(int a, int b) {
        //use the Euclidean algorithm
        if (b == 0) {
            return a; //gcd(a, b) returns a when b is 0
        } else {
            return gcd(b, a % b);
        }
    }
}
