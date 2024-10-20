public class NewsSubscriberLaptop {
}
class NewsSubscriberLaptop implements Observer {
    @Override
    public void update(String category, String news) {
        if (category.equals("Science")) {
            System.out.println("Ноутбук получил новости по науке: " + news);
        }
    }
}
