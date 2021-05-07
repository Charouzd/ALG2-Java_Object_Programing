/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Filip Charouzd
 */
public class polynomApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] p = {0, -3, 5, 5, 1};        
        Polynom poly = new Polynom(p, true);
        System.out.println("Stupeň polynomu je " + poly.getLevel());

        //Výpis koeficientů jako double
        double[] koeficienty = new double[poly.getLevel()];
        koeficienty = poly.getCoefRev();
        for (int i = 0; i < koeficienty.length; i++) {
            System.out.print(koeficienty[i] + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
        //Konkrétní koeficient
        System.out.println("koeficient 11. stupně: " + poly.getCoefAt(11));
        System.out.println("koeficient 2. stupně: " + poly.getCoefAt(2));
        System.out.println(" ");
        //Celý polynom jako string
        System.out.println(poly.toString());
        System.out.println(" ");
        //Derivace
        Polynom poDerivaci = poly.derivate();
        System.out.println(poDerivaci.toString());
        System.out.println(" ");
        //Konkrétní hodnota x
        double solution = Polynom_Claculator.value(poly, 3);
        System.out.println("pro x=3 y= " + solution);
        double solution1 = Polynom_Claculator.value(poly, 10);
        System.out.println("pro x=10 y= " + solution1);
        System.out.println(" ");
        //Násobení konstantou
        Polynom multyplied1 = Polynom_Claculator.multiplyByConstant(poly, 3);
        System.out.println("násobení -10 " + multyplied1.toString());
        Polynom multyplied2 = Polynom_Claculator.multiplyByConstant(poly, -10);
        System.out.println("násobení -10 " + multyplied2.toString());
        System.out.println(" ");
        //Sčítání polynomů
        double[] pp = {10, 9, 4, 3, -5};
        Polynom poly2 = new Polynom(pp, true);
        System.out.println("koeficienty 1.polynomu " + poly.toString());
        System.out.println("koeficienty 2.polynomu " + poly2.toString());
        Polynom soucet= Polynom_Claculator.twoPolynoms(poly, poly2);
        System.out.println("součet 1. a 2. polynomu " +soucet.toString()) ;
        System.out.println();
// Předpis polynomické funkce
    System.out.println(soucet.showPolynom());
    }

}
