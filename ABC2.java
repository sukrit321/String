import java.util.Scanner;

public class ABC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int n = text.length();
        int num = 0;
        int cnt = 0;
        int c = 0;
        int g = 0;
        boolean a = false;
        for(int i = 1; i < n - 1; i++){
            //System.out.print((int) text.charAt(i) + " ");
            // System.out.println((int) text.charAt(i + 1) + 1);
            if((int) text.charAt(i) - 1 == (int) text.charAt(i - 1) && (int) text.charAt(i) + 1 == (int) text.charAt(i + 1)){
                cnt++;
                a = true;
            }
            if(a == true && g == 0){
                c = i;
                g++;
            }

            System.out.println("a " + cnt + " " + c);
            
        }
        if(cnt == 0){
            c = -1;
        }
        System.out.println(cnt);
        System.out.println(c);
    }
}
