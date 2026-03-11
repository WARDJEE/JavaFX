package demos.jdbcDemo.dao;

public class Main {
    public static void main(String[] args) {
        CustomerDao customerDao = new CustomerDao();
        CustomerManager customerManager = new CustomerManager(customerDao);

        customerManager.addCustomer("Kris");
        customerManager.addCustomer("Noam");
        customerManager.addCustomer("Sarah");
        customerManager.addCustomer("Kras");
        customerManager.addCustomer("Carmen");

        customerManager.findSimilarNames();

        customerDao.close();
    }
}
