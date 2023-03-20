/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculation;

/**
 *
 * @author ASUS
 */
public class Rectangle implements CalculateFlatField{
    double length;
    double width;
    private double area;
    private double round;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    public void setArea(double length, double width) {
        area=length*width;
    }

    public void setRound(double length, double width) {
        round=2*(length+width);
    }

    /**
     *
     * @return
     */
    @Override
    public double getArea() {
        return area;
    }

    /**
     *
     * @return
     */
    @Override
    public double getRound() {
        return round;
    }
    
}
