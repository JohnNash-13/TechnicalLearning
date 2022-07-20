package Day2;

/**
 * Test3
 * 数组
 * @Author lhq
 * @Version 1.0
 * 2022/7/11 15:16
 **/
public class Test3 {

    // 引用类型数组的初始化

    public static void main(String[] args) {
        Person[] student = new Person[2];
        Person zhang = new Person();
        zhang.age = 21;
        zhang.height = 172;
        Person li = new Person();
        li.age = 22;
        li.height = 177;
        student[0] = zhang;
        student[1] = li;

        // li 和 student[1] 指向同一个堆内存
        li.info();
        student[1].info();
    }
}
