package test;

import java.util.Scanner;

/**
 * @author kaizhen.tang
 * @create 2022-09-30 下午2:41
 */
public class IfSalaryTest {
    public static void main(String[] args) {

        System.out.println("请输入您的薪水：");
        Scanner s = new Scanner(System.in);
        double d = s.nextDouble();
        double saPrice = 0;
        if(d <= 5000){
            System.out.println("您不需要交税");
        }else if(d<=8000){
            saPrice = (d-5000) * 0.03;
        }else  if(d<=17000){
            saPrice = 3000*0.03 + (d-5000-3000)*0.1;
        }
        System.out.println("您需要交税：" + saPrice);
    }
}
