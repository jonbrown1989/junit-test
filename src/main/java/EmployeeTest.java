public class EmployeeTest {
    public static void main(String[] args) {

        Employee myEmployee = new Employee("Jon", "Brown", 10000);
        Employee myEmployee2 = new Employee("Ron", "White", 3000);

        System.out.printf("Employee name: %s%n", myEmployee.getFirstName()+" "+myEmployee.getLastName());
        System.out.printf("Employee yearly salary: %s%n", (myEmployee.getSalary()*12));
        System.out.printf("Employee yearly salary with 10 percent raise: %s%n", (myEmployee.giveRaise(10)*12));

        System.out.printf("%n%nEmployee name: %s%n", myEmployee2.getFirstName()+" "+myEmployee2.getLastName());
        System.out.printf("Employee yearly salary: %s%n", myEmployee2.getSalary()*12);
        System.out.printf("Employee yearly salary with 10 percent raise: %s%n", (myEmployee2.giveRaise(10)*12));

    }
}
