package test;

import java.util.Scanner;

/**
 * @author kaizhen.tang
 * @create 2022-09-28 下午3:20
 */
public class RelationTest {
    public static void main(String[] args) {
        /**
         * 关系运算符：
         */
        System.out.println("请输入一个整数");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        System.out.println("这是一个"+(i<0?"负数":"非负数"));
    }
}
