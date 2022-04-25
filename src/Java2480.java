import java.util.Scanner;

//주사위던지기
public class Java2480 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int H = in.nextInt(); // 시
        int M = in.nextInt(); // 분
        int T = in.nextInt();
        in.close();

        if(H==M &&M==T){
            System.out.println(10000+(H*1000));
        }else if(H-M==0 && H!=T){
            System.out.println(1000+(H*100));
        }else if(H-T==0 && H!=M){
            System.out.println(1000+(H*100));
        }else if(T-M==0 && T!=H){
            System.out.println(1000+(T*100));
        }else if(H!=M && H!=T){
            int max = 0;
            int data[] = {H,M,T};
            for(int i =0; i<data.length; i++){
                if(data[i]>max){
                    max=data[i];
                };
            }
            System.out.println(max*100);
        }
    }
}
