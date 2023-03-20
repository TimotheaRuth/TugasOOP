/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculation;

/**
 *
 * @author ASUS
 */
public class Circle implements CalculateFlatField{
    double radius;
    private double area;
    private double round;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public void setArea(double radius) {
        area=3.14*radius*radius;
    }

    public void setRound(double radius) {
        round=3.14*2*radius;
    }
    
    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getRound() {
        return round;
    }
}
