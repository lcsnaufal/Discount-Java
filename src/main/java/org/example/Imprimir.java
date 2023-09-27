package org.example;

public class Imprimir {

    public static void printDoc(String name, double salario, int anos, double inssFinal, double vtFinal, double bnFinal, double salarioFinal, String porcentagemBn, String  porcentagemVt, String porcentagemInss){

        System.out.println("|---------------------------------------------");
        System.out.println("|Nome: " + name);
        System.out.println("|Salário: " + salario);
        System.out.println("|Anos trabalhando: " + anos);
        System.out.println("|Desconto de INSS: " + porcentagemInss + " Valor: " + inssFinal);
        System.out.println("|Desconto de VT: " + porcentagemVt + " Valor: " + vtFinal);
        System.out.println("|Bonificação: " + porcentagemBn + " Valor: " +bnFinal);
        System.out.println("| ");
        System.out.println("|Salário Líquido: " + salarioFinal);
        System.out.println("|---------------------------------------------");

    }
}