package test;

/**
 * @author kaizhen.tang
 * @create 2022-09-28 下午1:49
 */
public class ArithmeticTest {
    public static void main(String[] args) {
        /**
         * 操作运算符：
         * 1，java语言中，两个整数相除时候，结果只保留整数部分，丢弃小数部分。
         * 如果想要保留小数部分，只要确保两个操作数，不都是整数就可以了。
         * 方式一：使用强制类型转换，把其中一个操作数，转变成double类型。
         * 方式二（推荐）：让其中操作数乘以1.0。
         */
        int ia = 2;
        int ib = 3;

        System.out.println((double)ib/ia);
        System.out.println(1.0*ib/ia);
    }
}
