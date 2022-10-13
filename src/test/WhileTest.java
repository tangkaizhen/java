package test;

/**
 * @author kaizhen.tang
 * @create 2022-10-13 下午3:19
 */
public class WhileTest {

    public static void main(String[] args) {
        /**
         * 在小括号，大括号申明的变量，都是局部变量
         *
         * for循环和while循环比较：
         * 1，可以完全互换，但是更推荐for循环
         * 2，while更适合明确循环条件，但是不明确循环次数的场合；for循环更适用循环次数的
         *
         */
        int i = 1;
        while (i<=10){
            System.out.println("i="+(i++));
        }
        /**
         * do-while始终会执行一次
         */
        do {
            System.out.println("进来了");
        }while (false);
    }
}
