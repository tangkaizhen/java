package test;

import java.util.Scanner;

/**
 * @author kaizhen.tang
 * @create 2022-10-13 下午4:47
 */
public class WhileCaseTestTwo {
    public static void main(String[] args) {
        /**
         * 提示用户输入一个正整数，然后反向输出
         */
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int i = s.nextInt();
        int res = 0;
        int temp = i;
        while (temp >0){
            res =res*10 + temp % 10;
            temp /=10;
        }
        System.out.println(res);
    }
}
