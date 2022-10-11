package test;

/**
 * @author kaizhen.tang
 * @create 2022-10-08 下午6:14
 */
public class ContinueTest {
    /**
     * continue:用在循环中，表示结束本次循环，开始下一次循环
     * break:用户退出当前语句块，如果用于循环体中用于跳出循环
     */
    public static void main(String[] args) {
        for(int i=1;i<=20;i++){
            if(i%5 == 0){
                continue;
            }else {
                System.out.println("i = " + i);
            }
        }
    }
}
