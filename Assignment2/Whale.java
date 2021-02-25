/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arun Murugan
 */
public class Whale extends Animal implements Swimmer{
    public Whale(String type, String name, int age, String gender, String environment, int speed) {
        super(type, name, age, gender, environment, speed);
    }
    
    public void move() {
        this.swim();
    }
    
    public void sound() {
        System.out.println("says Whaaaaa!");
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
    public void swim() {
       System.out.println("I swim and live in the ocean.");
    }
}
