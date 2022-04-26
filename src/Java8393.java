import java.util.Scanner;

public class Java8393 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int sum=0;
        for(int i = 0; i<=A; i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
