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
public class StarTrekShip extends SpaceShip{
public void getTonnage(){
    

        System.out.println("100000")
}
 public static void main(String args[]){
	SpaceShip obj = new StarTrekShip();
	obj.getTonnage();
    

        }
 public void getName(){
     System.out.println("NCC 1701")
 }
  public static void main(String args[]){
	SpaceShip obj = new StarTrekShip();
	obj.getName();
 
}
  public void getFranchise(){
      System.out.println("Star Trek")
  }
   public static void main(String args[]){
	SpaceShip obj = new StarTrekShip();
	obj.getFranchise();
  
}
}


