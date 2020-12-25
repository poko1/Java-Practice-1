/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.application;

/**
 *
 * @author Maliha
 */

// Abstract class
abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
    //System.out.println("It is "+age+" months old");
  }
}

public class MainApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pig myPig = new Pig(); // Create a Pig object
        //String sound = "wee wee";
        int age= 4;
        myPig.animalSound();
        myPig.sleep();
    }
    
}
