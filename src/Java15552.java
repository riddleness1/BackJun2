import java.awt.*;
import java.util.Scanner;

public class Java15552 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();

        List eee = new List();

        for(int i = 0 ; i<A; i++){
            int N1 = in.nextInt();
            int N2 = in.nextInt();
            eee.add(N1+N2+"");
        }
        for(int i = 0; i<=eee.getRows();i++){
            System.out.println(eee.getItem(i));
        }
    }
}
