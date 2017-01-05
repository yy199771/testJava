package twoLessonClass;

/**
 * Created by yy on 17/1/2.
 *
 *
 */
public class Student extends Person{

    public Student(String n, String m){
        super(n);
        major = m;
    }

    @Override
    public String getDescription() {
        return "a student majoring in " + major;
    }
    private String major;
}
