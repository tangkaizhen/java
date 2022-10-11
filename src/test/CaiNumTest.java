package test;

import java.util.Random;
import java.util.Scanner;

/**
 * @author kaizhen.tang
 * @create 2022-10-10 下午8:11
 */
public class CaiNumTest {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(100) + 1;
//        System.out.println("随机数是："+ a);
        Scanner s = new Scanner(System.in);

        int count = 0;
        // 无线循环
        for(;;){
            count++;
            System.out.println("请输入1到100之间的整数");
            int i = s.nextInt();
            if(i > a){
                System.out.println("您输入的数字偏大");
            }else if(i < a){
                System.out.println("您输入的数字偏小");
            }else {
                System.out.println("恭喜你，猜中了");
                break;
            }
        }
        if(count == 1){
            System.out.println("你果然是个大咖");
        }else if(count <= 6){
            System.out.println("水平不错");
        }else{
            System.out.println("你还可以多玩几次游戏");
        }

    }
}
