package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("|---------------------------------------------");
        System.out.println("|Bem-Vindo ao nosso programa");
        System.out.println("|---------------------------------------------");

        System.out.println("Insira o nome completo do colaborador");

        Scanner scannerPadrao = new Scanner(System.in);
        String name = scannerPadrao.nextLine();

        System.out.println("Insira os anos de trabalho");
        Integer anos = Integer.valueOf(scannerPadrao.nextLine());

        System.out.println("Insira o salário do colaborador");
        Integer salario = Integer.valueOf(scannerPadrao.nextLine());

        Integer inss = 0;

        Integer vt = 0;

        Integer bn = 0;
        if (salario >=2000){
            inss = 11;
        }
        else if (salario >1501 ){
            inss = 9;

        }
        else if (salario <=1500){
            inss = 8;
        }


        if (salario >= 1801){
            vt = 6;
        }
        else if (salario > 1201){
            vt = 4;
        }
        else if (salario <=1200){
            vt = 4;
        }

        if (anos >= 10 ){
            bn = 5;
        }
        else if (anos > 5){
            bn = 2;
        }


        Integer valorFinal = (bn + vt + inss) * salario;
        Double parteDoSalario = Double.valueOf((valorFinal / 100));
        Double salarioFinal = Double.valueOf((parteDoSalario + salario));

        Double bnFinal = Double.valueOf((bn * salario) / 100);
        Double vtFinal = Double.valueOf((vt * salario) / 100);
        Double inssFinal = Double.valueOf((inss * salario) / 100);

        System.out.println("|---------------------------------------------");
        System.out.println("|Nome: " + name);
        System.out.println("|Salário: " + salario);
        System.out.println("|Anos trabalhando: " + anos);
        System.out.println("|Desconto de INSS: " + inss + "%" + " Valor: " + inssFinal);
        System.out.println("|Desconto de VT: " + vt + "%" + " Valor: " + vtFinal);
        System.out.println("|Bonificação: " + bn + "%" + " Valor: " +bnFinal);
        System.out.println("| ");
        System.out.println("|Salário Líquido: " + salarioFinal);
        System.out.println("|---------------------------------------------");

    }}