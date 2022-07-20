package Day2;

/**
 * ReferenceTransferTest
 * 引用类型的参数传递
 * @Author lhq
 * @Version 1.0
 * 2022/7/11 15:35
 **/
public class ReferenceTransferTest {

    public static void swap(DataWrap dataWrap) {
        int temp = dataWrap.a;
        dataWrap.a = dataWrap.b;
        dataWrap.b = temp;
        System.out.println("swap方法里面，a成员变量的值为： " + dataWrap.a
            + ",b成员变量的值为： " + dataWrap.b);
    }

    public static void main(String[] args) {
        DataWrap dataWrap = new DataWrap();
        dataWrap.a = 6;
        dataWrap.b = 9;

        // 不折不扣的值传递方式
        swap(dataWrap);
        System.out.println("交换结束后，a成员变量的值为： " + dataWrap.a
                + ",b成员变量的值为： " + dataWrap.b);
    }
}
