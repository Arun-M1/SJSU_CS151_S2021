/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arun Murugan
 */
public abstract class Shape {
    private String name;
    private double area;
    
    public void setArea(double area) {
        this.area = area;
    }
    
    public double getArea() {
        return this.area;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public abstract double computeArea();
    
    @Override
    public String toString() {
        return name;
    }
}
