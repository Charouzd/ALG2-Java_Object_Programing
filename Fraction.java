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

    private double citatel;
    private double jmenovatel;
    //konstruktory 
    public Fraction(String cit,String jme){
    this.citatel=Double.parseDouble(cit);
    this.jmenovatel=Double.parseDouble(jme);;
    }

    public Fraction(double citatel, double jmenovatel) {
        this.citatel = citatel;
        this.jmenovatel = jmenovatel;
    }
    
//metody

    public void setValue(double x, double y) {
        citatel = x;
        jmenovatel = y;
    }

    public double getCitatel() {
        return citatel;
    }

    public double getJmenovatel() {
        return jmenovatel;
    }

    public String simbolic() {
        return citatel + "/" + jmenovatel;
    }
    public double fractionValue(){
    if(this.jmenovatel != 0){
        return this.citatel/this.jmenovatel;
    }else{    
        return Double.NaN;
    }
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

        double a = this.citatel;
        double b = this.jmenovatel;
        if (b==0){
        return " nulou dělit nelze";
        }
        return a/gcd(a, b) +"/"+ b/gcd(a, b);
    }
}
