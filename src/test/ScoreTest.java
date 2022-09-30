package test;

import java.util.Scanner;

/**
 * @author kaizhen.tang
 * @create 2022-09-30 下午3:08
 */
public class ScoreTest {
    public static void main(String[] args) {
        System.out.println("请输入您的考试成绩：");
        Scanner s = new Scanner(System.in);
        int score = s.nextInt();
        if(score>=90){
            System.out.println("您的等级是A");
        }else if(score>=80){
            System.out.println("您的等级是B");
        }else if(score>=70){
            System.out.println("您的等级是C");
        }else {
            System.out.println("您的等级是D");
        }
    }
}
