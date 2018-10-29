package project;

/**************************************************************************************************
 * Created by: Robert Darrow
 * Date: 9/24/18
 * Description: Driver class demonstrating multimedia control interface as used in multiple objects
 **************************************************************************************************/

public class MultiMediaControlDriver {
  public static void main(String[] args) {
    AudioPlayer ap = new AudioPlayer("Audio Player", "Specification");
    MoviePlayer mp = new MoviePlayer("Movie Player", new Screen("Resolution", 0, 0),
        MonitorType.LCD);
    ap.stop();
    ap.next();
    ap.previous();
    ap.stop();
    mp.stop();
    mp.next();
    mp.previous();
    mp.stop();
  }
}
