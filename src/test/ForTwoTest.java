package test;

/**
 * @author kaizhen.tang
 * @create 2022-10-11 上午9:16
 */
public class ForTwoTest {
    public static void main(String[] args) {
        // 输出5行 5列
        for (int i = 1;i<=5;i++){
            for (int a = 1;a<=5;a++){
                System.out.print("你好  " +(a == 5?"\n":""));
            }
        }
    }
}
