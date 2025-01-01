package model;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOfCustomers {
    private final Queue<Customer> customerQueue;

    public QueueOfCustomers() {
        this.customerQueue = new LinkedList<>();
    }

    public boolean enqueue(Customer customer) {
        return customerQueue.add(customer);
    }


    public Customer dequeue() {
        return customerQueue.poll();
    }

    public boolean isEmpty() {
        return customerQueue.isEmpty();
    }

    public Queue<Customer> getAllCustomers() {
        return customerQueue;
    }
}
