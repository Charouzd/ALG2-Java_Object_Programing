
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Filip Charouzd
 */
public class FractionApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction frac = new Fraction(6,3);
        System.out.println(frac.simplify());
        frac.setValue(sc.nextDouble(), sc.nextDouble());
        System.out.println(frac.getCitatel());
        System.out.println(frac.getJmenovatel());
        System.out.println(frac.simplify());
        System.out.println(frac.fractionValue());
        System.out.println(frac.simbolic());

    }

}
