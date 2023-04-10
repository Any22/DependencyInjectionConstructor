/***********************************************************************************************************************
 * IOC was implemented in previous example by providing the register object externally in main class .
 * It solves the solution to tight coupling , but if a class has multiple dependency it will be tedious to manually
 * provide all the dependencies
 * Some external framework that can provide all the required dependencies to the class and mange that at the same time.
 * (Dependency Injection)
 * We will use Spring Framework for dependency injection
 * ********************************************************************************************************************/
package org.example.demo;

public class Main {
    public static void main(String[] args) {

        Register register = new CurrentAccount();
        Customer customer = new Customer(register);

        customer.registerAccount();

    }
}