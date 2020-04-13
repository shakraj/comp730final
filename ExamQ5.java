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
 class Singleton {
    private static  Singleton pat;
    public String newstr;
    private Singleton()
    {
        newstr = " has a joke in it";
    }
    public static Singleton getInstance()
    {
        if (pat == null) 
            pat = new Singleton(); 
  
        return pat;  
    }            
 class ExamQ5  
  {
      public static void main(String[] args);
      {
          Singleton newsing = Singleton.getInstance();
          System.out.println("String from x is " + newsing.newstr);
          
      }
  }
}
