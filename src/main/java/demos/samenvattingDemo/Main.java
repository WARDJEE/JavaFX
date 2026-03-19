package demos.samenvattingDemo;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("no");
            int a = Integer.parseInt("bla");
            example();
            System.out.println("yes");
        } catch (MyException e) {
            System.out.println("Er liep iets fout");
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("rRGSDFG");
        } catch (NumberFormatException e) {
            System.out.println("nummer verkeerd");
        }
        System.out.println("gdfjgsfdl");
    }

    private static void example() throws MyException {
        Employee employee = new Employee(null);
        if (employee.getName() == null) {
            throw new MyException(employee);
        }
    }
}
