import java.util.Scanner;

public class SpellChecking1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] dic = new String[n];
        for(int i = 0; i < n; i++){
            dic[i] = sc.next();
        }
        for(int i = 0; i < 10; i++){
            String text = sc.next();
            boolean a = false;
            for(int j = 0; j < n; j++){
                if(text.equals(dic[j]) == true){
                    a = true;
                }
            }
            if(a == true){
                System.out.print(1);
            }
            else {
                System.out.print(0);
            }
        }
    }
}
