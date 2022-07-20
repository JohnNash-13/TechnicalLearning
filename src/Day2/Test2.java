package Day2;

/**
 * Test2
 * 数组
 * @Author lhq
 * @Version 1.0
 * 2022/7/11 15:11
 **/
public class Test2 {

    // 基本类型数组的初始化

    public static void main(String[] args) {
        // 定义并初始化数组， 这里使用动态初始化数组的方法
        int []Array = new int[5];

        for (int i = 0; i < Array.length; i ++ ) {
            Array[i] = i + 2;
        }

        for (int i = 0; i < Array.length; i ++ ) {
            System.out.println(Array[i]);
        }

    }
}
