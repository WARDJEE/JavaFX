package demos.samenvattingDemo;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println("start");
            //return;
            example();
            System.out.println("end");
        } catch (MyException e) {
            System.out.println("foutje");
            return;
        } finally {
            System.out.println("uiteindelijk");
        }
    }

    private static void example() throws MyException{
        Employee employee = new Employee(null);
        if (employee.getName() == null) {
            throw new MyException(employee);
        }
    }
}
