/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;


public class AnimalBp {
    String type;
    int numberOfFeet;
    String color;
    boolean egg;
    private boolean laysAnEgg;
    
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public void setnumberOfFeet(int n){
        this.numberOfFeet = n;
        
    }
    public int getnumberOfFeet(){
        return numberOfFeet;
    }
    
    public void setColor(String color){                 
        this.color = color;   
    }
     public String getColor(){
         return color;     
    }
     public void setlaysAnEgg(boolean laysAnEgg){
         this.laysAnEgg = laysAnEgg;
    }
     public boolean getLaysAnEgg(){
         return laysAnEgg;
    }
    
    
    
}

