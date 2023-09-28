package org.example;

public class Soma {
    static double salarioSoma = 0;
    static double inssSoma = 0;
    static double vtSoma = 0;
    static double bnSoma = 0;

    public static double somaValores(double salario, int inss, int vt, int bn){

        double valorFinal = (bn + vt + inss) * salario;
        double parteDoSalario = Double.valueOf((valorFinal / 100));
        double salarioFinal = Double.valueOf((parteDoSalario + salario));

        double bnFinal = Double.valueOf((bn * salario) / 100);
        double vtFinal = Double.valueOf((vt * salario) / 100);
        double inssFinal = Double.valueOf((inss * salario) / 100);

        salarioSoma = salarioFinal;
        inssSoma = inssFinal;
        vtSoma = vtFinal;
        bnSoma = bnFinal;

        return inssSoma;
    }
}
