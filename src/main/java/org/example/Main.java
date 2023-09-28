package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Imprimir.printComeco();

        String name = Entrada.entradaNome();

        int anos = Entrada.entradaAnos();

        double salario = Entrada.entradaSalario();

        int inss = Calculo.validacaoInss(salario);

        int vt = Calculo.validacaoVt(salario);

        int bn = Calculo.validacaoBn(anos);

        String porcentagemInss = Calculo.porcentagemInss;
        String porcentagemVt = Calculo.porcentagemVt;
        String porcentagemBn = Calculo.porcentagemBn;


        Soma.somaValores(salario, inss, vt, bn);
        double salarioFinal = Soma.salarioSoma;

        double bnFinal = Soma.bnSoma;
        double vtFinal = Soma.vtSoma;
        double inssFinal = Soma.inssSoma;

        Imprimir.printDoc(name, salario, anos, inssFinal, vtFinal, bnFinal, salarioFinal, porcentagemBn, porcentagemVt, porcentagemInss);

    }}