import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements NewsAgencySubject {

    private List<Subscriber> subscribers;
    private String latestNews;

    public NewsAgency() {
        this.subscribers = new ArrayList<>();
    }

    public void setLatestNews(String news) {
        this.latestNews = news;
        notifySubscribers(); 
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.updateNews(latestNews);
        }
    }
}