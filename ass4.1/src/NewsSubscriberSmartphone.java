public class NewsSubscriberSmartphone {
}
class NewsSubscriberSmartphone implements Observer {
    @Override
    public void update(String category, String news) {
        if (category.equals("Sports")) {
            System.out.println("Смартфон получил спортивные новости: " + news);
        }
    }
}
