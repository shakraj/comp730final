/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp730finals;

/**
 *
 * @author shak
 */
public class StarWarsShip extends SpaceShip{
public void getTonnage(){
    

        System.out.println("10000")
}
 public static void main(String args[]){
	SpaceShip obj = new StarWars();
	obj.getTonnage();
    

        }
 public void getName(){
     System.out.println("X wing")
 }
  public static void main(String args[]){
	SpaceShip obj = new StarWars();
	obj.getName();
 
}
  public void getFranchise(){
      System.out.println("Star Wars")
  }
   public static void main(String args[]){
	SpaceShip obj = new StarWars();
	obj.getFranchise();
  
}
}

