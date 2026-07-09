class OrderProcessor {
    private final Order order;
    private final InvoiceGenerator invoiceGenerator;
    private final NotificationSender notificationSender;

    public OrderProcessor(Order order, InvoiceGenerator invoiceGenerator, NotificationSender notificationSender) {
        this.order = order;
        this.invoiceGenerator = invoiceGenerator;
        this.notificationSender = notificationSender;
    }

    public void processOrder(double price, int quantity, String customerName, String address) {
        order.calculateTotal(price, quantity);
        order.placeOrder(customerName, address);
        invoiceGenerator.generateInvoice("order_123.pdf");
        notificationSender.sendEmailNotification("johndoe@example.com");
    }
}
