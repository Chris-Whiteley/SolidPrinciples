package com.cwsoft.not_so_solid.dip;

/**
 * In this example, the OrderService class is directly dependent on the Database class (a low-level module).
 * If we wanted to change how the data is stored (e.g., switch to a file-based storage or an external API), we’d have
 * to modify the OrderService class, which violates the DIP.
 */
class OrderService {
    private final Database database = new Database();  // direct dependency on the concrete Database class

    public void processOrder(Order order) {
        // some logic
        database.saveOrder(order);  // tightly coupled to the Database class
    }
}