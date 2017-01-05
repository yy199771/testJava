package oneLessonBase;

/**
 * Created by yy on 16/12/25.
 */
public class oneLessonHomeWorkTwo {
    public static void main(String[] args) {
        //1.水仙花
        int n;
        for (n = 100; n < 1000; n++) {
            int i = n / 100;          //解析出百分位
            int j = n / 10 % 10;        //解析出十分位
            int k = n % 10;           //解析出个位
            if (n == i * i * i + j * j * j + k * k * k) {
                System.out.println("水仙花数是：" + n);
            }
        }
    }
}
