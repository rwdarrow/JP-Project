package project;

/**************************************************************************************************
 * Created by: Robert Darrow
 * Date: 9/24/18
 * Description: Driver class for a screen object.
 **************************************************************************************************/


public class ScreenDriver {

  /**
   * main class for driver.
   * @param args an array of string arguments
   */
  public static void main(String[] args) {
    Screen s = new Screen("Resolution", 0, 0);
    System.out.println(s.getRefreshRate());
    System.out.println(s.getResolution());
    System.out.println(s.getResponseTime());
    System.out.println(s.toString());
  }
}
