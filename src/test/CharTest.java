package test;

/**
 * @author kaizhen.tang
 * @create 2022-09-28 上午10:37
 */
public class CharTest {
    public static void main(String[] args) {
        /**
         * 1,因为计算机底层只识别0，1,但是char类型没法满足这个要求，所以就出现ASCLL，其就是字符和数字一一对应，存储对应的数字，就是存储对应的字符
         * 2,但是ASCLL只是针对英文字母等，只局限于美国使用，其他国家无法使用，估计产生Unicode，其包含ASCLL，是其衍生
         *
         */
        char a1 = 'a';

        System.out.println("a1 = " + a1);
        System.out.println("a1的编码 = " + (int)a1);

        System.out.println("=====================>");
        char a2 = 98;
        System.out.println(a2);
    }
}
