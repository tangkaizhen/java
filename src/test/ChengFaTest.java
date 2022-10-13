package test;

/**
 * @author kaizhen.tang
 * @create 2022-10-13 下午1:57
 */
public class ChengFaTest {
    /**
     * 打印99乘法口诀表
     *
     */
    public static void main(String[] args) {
        outter:for (int i = 1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(j*i)+" ");
                if(j == 6){
                    // break只能跳出当前的循环，不能跳出多重循环
                    // 如果要退出多重循环，需要使用标号的形式
                    break outter;
                }
            }
            System.out.println("\n");
        }
    }
}
