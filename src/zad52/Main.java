/**
 *
 *  @author Rogoziński Michał S10324
 *
 */
package zad52;

import javax.swing.JFrame;

public class Main {
  public static void main(String ... args) {
  
	  // utworzenie instancji okna głównego aplikacji
	  Z52JListDemo mainFrame = new Z52JListDemo();
	  
	  mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
      mainFrame.pack();
      mainFrame.setLocationByPlatform(true);
	  mainFrame.setVisible(true);
	  
  }
}