package demos.jdbcDemo.dao;

import java.util.Set;

public class CustomerManager {
    private CustomerDao customerDao;

    public CustomerManager(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public void addCustomer(String name) {
        Customer customer = new Customer(name);
        customerDao.create(customer);
    }

    public void deleteCustomer(String name) {
        Customer customer = new Customer(name);
        customerDao.delete(customer);
    }

    public void findSimilarNames() {
        Set<Customer> customers = customerDao.retrieveAll();
        for (Customer customer1 : customers) {
            for(Customer customer2 : customers) {
                if (customer1.getId() == customer2.getId()) {
                    continue;
                }
                String name1 = customer1.getName();
                String name2 = customer2.getName();
                char char1 = name1.charAt(0);
                char char2 = name2.charAt(0);
                if (name1.length() == name2.length() && char1 == char2) {
                    System.out.printf("Customer %s and customer %s seem similar.%n", customer1, customer2);
                }
            }
        }
    }
}
