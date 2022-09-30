package test;

import java.util.Scanner;

/**
 * @author kaizhen.tang
 * @create 2022-09-28 下午8:31
 */
public class BranchTest {
    public static void main(String[] args) {

        System.out.println("请输入您的考试成绩");
        Scanner s = new Scanner(System.in);
        int score = s.nextInt();
        if(score >= 60){
            System.out.println("恭喜，及格了");
        }else {
            System.out.println("很抱歉，没有通过");
        }
        if(score < 0){
            System.out.println("该整数是个负数");
        }else {
            System.out.println("该整数是个非负数");
        }
    }
}
