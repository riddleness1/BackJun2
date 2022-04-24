import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int H = in.nextInt(); // 시
        int M = in.nextInt(); // 분
        int T = in.nextInt();
        in.close();

        if(M+T>59){
            H=H+((M+T)/60);
            M=(M+T)%60;
            if(H>23){
                H=H-24;
            }
        }else {
            M=M+T;
        }
        System.out.println(H+""+M);
    }
}
