public class NewsPublisher {
}
interface NewsPublisher {
    void subscribe(Observer o);
    void unsubscribe(Observer o);
    void publishNews(String category, String news);
}
