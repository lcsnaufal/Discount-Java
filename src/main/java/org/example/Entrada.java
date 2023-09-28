package org.example;

import java.util.Scanner;
public class Entrada {

    static Scanner scannerPadrao = new Scanner(System.in);
    public static String entradaNome(){

        String name = "";
        System.out.println("Insira o nome completo do colaborador");
        name = scannerPadrao.nextLine();

        return name;
    }

    public static int entradaAnos(){
        int anos = 0;

        System.out.println(" ");
        System.out.println("Insira os anos de trabalho");
        anos = scannerPadrao.nextInt();

        return anos;
    }

    public static double entradaSalario(){
        double salario = 0;

        System.out.println(" ");
        System.out.println("Insira o salário do colaborador");
        salario = scannerPadrao.nextDouble();
        System.out.println(" ");

        return salario;
    }
}
