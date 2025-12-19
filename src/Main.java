
public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("ZHAN's");
        MenuItem steak = new MenuItem("Beef steak", 6500, "Main dish");
        MenuItem juice = new MenuItem("Orange Juice", 1800, "Drink");
        MenuItem cake = new MenuItem("Cheesecake", 2200, "Dessert");

        Order order1 = new Order(1, steak, 1);
        Order order2 = new Order(2, cake, 2);

        restaurant.printOrder(order1);
        restaurant.printOrder(order2);

        double totalAmount=order1.getTotalPrice() + order2.getTotalPrice();
        System.out.println("Total amount: " + totalAmount + "KZT");
    }
}
