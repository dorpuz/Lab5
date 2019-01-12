import java.awt.*;

public class Test {
    public static void main(String[] args) {
        Integer i = 1;
        System.out.println(i.toString());
        System.out.println(i);

        System.out.println("************");

        Point point = new Point(2,5);
        System.out.println(point.toString());
        System.out.println(point);

        System.out.println("************");

        Employee employee = new Employee("Tomek",28,5000);
        System.out.println(employee.toString());

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Jan", 18,3000);
        employees[1] = new Employee("Eryk", 24,4000);
        employees[2] = new Employee("Ola", 32,5000);
        employees[3] = new Employee("Ilona", 39,5500);
        employees[4] = new Employee("Janusz", 78,12000);

        for (int j = 0; j < employees.length; j++) {
            System.out.println(employees[j]);
        }
//
//        for (Employee employee : employees){
//            System.out.println(employee);
//        }

        System.out.println("************");

        Product product = new Product("Mleko", 2.89);
        System.out.println(product);

        System.out.println("************");


    }
}
