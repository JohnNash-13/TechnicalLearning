package Day2;

/**
 * Recursive
 * 递归方法
 * @Author lhq
 * @Version 1.0
 * 2022/7/11 15:52
 **/
public class Recursive {
    // 经典问题 斐波那契数列

    public static int fn(int n) {
        if(n == 0) {
            return 1;
        }
        else if(n == 1) {
            return 4;
        }
        else {
            return 2 * fn(n - 1) + 2 * fn(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fn(10));
    }
}
