package org.example;

public class Calculo {

    static String porcentagemInss = "";
    static String porcentagemVt = "";
    static String porcentagemBn = "";
    public static int validacaoInss (double salario){
        int inss = 0;

        if (salario >=2000){
            inss = 11;
            porcentagemInss = "11%";
        }
        else if (salario >1501 ){
            inss = 9;
            porcentagemInss = "9%";
        }
        else if (salario <=1500){
            inss = 8;
            porcentagemInss = "8%";
        }
        return inss;
    }

    public static int validacaoVt(double salario){
        int vt = 0;

        if (salario >= 1801){
            vt = 6;
            porcentagemVt = "6%";
        }
        else if (salario > 1201){
            vt = 4;
            porcentagemVt = "4%";
        }
        else if (salario <=1200){
            vt = 4;
            porcentagemVt = "2%";
        }

        return vt;
    }

    public static int validacaoBn(int anos) {
        int bn = 0;

        if (anos >= 10 ){
            bn = 5;
            porcentagemBn = "5%";
        }
        else if (anos > 5){
            bn = 2;
            porcentagemBn = "2%";
        } else {
            bn = 0;
            porcentagemBn = "0%";
        }
        return bn;


    }
}