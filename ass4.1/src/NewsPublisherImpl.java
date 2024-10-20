
    public void publishNews(String sports, String s) {
    }
}
import java.util.ArrayList;
import java.util.List;

class NewsPublisherImpl implements NewsPublisher {
    private List<Observer> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Observer o) {
        subscribers.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        subscribers.remove(o);
    }

    @Override
    public void publishNews(String category, String news) {
        for (Observer o : subscribers) {
            o.update(category, news);
        }
    }
}
