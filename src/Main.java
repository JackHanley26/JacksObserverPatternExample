public class Main {

    public static void main(String[] args) {
        System.out.println("Jacks Observer Pattern example");

        YouTubeChannel youTubeChannel = new YouTubeChannel();

        new User123(youTubeChannel);

        new User567(youTubeChannel);

        youTubeChannel.setState("New Video from Channel X");
        
    }
}
