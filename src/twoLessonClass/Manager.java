package twoLessonClass;

/**
 * Created by yy on 17/1/2.
 * 继承：is-a
 * 多态:
 *  1、子类数组的引用可以转换成超类数组的引用，而不需要采用强制类型转换。
 *  2、子类重写超类方法时，子类方法不能低于超类的方法的可见性。
 *  3、阻止继承：
 *      final类：此类无法被其他类继承。
 *      final方法：此方法无法被子类重写。
 *  抽象类：
 *      1、abstract，就不需要实现这个方法了。
 *      2、包含一个或多个抽象方法的类本身必须被声明为抽象的。
 *      3、抽象类不能被实例化，但是可以创建一个具体子类的对象。需要注意，可以定义一个抽象类的对象变量，但是它只能引用非抽象子类的对象。
 *          例如：Person p = new Student("Vince Vu", "Econmoics");
 * 5.1.7 受保护的访问：
 *      protected：希望超类中的某些方法允许被子类访问，而不允许被其他类访问。
 *      受保护的方法可能更具有实际意义。
 */
public class Manager extends Employee {

    public Manager(String n, double s, int year, int month, int day) {
        super(n, s, year, month, day);
        bonus = 0;
    }

    public void setBonus(double b){
        bonus = b;
    }
    private double bonus;

    public double getSalary(){
        //不能直接调用超类的私有属性，需要先调用超类的公有方法来获取到私有属性。
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }
}
