package Day2;

/**
 * PrimiitiveTransferTest
 * 基本类型的参数传递
 * @Author lhq
 * @Version 1.0
 * 2022/7/11 15:30
 **/
public class PrimitiveTransferTest {

    // 系统产生两个栈区， main栈区指向swap栈区

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("swap方法里a: " + a + ",b " + b );
    }

    public static void main(String[] args) {
        int a = 6;
        int b = 9;
        swap(a, b);
        System.out.println("交换结束后，main方法里a: " + a + ",b " + b );
    }
}
