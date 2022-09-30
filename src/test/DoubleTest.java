package test;
/**
 *
 */
public class DoubleTest {
    public static void main(String[] args) {
        //直接量 字面量
        //float（占4个字节，有效7位）和double（占8个字节，有效15位） 默认使用double
        //float和double在运算时候，可能会有误差；如果希望实现精确运算，需要借助java.math.BigDecimal类型
        float f1 = 3.1415926f;
        double f2 = 3.1415926;
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
    }
}
