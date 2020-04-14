package functionalPackage;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hi! " + customer.name + ". Your registered phone number is - " + customer.phoneNumber);
    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) -> System.out.println("Hi! " + customer.name + ". Your registered phone number is - " + (showPhoneNumber ? customer.phoneNumber : "******"));

    public static void main(String[] args) {
        // Normal way
        Customer maria = new Customer("Maria", "823489749");

        greetCustomer(maria);
        greetCustomerV2(maria, false);
        // functional programming
        greetCustomerConsumer.accept(maria);
        greetCustomerConsumerV2.accept(maria, true);
        greetCustomerConsumerV2.accept(maria, false);

    }

    static void greetCustomer(Customer customer) {
        System.out.println("Hi! " + customer.name + ". Your registered phone number is - " + customer.phoneNumber);
    }

    static void greetCustomerV2(Customer customer, boolean showPhoneNumber) {
        if (showPhoneNumber) {
            System.out.println("Hi! " + customer.name + ". Your registered phone number is - " + customer.phoneNumber);
        } else {
            System.out.println("Hi! " + customer.name + ". Your registered phone number is ******* ");
        }
    }

    static class Customer {
        private final String name;
        private final String phoneNumber;

        public Customer(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
    }
}
