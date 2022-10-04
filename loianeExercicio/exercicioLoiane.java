/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loianeExercicio;

import java.util.Scanner;

/**
 *
 * @author Felip
 */
public class exercicioLoiane {

   
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        boolean isValid = true;

        String name;
        String password;

        do {
            System.out.print("Enter the name of user: ");
            name = sc.nextLine();

            System.out.print("Password of user: ");
            password = sc.nextLine();

            if (name.equals(password)) {
                System.out.println("Your can not enter with your name");

            } else {
                System.out.println("registered successfully.");
                isValid = false;
            }

        } while (isValid);

        sc.close();
    }

}