package twoLessonClass;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by yy on 16/12/29.
 * 4.6.4 类的重载
 * 4.7 包：
 *    2、静态导入import static java.lang.System.*
 *    3、将类放入包中：
 * 4.8 注释
 *    4.8.3 方法注释：
    @param variable description
    @return description
    @throws class description
        4.8.5 通用注释
            @author name
            @version text
            @deprecated text
            @deprecated Use

 **/
class Employee extends Person{

    private String name;
    private double salary;
    private Date hireDay;
    //静态常量
    public static final double PI = 3.1415926;
    //final：不可改变 关键字
    private final int age = 0;
    //静态(域)：属于类，不属于对象。
    private static int nextId = 1;

    //构造方法
    public Employee(String n, double s, int year, int month, int day){
        super(n);
        //name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month-1,day);
        hireDay = calendar.getTime();
    }

    /*
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    */
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }
    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }
    @Override
    public String getDescription(){
        return String.format("an employee with a salary of %.2f", salary);
    }

    public void setId(){
        int id = nextId;
        nextId++;
    }
    //静态方法
    public static int getNextId(){
        return nextId;
    }

}



