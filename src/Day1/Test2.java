package Day1;

/**
 * Test2
 *
 * @Author lhq
 * @Version 1.0
 * 2022/7/1 20:45
 **/
public class Test2 {

    // 演示静态成员不能直接访问非静态成员

    public void info() {
        System.out.println("简单的输出信息方法");
    }

    public static void main(String[] args) {
        // main 因为使用static修饰 故为静态方法
        // info(); -- >   不能从静态上下文中引用非静态方法 'info（）'

        // 如果确实需要访问
        new Test2().info();
    }
}
