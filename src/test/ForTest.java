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
//        for(int i = 1;i<=10;i++){
//            System.out.println("开始玩第"+i+"局！！");
//            Thread.sleep(5000);
//        }
//        for(int i = 0;i<=100;i++){
//            if(i%2 != 0){
//                System.out.println(i);
//            }
//        }
//        System.out.println("----------------------");
//        for (int i = 1;i<100;i+=2){
//            System.out.println(i);
//        }
//        System.out.println("-----------------------");
//        for (int i = 1;i<=50;i++){
//            System.out.println(2*i-1);
//        }
        System.out.println("-------------------------");
        int sum = 0;
        for (int i= 1;i<=10000;i++){
            sum += i;
        }
        System.out.println("累加和是：" + sum);
    }
}
