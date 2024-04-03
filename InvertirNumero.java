/*User
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.invertirnumero;

import java.util.Scanner;

/**
 *
 * @author mayke
 */
public class InvertirNumero {
    int invertido(int num, int inv){
        if(num > 0){
            return invertido(num / 10, num % 10 + inv * 10);
        } else {
            return inv;
        } 
    }
    public static void main(String[] args){
        InvertirNumero numInv = new InvertirNumero();
        Scanner sc = new Scanner(System.in);
        int num, inv = 0;
        System.out.println("Ingrese un numero entero para invertir: ");
        if (sc.hasNextInt()) {
            num = sc.nextInt();
            System.out.println("El numero invertido es: " + numInv.invertido(num, inv));
        } else {
            System.out.println("Lo siento, solo se pueden invertir numeros enteros.");
        }
    }
}
