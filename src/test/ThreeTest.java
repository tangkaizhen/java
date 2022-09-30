package test;

import java.util.Scanner;

/**
 * @author kaizhen.tang
 * @create 2022-09-28 下午7:24
 */
public class ThreeTest {
    public static void main(String[] args) {
        System.out.println("请输入两个整数：");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("较大的值是："+(a>b?a:b));
    }
}
