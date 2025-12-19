public class Restaurant {
    private String name;

    public Restaurant(String name) {
        this.name = name;
    }

    public void printOrder(Order order) {
        System.out.println("Restaurant: " + name);
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Item: " + order.getItem().getName());
        System.out.println("Category: " + order.getItem().getCategory());
        System.out.println("Quantity: " + order.getQuantity());
        System.out.println("Total price: " + order.getTotalPrice());
    }
}
