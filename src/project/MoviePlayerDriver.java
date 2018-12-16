package project;

/**************************************************************************************************
 * Created by: Robert Darrow
 * Date: 9/24/18
 * Description: Driver class for a movie player object.
 **************************************************************************************************/


public class MoviePlayerDriver {

  /**
   * main class for driver.
   * @param args an array of string arguments
   */
  public static void main(String[] args) {
    MoviePlayer mp = new MoviePlayer("Movie Player", new Screen("Resolution", 0, 0),
        MonitorType.LCD);
    mp.play();
    mp.next();
    mp.previous();
    mp.stop();
    System.out.println(mp.toString());
  }
}
