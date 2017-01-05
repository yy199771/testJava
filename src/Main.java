import sun.jvm.hotspot.code.PCDesc;

public class Main {
    //定义在main方法的外部。
    public static final double CM_PER_INCH_S = 10.324;

    public static void main(String[] args) {
        // 基本数据类型
        // 整型：4个
        int i = 10;
        long l = 100000;
        short s = 1;
        byte b = 1;
        System.out.println(i);
        System.out.println(l);
        System.out.println(s);
        System.out.println(b);
        // 浮点型：2个
        /*
            3个特殊的浮点型：正无穷大，负无穷大，NaN
         */
        float f = 0.01F;
        double d = 0.00001;
        System.out.println(f);
        System.out.println(d);
        // char类型：
        // boolean类型
        boolean bb = true;
        System.out.println(bb);

        //变量
        /*
        1、初始化变量
         */

        /*
        常量：关键字final
            某个常量可以在一个类中的多个方法中使用，通常称为类常量，使用static final设置一个类常量。
         */
        final double CM_PER_INCH = 2.54;
        System.out.println(CM_PER_INCH);
        System.out.println(CM_PER_INCH_S);

        //运算符
        /*
        1、自增运算符与自减运算符
         */
        int m = 7;
        int n = 7;
        int a2 = 2 * ++m;
        int b2 = 2 * n++;
        System.out.println(a2);
        System.out.println(b2);
        /*
        2、关系运算符与boolean运算符
        ==;
        !=
        < > <= >=
        &&与 ||或 !非
        三元运算符：?:  当条件为真时，执行表达式1，否则执行2.
        */
        int x2 = 10;
        int y2 = 20;
        int aaa= (x2 < y2 ? x2:y2);
        System.out.println(aaa);

        /*
        3、数学函数与常量
            Math类
         */
        double x3 = 4;
        double y3 = Math.sqrt(x3);
        double z3 = Math.pow(x3,2);
        System.out.println(y3);
        System.out.println(z3);
        /*
        4、数值类型之间的转换
         */
        int n4 = 123456789;
        float yy4 = (float)n4;
        float f4 = n4;
        System.out.println(f4);

        //3.6 字符串：就是Unicode字符序列。
        /*3.6.1
        字符串由char值序列组成。
         */
        String e ="";
        String greeting = "Hello";
        int n6 = greeting.length();
        System.out.println(n6);
        //3.6.2 子串 String的substring方法
        String s6 = greeting.substring(0,3);
        System.out.println(s6);
        //3.6.3 字符串编辑: 不可变字符串，可以通过修改字符串变量greeting的内容来解决问题。
        String greeting2 = greeting.substring(0,3) + "p!";
        System.out.println(greeting2);
        //3.6.4 拼接 当将一个字符串与一个非字符串的值进行拼接时，后者被转换成字符串。
        String expletive = "Expletive";
        String PG13 = "deleted";
        String message = expletive + PG13;
        System.out.println(message);
        int age = 13;
        String rating = "PC" + age;
        System.out.println(rating);
        //3.6.5 检测字符串是否相等:一定使用equals方法
        if (message.equals("Expletivedeleted")){
            System.out.println("True");
        }else{
            System.out.println("False");
        }


    }

}
