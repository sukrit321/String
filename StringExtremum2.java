import java.util.Scanner;

public class StringExtremum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String taget1 = sc.nextLine();
        String taget2 = sc.nextLine();
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
                if(n.indexOf(taget1) >= 0 || n.indexOf(taget2) >= 0){
                    System.out.println(n.indexOf(taget1));
                    if(n.length() >= max){
                       max = n.length();
                       a=n;
                    }
                    // System.out.println(max);
                }
            }
            else {
                if(n.indexOf(taget1) >= 0 || n.indexOf(taget2) >= 0){
                    System.out.println(n);
                    if(n.length() <= min){
                        min = n.length();
                        a = n;
                    }
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
