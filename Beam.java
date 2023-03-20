/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculation;

/**
 *
 * @author ASUS
 */
public class Beam extends Rectangle implements CalculateSpace{
    double tall;
    private double SurfaceArea;
    private double Volume;

    public Beam(double length, double width, double tall){
        super(length, width);
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
