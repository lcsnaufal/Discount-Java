package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scannerPadrao = new Scanner(System.in);

        System.out.println("|---------------------------------------------");
        System.out.println("|Bem-Vindo ao nosso programa");
        System.out.println("|---------------------------------------------");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Insira o nome completo do colaborador");
        String name = scannerPadrao.nextLine();

        System.out.println(" ");
        System.out.println("Insira os anos de trabalho");
        int anos = scannerPadrao.nextInt();

        System.out.println(" ");
        System.out.println("Insira o salário do colaborador");
        double salario = scannerPadrao.nextDouble();
        System.out.println(" ");


        int inss = Calculo.validacaoInss(salario);

        int vt = Calculo.validacaoVt(salario);

        int bn = Calculo.validacaoBn(anos);

        String porcentagemInss = Calculo.porcentagemInss;
        String porcentagemVt = Calculo.porcentagemVt;
        String porcentagemBn = Calculo.porcentagemBn;

        double valorFinal = (bn + vt + inss) * salario;
        double parteDoSalario = Double.valueOf((valorFinal / 100));
        double salarioFinal = Double.valueOf((parteDoSalario + salario));

        double bnFinal = Double.valueOf((bn * salario) / 100);
        double vtFinal = Double.valueOf((vt * salario) / 100);
        double inssFinal = Double.valueOf((inss * salario) / 100);

        Imprimir.printDoc(name, salario, anos, inssFinal, vtFinal, bnFinal, salarioFinal, porcentagemBn, porcentagemVt, porcentagemInss);


    }}