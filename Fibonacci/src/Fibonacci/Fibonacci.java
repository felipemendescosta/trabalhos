/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fibonacci;

/**
 *
 * @author Felip
 */
public class Fibonacci {

    static long fibo(int n) {
        int numeroAtual = 0;
        int numeroAnterior = 0;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                numeroAtual = 1;
                numeroAnterior = 0;

            } else {
                numeroAtual += numeroAnterior;
                numeroAnterior = numeroAtual - numeroAnterior;
            }
        }
        return numeroAtual;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 16; i++) {

            System.out.println("resultado da posição:  " + "(" + i + "): " + Fibonacci.fibo(i));
        }

    }
}
