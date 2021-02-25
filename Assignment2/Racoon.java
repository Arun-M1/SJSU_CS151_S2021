/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arun Murugan
 */
public class Racoon extends Animal implements Scratcher {
    public Racoon(String type, String name, int age, String gender, String environment, int speed) {
        super(type, name, age, gender, environment, speed);
    }
    
    public void move() {
        System.out.println("is moving");
    }
    
    public void sound() {
        System.out.println("says Skrrt!");
    }
    
    public void eat() {
        System.out.println("is eating");
    }
    
    public void sleep() {
        System.out.println("is snoring");
    }
    
    @Override
    public String toString() {
        return super.toString();    
    }

    @Override
    public void scratch() {
       System.out.println("I like to scratch trees.");
    }
}
