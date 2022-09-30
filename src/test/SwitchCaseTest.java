package test;

import java.util.Scanner;

/**
 * @author kaizhen.tang
 * @create 2022-09-30 下午4:09
 */
public class SwitchCaseTest {
    public static void main(String[] args) {

        System.out.println("\t\t欢迎来到拉钩教育");
        System.out.println("--------------------------------------------");
        System.out.println("\t[1]学员系统\t[2]管理员系统");
        System.out.println("\t[0]退出系统");
        System.out.println("--------------------------------------------");
        System.out.println("请选择要进入的系统：");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        switch (a){
            case 0:
                System.out.println("退出系统");
                break;
            case 1:
                System.out.println("欢迎登录学员系统");
                break;
            case 2:
                System.out.println("欢迎登录管理员系统");
                break;
            default:
                System.out.println("无法识别");
        }
    }
}
