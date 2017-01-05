package oneLessonBase;

import java.util.Arrays;

/**
 * Created by yy on 16/12/24.
 */
public class testJavaFor {

    public static void main(String[] args){
        //3.8 控制流程
        //3.8.1 块作用域
        //3.8.2 条件语句
        int target = 100;
        int yourSales = 229;
        double bonus = 0;
        if(yourSales >=2 * target) {
            bonus = 100 * 0.03 * (yourSales - target);
            System.out.println(bonus);
        }else if(yourSales >= 1.5 * target){
            bonus = 100 * 0.02 * (yourSales - target);
            System.out.println(bonus);
        }else if(yourSales >= target){
            bonus = 100 * 0.01 * (yourSales - target);
            System.out.println(bonus);
        }else{
            System.out.println("You are fired!");
        }
        //3.8.3 循环
        while (1 < 2) {
            System.out.println("Hello world!");
            break;
        }
        //3.8.4 确定循环
        for (int i = 1; i<=10; i++){
            System.out.println(i);
        }
        //3.8.5 多重循环
        //switch ()
        // case 1;
        // break;
        //3.8.6 中断控制流程语句
        // break语句：带标签的，放在循环外层，后面使用：。
        //           不带标签的
        //3.9 大数值
        /*
        java.math包中的2个类：
            BigInteger：整数运算；
            BigDecimal：浮点数运算。这2个类可以处理任意长度的数值。
            使用静态valueOf方法可以把普通的数值转换成大数值
            BigInteger i = BigInteger.valueOf(100);
         */
        //3.10 数组
        int[] a;
        int[] b = new int[100];
        for (int i = 0; i <b.length;i++){
            System.out.println(b[i]=i);
        }
        //3.10.1 for each循环

        //3.10.2 数组初始化以及匿名数组
        int[] smallPrimes = {2,3,5,7,11,13};
        int[] anonymous;
        anonymous = smallPrimes;
        //3.10.3 数据拷贝
        /*
            System.arraycopy
         */
        int[] luckyNumbers = {1001,1002,1003,1004,1005,1006,1007};
        System.arraycopy(smallPrimes, 2, luckyNumbers, 3,4);
        for(int i =0; i<luckyNumbers.length;i++){
            System.out.println(i + ":" + luckyNumbers[i]);
        }
        Arrays.sort(luckyNumbers);
        for(int j =0; j<luckyNumbers.length;j++){
            System.out.println(j + ":" + luckyNumbers[j]);
        }

        //3.10.5 数据拷贝
        int[] aa = new int[10000];
        Arrays.sort(aa);
    }
}
