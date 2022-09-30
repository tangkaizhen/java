package test;

import java.util.Scanner;

/**
 * @author kaizhen.tang
 * @create 2022-09-28 下午2:24
 */
public class TimeTest {
    public static void main(String[] args) {
        System.out.println("请输入一个正整数");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        int hour = i/3600;
        int h_y = i%3600;
        int minite = h_y/60;
        int m_y = h_y%60;
        String time = "";
        if(hour == 0){
            if(minite == 0){
                time = i+ "秒";
            }else {
                time = minite + "分钟"+ m_y+ "秒";
            }
        }else{
            time = time + hour + "小时" + minite + "分钟"+ m_y+ "秒";
        }
        System.out.println("时间是："+time);
        System.out.println('a'+'c');
    }
}
