package project;

/**************************************************************************************************
 * Created by: Robert Darrow
 * Date: 9/24/18
 * Description: Driver class for an audio player object.
 **************************************************************************************************/

public class AudioPlayerDriver {

  /**
   * main class for driver.
   * @param args an array of string arguments
   */
  public static void main(String[] args) {
    AudioPlayer ap = new AudioPlayer("Player", "Specification");
    ap.play();
    ap.next();
    ap.previous();
    ap.stop();
    System.out.println(ap.toString());
  }
}
