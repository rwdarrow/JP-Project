package project;

/**************************************************************************************************
 * Created by: Robert Darrow
 * Date: 9/24/18
 * Description: Class implementing MultiMedia control and extends product to describe a movie player
 **************************************************************************************************/


public class MoviePlayer extends Product implements MultimediaControl {
  MonitorType monitorType;
  Screen screenType;

  /**
   * Constructor of project.MoviePlayer class.
   * @param name name of the movie player product
   * @param screenType the type of screen of the player
   * @param monitorType the type of monitor of the player
   */
  public MoviePlayer(String name, Screen screenType, MonitorType monitorType) {
    super(name);
    this.screenType = screenType;
    this.monitorType = monitorType;
  }

  /**
   * Displays messaging indicating device is playing.
   */
  public void play() { System.out.println("Playing"); }

  /**
   * Displaying message indicating device is stopping.
   */
  public void stop() {
    System.out.println("Stopping");
  }

  /**
   * Displays message indicating moving to the previous movie.
   */
  public void previous() {
    System.out.println("Previous");
  }

  /**
   * Displays message indicating moving to the next movie.
   */
  public void next() {
    System.out.println("Next");
  }

  /**
   * Returns formatted string displaying details of movie player.
   * @return String details of movie player
   */
  public String toString() {
    return (super.toString() + "\nScreen : "
        + screenType.toString()
        + "\nMonitor Type : " + monitorType);
  }
}
