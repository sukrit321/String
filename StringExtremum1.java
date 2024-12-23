import java.util.Scanner;

public class StringExtremum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String a = "";
        sc.nextLine();
        for(;;){
            String n = sc.nextLine();
            // int k = n.length();
            if(n.length() == 0){
                break;
            }
            if(num == 1){
                if(n.length() >= max){
                    max = n.length();
                    a=n;
                    // System.out.println(max);
                }
            }
            else {
                if(n.length() <= min){
                    min = n.length();
                    a = n;
                }
            }
        }
        if(num == 1){
            System.out.println(max);
            System.out.println(a);
        }
        else{
            System.out.println(min);
            System.out.println(a);
        }

    }
}