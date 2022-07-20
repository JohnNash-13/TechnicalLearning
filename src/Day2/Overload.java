package Day2;

/**
 * Overload
 * 方法重载
 * @Author lhq
 * @Version 1.0
 * 2022/7/11 15:59
 **/
public class Overload {
    // 重载要求：两同一不同 即方法名相同即可
    // 一般不推荐可变参数重载

    public void test() {
        System.out.println("无参");
    }

    public void test(String name) {
        System.out.println("有参 " + name);
    }

    public static void main(String[] args) {
        Overload overload = new Overload();
        overload.test();
        overload.test("无敌");
    }
}
