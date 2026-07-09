public class OrderTest {
    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor(new OrderAction(), new InvoiceGeneratorUtilizer(), new NotificationSenderUtilizer());
        orderProcessor.processOrder(10.0, 2, "John Doe", "123 Main St");
    }
}