/**
 * Test
 *
 * @Author lhq
 * @Version 1.0
 * 2022/6/25 11:15
 **/
public class Test {

    // 浅谈面向对象思想
    // 1. 封装 继承 多态
    // 2. 对象 引用 指针

    public String name;
    public int age;

    public void say(String content) {
        System.out.println( content );
    }

    public static void main(String[] args) {

        // test只是一个引用变量  实际的对象是Test对象
        // 引用变量存放的只是一个引用，指向的确是实际的对象
        Test test = new Test();
        test.name = "lhq";
        test.say("其实呢，Java并不容易。");
        System.out.println(test.name);

    }

}


