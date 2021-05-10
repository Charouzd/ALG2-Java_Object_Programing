/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package points;

/**
 *
 * @author Filip Charouzd
 * Library class - knihovní třída, sada statických metod
 */
public final class PointTool {
    
    private PointTool(){ //není možné vytvořit objekt
        
    }
    //také mohlo být ponecháno v metodě point, ale takhle je to lepší
    public static double calculateDistaceBetween(Point a, Point b){
        return Math.hypot(a.getX() - b.getX(), a.getY() - b.getY());
    }
}