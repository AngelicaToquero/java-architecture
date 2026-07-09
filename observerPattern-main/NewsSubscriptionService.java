public class NewsSubscriptionService {

    public static void main(String[] args) {

        NewsAgency newsAgency = new NewsAgency();

        //Subscribers
        Subscriber georgina = new Subscriber("Georgina");
        Subscriber aamir = new Subscriber("Aamir");
        Subscriber luna = new Subscriber("Luna");

        // subscribe to news 
        newsAgency.subscribe(georgina);
        newsAgency.subscribe(aamir);
        newsAgency.subscribe(luna);

        //notify subscribers
        System.out.println("Breaking News!");
        newsAgency.setLatestNews("Elon Musk launch the newest model of tesla!");
        
        System.err.println();
        
        // Unsubscribe
        newsAgency.unsubscribe(luna);

        System.out.println("Hot News!");
        newsAgency.setLatestNews("BTC price surges past $93,000");

    }
}