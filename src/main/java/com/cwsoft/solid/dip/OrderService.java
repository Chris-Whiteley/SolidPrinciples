package com.cwsoft.solid.dip;

/**
 * Now, the OrderService class depends on the Storage abstraction rather than the Database concrete
 * implementation. You can easily switch to a different storage method (like FileStorage) without
 * changing the OrderService class.
 *
 * Benefits of DIP:
 * Flexibility: Easily change implementations without affecting other parts of the system.
 * Testability: Can mock or stub the abstraction in unit tests.
 * Decoupling: Reduces tight coupling between components, making the code easier to maintain
 * and extend.
 */
class OrderService {
    private final Storage storage;

    public OrderService(Storage storage) {
        this.storage = storage;  // depends on abstraction (interface), not on a specific implementation
    }

    public void processOrder(Order order) {
        // some logic
        storage.saveOrder(order);  // now flexible to any storage type
    }
}
