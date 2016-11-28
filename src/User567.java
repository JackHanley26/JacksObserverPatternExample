/**
 * Created by jackhanley on 28/11/2016.
 */
public class User567 extends Observer {


    public User567(YouTubeChannel channelType) {
        this.youTubeChannel = channelType;
        this.youTubeChannel.subscribe(this);
    }

    @Override
    public void update() {
        System.out.println("User 567 has received a notification about: "+youTubeChannel.getState());

    }
}
