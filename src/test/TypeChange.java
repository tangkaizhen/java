package test;

/**
 * @author kaizhen.tang
 * @create 2022-09-28 上午11:17
 */
public class TypeChange {
    public static void main(String[] args) {
        /**
         * 基本类型之间的转换：自动类型转换（从小到大），强制类型转换（从大到小）
         * 自动转换：byte => short => int => long => float => double
         * 强制类型转换：目标类型 目标名 = （目标类型）源变量名
         *
         * 强转有风险，可能造成数据丢失
         */
        byte b1 = 2;
        short s1 = 3;
        b1 = (byte)s1;

    }
}
