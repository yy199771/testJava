package oneLessonBase;

import java.util.Arrays;

/**
 * Created by yy on 16/12/25.
 */
public class oneLessonHomeWork {
    public static void main(String[] args) {
        //2 请将这个字符串的每一个字符存放数组中，并且对该数组正序排序然后打印出来
        String str = "182402749027471";
        char[] strArray = str.toCharArray();    //存放到数组中。
        Arrays.sort(strArray);                  //正序排列。
        for (int i = 0; i < strArray.length; i++) {    //打印输出。
            System.out.println(i + ":" + strArray[i]);
        }

        //3.1
        String s_31 = "jdk";
        System.out.println(s_31.toUpperCase());
        System.out.println(s_31.toUpperCase().substring(1, 3));

        //3.2
        String s_32 = "test";
        String str_32_Array = "";
        for (int j = s_32.length() - 1; j >= 0; j--) {
            str_32_Array += s_32.charAt(j);     //返回指定索引处的char值。
        }
        System.out.println(str_32_Array);

        //3.3
        String s_33 = "113@ ere qqq yyui";
        String[] s_33_array = s_33.split(" ");  //先按空格切割，放到一个字符串数组中。
        for (int k = 0; k < s_33_array.length; k++) {
            System.out.println(k + ":" + s_33_array[k]);
        }

        //3.4
        String s_34 = "To be or not to be";
        String[] s_34_array = s_34.split(" ");
        String s_34_recover = "";
        for (int l = 0; l < s_34_array.length; l++) {
            //System.out.println(l + ": " + s_34_array[l]);
            for (int m = s_34_array[l].length() - 1; m >= 0; m--) {
                s_34_recover += s_34_array[l].charAt(m);
            }
            s_34_recover = s_34_recover + " ";  //将字符串数组中的每个值和空格拼接起来。
        }
        System.out.println(s_34_recover);
    }


}
