package test;

/**
 * @author kaizhen.tang
 * @create 2022-09-30 下午4:30
 */
public class ForTest {
    public static void main(String[] args) throws Exception {
        /**
         * for循环：
         *
         */
        for(int i = 1;i<=10;i++){
            System.out.println("开始玩第"+i+"局！！");
            Thread.sleep(5000);
        }
    }
}
