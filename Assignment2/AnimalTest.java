/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arun Murugan
 */
public class AnimalTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dog burt = new Dog("Dog", "Burt", 14, "Male", "House", 8);
        System.out.println(burt.toString());
        burt.move();
        burt.eat();
        burt.sound();
        burt.sleep();
        burt.greetHuman();
        System.out.println();
        
        Cat melissa = new Cat("Cat", "Melissa", 3, "Female", "House", 5);
        System.out.println(melissa.toString());
        melissa.move();
        melissa.eat();
        melissa.sound();
        melissa.sleep();
        melissa.greetHuman();
        melissa.scratch();
        System.out.println();
        
        Racoon jay = new Racoon("Racoon", "Jay", 19, "Male", "Forest", 14);
        System.out.println(jay.toString());
        jay.move();
        jay.eat();
        jay.sound();
        jay.sleep();
        jay.scratch();
        System.out.println();
        
        Whale dory = new Whale("Whale", "Dory", 54, "Female", "Ocean", 30);
        System.out.println(dory.toString());
        dory.move();
        dory.eat();
        dory.sound();
        dory.sleep();
        System.out.println();
    }
    
}
