public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3","beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
    }
}