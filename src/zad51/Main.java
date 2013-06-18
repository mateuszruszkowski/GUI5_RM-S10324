/**
 *
 *  @author Rogoziński Michał S10324
 *
 *  Treść zadania:
 *  Stworzyć JListę, pokazująca informacje o temperaaturze w postaci:
 *  k stopni C = f stopni F
 *  
 *  gdzie k zmienia się od -70 do +60.
 *  
 *  Uwaga: nie wolno używać tablic ani kolekcji. 
 *
 */
package zad51;

import javax.swing.JFrame;


public class Main {
  public static void main(String ... args) {
  
	  // utworzenie instancji okna głównego aplikacji
	  Z51CelsiusFahrenheitJList mainFrame = new Z51CelsiusFahrenheitJList();
	  
	  mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
      mainFrame.pack();
      mainFrame.setLocationByPlatform(true);
	  mainFrame.setVisible(true);
	  
	  

	  
  }
}