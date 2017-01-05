package twoLessonClass;

/**
 * Created by yy on 17/1/2.
 */
abstract class Person {
    public Person(String n){
        name = n;
    }
    public abstract String getDescription();

    public String getName(){
        return name;
    }
    private String name;
}
