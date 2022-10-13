package test;

import java.util.Scanner;

/**
 * @author kaizhen.tang
 * @create 2022-10-13 下午3:29
 */
public class WhileCaseTest {
    public static void main(String[] args) {
        /**
         * 使用while 循环计算调和数列的和，并且打印
         *
         */
        Scanner s = new Scanner(System.in);
        System.out.println("请输入任意一个正整数");
        int i = s.nextInt();
        double sum = 0;
        int index = 1;
        while (index <= i){
            sum += 1.0/(index++);
        }
        System.out.println("sum 结果是："+sum);
    }
}
