/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package viva1;

import java.util.Scanner;

public class V1Q2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three integers nnn, aaa, bbb: ");
        int nnn = sc.nextInt();
        int aaa = sc.nextInt();
        int bbb = sc.nextInt();
        sc.close();

        int steps = 0;

        while (nnn >= 1) {
            if (nnn % bbb == 0) {
                nnn /= bbb;
            } 
            else {
                nnn -= aaa;
            }
            steps++;

            if (nnn < 1) {
                steps = -1;
                break;
            }
        }

        System.out.println(steps);
    }
}