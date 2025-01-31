import java.util.*;

class Order {
    private int id;
    private String customerName;
    private List<String> items;
    private double totalPrice;

    public Order(int id, String customerName, List<String> items, double totalPrice) {
        this.id = id;
        this.customerName = customerName;
        this.items = items;
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public List<String> getItems() {
        return items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}

public class OrderService {
    private Map<Integer, Order> orderDatabase = new HashMap<>();

    public void addOrder(Order order) {
        if (orderDatabase.containsKey(order.getId())) {
            throw new RuntimeException("Order already exists!");
        }
        orderDatabase.put(order.getId(), order);
    }

    public Order getOrder(int id) {
        return orderDatabase.get(id);
    }

    public void processOrders() {
        for (Integer orderId : orderDatabase.keySet()) {
            Order order = orderDatabase.get(orderId);
            System.out.println("Processing order: " + order.getId());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        OrderService service = new OrderService();
        
        List<String> items = Arrays.asList("Laptop", "Mouse");
        Order order1 = new Order(1, "Alice", items, 1200.50);
        Order order2 = new Order(1, "Bob", Arrays.asList("Keyboard", "Monitor"), 300.75); // Duplicate ID issue

        service.addOrder(order1);
        service.addOrder(order2); // Will cause an exception

        service.processOrders();
    }
}

