/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arun Murugan
 */
public class Animal {
    private String type;
    private String name;
    private int age;
    private String gender;
    private String environment;
    private int speed;
    
    public Animal(String type, String name, int age, String gender, String environment, int speed) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.environment = environment;
        this.speed = speed;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void setEnvironment(String environment) {
        this.environment = environment;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
       
    public String getType(){
        return type;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getGender(){
        return gender;
    }
    
    public String getEnvironment() {
        return environment;
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public String toString() {
        return "Type of animal: " + type + "\nName: " + name + "\nAge: " + age + " years old" + "\nGender: " + gender + "\nEnvironment: " + environment + "\nSpeed: " + speed + " miles per hour";
    }
}
