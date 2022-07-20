package Day1;

/**
 * Test1
 *
 * @Author lhq
 * @Version 1.0
 * 2022/7/1 20:36
 **/
public class Test1 {

    // 对象的this引用

    public void jump() {
        System.out.println("正在执行jump方法");
    }

    public void run() {

        //this.jump(); 这里使用的是省略this的写法
        jump();
        System.out.println("正在执行run方法");
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.run();
    }
}
