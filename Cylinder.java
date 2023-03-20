/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculation;

/**
 *
 * @author ASUS
 */
public class Cylinder extends Circle implements CalculateSpace{
    double tall;
    private double SurfaceArea;
    private double Volume;

    public Cylinder(double radius, double tall){
        super(radius);
        this.tall = tall;
    }
    
    public void setSurfaceArea(double tall) {
        SurfaceArea=2*getArea()+getRound()*tall;
    }

    public void setVolume(double tall) {
        Volume=getArea()*tall;
    }
    
    
    @Override
    public double getSurfaceArea() {
        return SurfaceArea;
    }

    @Override
    public double getVolume() {
        return Volume;
    }
   
}

