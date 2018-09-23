public class AudioPlayer extends Product implements MultimediaControl {
    String audioSpecification;
    ItemType mediaType;

    public AudioPlayer(String name, String audioSpecification) {
        super(name);
        this.audioSpecification = audioSpecification;
    }

    public void play() {
        System.out.println("Playing");
    }

    public void stop() {
        System.out.println("Stopping");
    }

    public void previous() {
        System.out.println("Previous");
    }

    public void next() {
        System.out.println("Next");
    }

    public String toString() {
        return (super.toString()  +
                "\nAudio Spec : " + audioSpecification +
                "\nMedia Type : " + mediaType);
    }
}
