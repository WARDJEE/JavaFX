package demos.jdbcDemo.dao;

public class Customer {
    private int id;
    private final String name;

    public Customer(String name) {
        this.id = -1;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + "(" + id + ")";
    }
}
