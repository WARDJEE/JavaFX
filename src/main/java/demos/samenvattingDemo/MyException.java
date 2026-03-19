package demos.samenvattingDemo;

public class MyException extends RuntimeException {
    private Employee employee;

    public MyException(Employee employee) {
        super("Een foutje bij werknemer "
                + employee.getName() + "...");
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }
}
