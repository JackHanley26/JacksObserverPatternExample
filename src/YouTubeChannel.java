import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel {

    private List<Observer> observerList = new ArrayList<Observer>();
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyAllObservers();
    }

    public void subscribe(Observer observer){
        observerList.add(observer);
    }

    public void notifyAllObservers(){
        for(Observer o:observerList){
           o.update();
        }
    }

}
