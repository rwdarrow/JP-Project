package project;

/**************************************************************************************************
 * Created by: Robert Darrow
 * Date: 9/24/18
 * Description: Driver class demonstrating multimedia control interface as used in multiple objects.
 **************************************************************************************************/

public class MultiMediaControlDriver {

  /**
   * main class for driver.
   * @param args an array of string arguments.
   */
  public static void main(String[] args) {
    AudioPlayer ap = new AudioPlayer("Audio Player", "Specification");
    MoviePlayer mp = new MoviePlayer("Movie Player", new Screen("Resolution", 0, 0),
        MonitorType.LCD);

    ap.stop();
    mp.stop();

    ap.next();
    mp.next();

    ap.previous();
    mp.previous();

    ap.stop();
    mp.stop();
  }
}
