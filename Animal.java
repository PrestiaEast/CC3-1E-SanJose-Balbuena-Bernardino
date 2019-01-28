/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;


public class Animal {

    
    public static void main(String[] args) {
         //create object for AnimalBp
        AnimalBp turtle = new AnimalBp();  
        AnimalBp dog = new AnimalBp();
        AnimalBp cat = new AnimalBp();
        
        
        
        turtle .setType("Reptile");
        String turtleType = turtle.getType();
        
        
        System.out.println(turtleType);
        
        turtle.setnumberOfFeet(4);
        int turtlenumberOfFeet = turtle.getnumberOfFeet();
        
        System.out.println(turtlenumberOfFeet);
        
        turtle.setColor("Green");
        String turtleColor = turtle.getColor();
        
        System.out.println(turtleColor);
        
        turtle.setlaysAnEgg(true);
        boolean turtlelaysAnEgg = turtle.getLaysAnEgg();
        
        System.out.println(turtlelaysAnEgg);
        
        
        dog .setType("Mammal");
        String dogType = dog.getType();
        
        System.out.println(dogType);
        
        dog.setnumberOfFeet(4);
        int dognumberOfFeet = dog.getnumberOfFeet();
        
        System.out.println(dognumberOfFeet);
        
        dog.setColor("Brown and White");
        String dogColor = dog.getColor();
        
        System.out.println(dogColor);
        
        dog.setlaysAnEgg(false);
        boolean doglaysAnEgg = dog.getLaysAnEgg();
        
        System.out.println(doglaysAnEgg);
        
        cat .setType("Mammal");
        String catType = cat.getType();
        
        
        System.out.println(catType);
        
        cat.setnumberOfFeet(4);
        int catnumberOfFeet = cat.getnumberOfFeet();
        
        System.out.println(catnumberOfFeet);
        
        cat.setColor("gray");
        String catColor = cat.getColor();
        
        System.out.println(catColor);
        
        cat.setlaysAnEgg(false);
        boolean catlaysAnEgg = cat.getLaysAnEgg();
        
        System.out.println(catlaysAnEgg);
    }
    
}
