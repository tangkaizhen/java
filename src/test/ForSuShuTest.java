package test;

/**
 * @author kaizhen.tang
 * @create 2022-10-13 下午2:21
 */
public class ForSuShuTest {
    public static void main(String[] args) {
        /**
         * 使用双重for循环，打印2~100之间的所有素数
         * 当一个数只能被1和它本身整除时候，这个数就做素数
         */
        for(int i = 2;i<=100;i++){
            boolean flag = true;
            for(int j=2;j<i;j++){
                if(i%j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                //说明只被整除了两次,这个数就是素数
                System.out.println(i);
            }
        }
    }
}
