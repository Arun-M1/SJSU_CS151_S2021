/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arun Murugan
 */
public class Cat extends Animal implements Domesticated, Scratcher {
    public Cat(String type, String name, int age, String gender, String environment, int speed) {
        super(type, name, age, gender, environment, speed);
    }
    
    public void move() {
        this.walk();
    }
    
    public void sound() {
        System.out.println("says Meow!");
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
    public void walk() {
        System.out.println("I like to go on walks.");
    }

    @Override
    public void greetHuman() {
        System.out.println("Meow, please pet me!");
    }

    @Override
    public void scratch() {
        System.out.println("I love scratching curtains.");
    }
}
