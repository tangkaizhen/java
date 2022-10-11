package test;

/**
 * @author kaizhen.tang
 * @create 2022-10-08 下午6:03
 */
public class ForTest2 {
    public static void main(String[] args) {
        /**
         * 判断三位数是不是一个水仙花数
         */
        for (int i = 100;i<=999;i++){
            int ia = i/100;
            int ib = i%100/10;
            int ic = i%10;

            if((ia*ia*ia +ib*ib*ib + ic*ic*ic) == i){
                System.out.println(i);
            }
        }
    }
}
