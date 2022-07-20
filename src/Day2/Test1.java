package Day2;

/**
 * Test1
 * 数组
 * @Author lhq
 * @Version 1.0
 * 2022/7/11 15:01
 **/
public class Test1 {

    // 数组在堆内存和栈内存的理解

    public static void main(String[] args) {
        // 定义并初始化数组，这里使用静态初始化
        int []a = {1, 2, 33};
        // 定义并初始化数组，这里使用动态初始化
        int []b = new int[4];
        System.out.println("b 的数组长度为: " + b.length);

        for (int i = 0; i < a.length; i ++ ) {
            System.out.println(a[i]);
        }

        for (int i = 0; i < b.length; i ++ ) {
            System.out.println(b[i]);
        }

        b = a;

        System.out.println("b 的数组长度为： " + b.length);

    }
}
