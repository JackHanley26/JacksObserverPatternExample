
public class User123 extends Observer {

    public User123(YouTubeChannel channelType) {
        this.youTubeChannel = channelType;
        this.youTubeChannel.subscribe(this);
    }

    @Override
    public void update() {
        System.out.println("User 123 has received a notification about: "+youTubeChannel.getState());
    }
}
