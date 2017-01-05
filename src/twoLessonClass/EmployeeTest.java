package twoLessonClass;

/**
 * Created by yy on 16/12/29.
 */
public class EmployeeTest {
    public static void main(String[] args){
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Cracker",1001.2,2016,12,1 );
        staff[1] = new Employee("Harry Hacker",999.2,2016,11,3 );
        staff[2] = new Employee("Tony Tester",883.2,2016,10,11 );

        for(Employee e : staff){
            e.raiseSalary(5);
        }

        for(Employee e : staff){
            System.out.println("name = " + e.getName() + ", salary = " + e.getSalary() + ", hireDay = " + e.getHireDay());
        }

    }
}
