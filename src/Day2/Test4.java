package Day2;

/**
 * Test4
 * 形参个数可变的方法
 * @Author lhq
 * @Version 1.0
 * 2022/7/11 15:48
 **/
public class Test4 {
    public static void test(int a, String... books) {
        // 当使用形参可变的时候，该参数被当成数组进行处理 且个数可变参数放在最后
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        test(3, "语文", "数学", "英语");
    }
}
