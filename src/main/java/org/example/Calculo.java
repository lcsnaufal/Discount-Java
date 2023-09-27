package org.example;

public class Calculo {

    public static int validacaoInss(double salario){
        int inss = 0;

        if (salario >=2000){
            inss = 11;
        }
        else if (salario >1501 ){
            inss = 9;
        }
        else if (salario <=1500){
            inss = 8;
        }
        return inss;
    }
}