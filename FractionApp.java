
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
        Fraction zlomek = new Fraction();
        zlomek.setValue(sc.nextDouble(), sc.nextDouble());
        System.out.println(zlomek.citatel);
        System.out.println(zlomek.jmenovatel);
        System.out.println(zlomek.simbolic());
        System.out.println(zlomek.simplify());
    }

}
