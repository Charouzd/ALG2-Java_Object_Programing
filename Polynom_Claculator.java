/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Filip Charouzd
 */
public class Polynom_Claculator {

    public static double value(Polynom coef, double x) {
        double sum = 0;
        for (int i = 0; i <= coef.getLevel(); i++) {
            sum = sum + (coef.getCoefAt(i) * Math.pow(x, coef.getLevel() - i));
        }
        return sum;
    }

    public static Polynom multiplyByConstant(Polynom coef, double n) {
        double[] coefN = coef.getCoefRev();
        for (int i = 0; i < coefN.length; i++) {
            coefN[i] = coefN[i] * n;
        }
        return new Polynom(coefN, true);
    }

    public static Polynom twoPolynoms(Polynom coef1, Polynom coef2) {

        if (coef1.getLevel() > coef2.getLevel()) {
            double[] pol = coef1.getCoefRev();
            for (int i = 0; i < pol.length; i++) {
                pol[i] = pol[i] + coef2.getCoefAt(i);
                return new Polynom(pol, true);
            }
        }
        double[] pol = coef2.getCoefRev();
        for (int i = 0; i < pol.length; i++) {
            pol[i] = pol[i] + coef1.getCoefAt(i);
        }
        return new Polynom(pol, true);
    }
}
