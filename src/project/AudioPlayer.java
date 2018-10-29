package project;

/**************************************************************************************************
 * Created by: Robert Darrow
 * Date: 9/24/18
 * Description: subclass of product that implements multimediaControl interface to create
 *              an object representing an audio player.
 **************************************************************************************************/

public class AudioPlayer extends Product implements MultimediaControl {
  String audioSpecification;
  ItemType mediaType = ItemType.AUDIO;

  /**
   * Constructor of project.AudioPlayer class.
   * @param name name of the audio player product
   * @param audioSpecification specification of player audio
   */
  public AudioPlayer(String name, String audioSpecification) {
    super(name); // call the constructor of project.Product to set name
    this.audioSpecification = audioSpecification;
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
   * Displays message indicating moving to the previous song.
   */
  public void previous() {
    System.out.println("Previous");
  }

  /**
   * Displays message indicating moving to the next song.
   */
  public void next() {
    System.out.println("Next");
  }

  /**
   * Returns formatted string displaying details of audio player.
   * @return String details of audio player
   */
  public String toString() {
    return (super.toString()
            + "\nAudio Spec : " + audioSpecification
            + "\nMedia Type : " + mediaType);
  }
}
