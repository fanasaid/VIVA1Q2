
package viva1;

import java.util.Scanner;

public class V1Q2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three integers n, a, b: ");
        int nnn = sc.nextInt();
        int aaa = sc.nextInt();
        int bbb = sc.nextInt();
        sc.close();
        
        // Initialize steps counter to 0
        int steps = 0;        
                
        while (nnn > 1) { 
            if (bbb < 2 || aaa > nnn || nnn < 1){
                steps = -1;
                break;
            }
            
             // to check if nnn is divisible by bbb
            if (nnn % bbb == 0) {  
                nnn /= bbb;
            } 
            else {
                nnn -= aaa;
            }
            // Increment the step count
            steps++; 

            
        }

        System.out.println(steps);
    }
}