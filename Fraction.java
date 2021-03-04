/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Filip Charouzd
 */
public class Fraction {

    double citatel;
    double jmenovatel;
//metody

    public void setValue(double x, double y) {
        citatel = x;
        jmenovatel = y;
    }

    public double citatel() {
        return citatel;
    }

    public double jmenovatel() {
        return jmenovatel;
    }

    public String simbolic() {
        return citatel + "/" + jmenovatel;
    }

    private double gcd(double a, double b) {
      while (a != 0 && b != 0){
  if(a > b)
     a= a % b;
  else
     b= b % a;
}
      if(a==0){
      return b;
      }else{
      return a;
      }
    }

    public String simplify() {

        double a = citatel;
        double b = jmenovatel;
        return a/gcd(a, b) +"/"+ b/gcd(a, b);
    }
}
