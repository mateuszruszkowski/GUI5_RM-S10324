/**
 *
 *  @author Rogoziński Michał S10324
 *
 */
package zad53;

import javax.swing.JFrame;


public class Main {
  public static void main(String ... args) {
  
	  Z53JTableDemo mainFrame = new Z53JTableDemo();
	  
	  mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
      mainFrame.pack();
      mainFrame.setLocationByPlatform(true);
	  mainFrame.setVisible(true);
	  
  }
}