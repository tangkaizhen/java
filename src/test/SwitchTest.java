package test;

import java.util.Scanner;

/**
 * @author kaizhen.tang
 * @create 2022-09-30 下午3:31
 */
public class SwitchTest {

    public static void main(String[] args) {
        System.out.println("请输入您的成绩：");
        Scanner s = new Scanner(System.in);
        int score = s.nextInt();
        switch (score/10){
            case 10:
                System.out.println("恭喜，您满分");
                break;
            case 9:
                System.out.println("恭喜，您是90多");
                break;
            case 8:
                System.out.println("恭喜，您是80多");
                break;
            case 7:
                System.out.println("恭喜，您是70多");
                break;
            case 6:
                System.out.println("恭喜，您是60多");
                break;
            default:
                System.out.println("不及格");
        }
    }
}
