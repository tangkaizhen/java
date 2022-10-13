package test;

/**
 * @author kaizhen.tang
 * @create 2022-10-13 下午5:30
 */
public class DoWhileTest {
    public static void main(String[] args) {
        /**
         * do-while始终会执行一次，
         * do-while结尾有个（;）
         * 使用do-while循环，打印1--10之间的整数
         */
        // i是在main方法里面申明的，称为局部变量，其使用的范围是从变量申明开始，一直到方法的结束
        int i = 1;
        do{
            System.out.println("i = " + i++);
        }while (i<=10);
    }
}
