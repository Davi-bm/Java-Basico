/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        System.out.println("Em que ano você nasceu? ");
        int nasc = t.nextInt();
        int i = 2015-nasc;
        System.out.println("Sua idade é " + i);
        if (i>=18) {
            System.out.println("Maior de Idade");    
        } else {
            System.out.println("Menor de Idade");
        }
    }
    
}
