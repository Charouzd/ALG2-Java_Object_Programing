/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package points;
/**
 * Nový datový typ, který reprezentuje bod v 2D prostoru 
 * @author Filip Charouzd
 */
public class Point {
    
    private double x;
    private double y;
    
    private double distance; //pro pozdější využití
    //konstruktory - vytvoří objekt
    //prázdný konstruktor - existuje automaticky pokud není jiný definován
    public Point(){
        this(0.0, 0.0); //alterativa toho dole
        //this.x = 0.0;
        //this.y = 0.0;
        //distance = 0.0; 
    }
    
    //přetížený konstruktor(aka.Overloaded constructor)
    public Point(double x, double y){
        this.x = x;
        this.y = y;
        distance = calculateDistance();
    }
    
    //metody - co se s tím dá dělat
    public double getDistance(){
       return distance;
    }
    
    //privátní interní metoda; nechci aby jí někdo další použil je prostě jen pro mě a tuhle třídu
    private double calculateDistance(){
        //return Math.sqrt(x*x + y*y);
        return Math.hypot(x, y);
    }
    
    //veřejné metody tvoří rozhraní třídy, měli by mít javadoc
    /**
     * Calculate distance from this point to the given point
     * @param p given point
     * @return distance 
     */
    //instanční metoda, pracuje s instančími daty "this."
    public double calculateDistaceFrom(Point p){
        return Math.hypot(this.x - p.x, this.y - p.y);
    }
    
    //statická metoda, která nepracuje s instančními daty  "this.", může být i v jiné tříďě(např.PointTools)
    public static double calculateDistaceBetween(Point a, Point b){
        return Math.hypot(a.x - b.x, a.y - b.y);
    }
    
    /*
    public String getTextRepresentation(){
        return "x=" + x + ", y=" + y;
    }
    */
    
    //překrytí kódu metody zděděné z předka Object 
    @Override
    public String toString(){
        return String.format("[%.2f, %.2f]",x , y);
    }
    
    //getter
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    /* moc se nevyplatí je používat pokud to není nutné
    //setter
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    */
}