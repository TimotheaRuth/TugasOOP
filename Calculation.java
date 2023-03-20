/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculation;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Calculation {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char back;
        
        do{
        System.out.println("Menu");
        System.out.println("1. Beam\n2. Cylinder");
        System.out.print("choose: ");
        int option = input.nextInt();
        switch(option){
            case 1:
                System.out.print("length: ");
                double length = input.nextDouble();    
                System.out.print("width: ");
                double width = input.nextDouble();  
                System.out.print("tall: ");
                double tall = input.nextDouble(); 

                Beam x = new Beam(length, width, tall);
                x.setArea(length, width);
                x.setRound(length, width);
                x.setSurfaceArea(tall);
                x.setVolume(tall);
                System.out.println("Rectangle Area: "+x.getArea());
                System.out.println("Rectangle Round: "+x.getRound());
                System.out.println("Beam Surface Area: "+x.getSurfaceArea());
                System.out.println("Beam Volume: "+x.getVolume());
            break;
            
            case 2:
                System.out.print("radius: ");
                double radius = input.nextDouble();     
                System.out.print("height: ");
                double height = input.nextDouble(); 

                Cylinder y = new Cylinder(radius, height);
                y.setArea(radius);
                y.setRound(radius);
                y.setSurfaceArea(height);
                y.setVolume(height);
                System.out.println("Circle Area: "+y.getArea());
                System.out.println("Circle Round: "+y.getRound());
                System.out.println("Cylinder Surface Area: "+y.getSurfaceArea());
                System.out.println("Cylinder Volume: "+y.getVolume());
            break;
            }
        System.out.print("go back to main menu?(y/n) ");
        back = input.next().charAt(0);
        } while (back == 'Y' || back == 'y');
    }
        
}
