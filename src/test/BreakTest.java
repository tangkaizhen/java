package test;

import java.util.Scanner;

/**
 * @author kaizhen.tang
 * @create 2022-10-10 下午7:41
 */
public class BreakTest {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner s = new Scanner(System.in);
        // 无线循环 for(;;)
        for(;;){
            System.out.println(""+(flag?"张三":"李四")+"请说");
            String str = s.next();
            if("bye".equals(str)){
                System.out.println("聊天结束");
                // 跳出循环
                break;
            }
            System.out.println((flag?"张三说：":"李四说：")+str+"\n");
            flag = !flag;
        }
    }
}
