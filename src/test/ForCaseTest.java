package test;

/**
 * @author kaizhen.tang
 * @create 2022-10-11 上午9:42
 */
public class ForCaseTest {
    public static void main(String[] args) {

//        for (int i = 1;i<=5;i++){
//            for (int a = 1;a<=5;a++){
//                System.out.print("* " +(a == 5?"\n":""));
//            }
//        }
//
//        for (int i = 1;i<=5;i++){
//            for (int a = 1;a<=i;a++){
//                System.out.print("* " +(a == i?"\n":""));
//            }
//        }
//
//        for (int i = 0;i<5;i++){
//            for (int a = 1;a<=(5-i);a++){
//                System.out.print("* " +(a == (5-i)?"\n":""));
//            }
//        }

        for (int i = 0;i<5;i++){
            for (int b = 1;b<=4-i;b++){
                System.out.print(" ");
            }
            for (int a = 1;a<=(2*i+1);a++){
                System.out.print("* " +(a == (2*i+1)?"\n":""));
            }
        }

    }
}
