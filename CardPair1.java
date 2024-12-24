import java.util.Scanner;

public class CardPair1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            String play_1 = sc.next();
            String play_2 = sc.next();
            char card1 = play_1.charAt(0);
            char card2 = play_1.charAt(1);
            char card3 = play_2.charAt(0);
            char card4 = play_2.charAt(1);
            int n1 = 0;
            int n2 = 0;
            String n = "";
            if(card1 < card2){
                n1 = play_1.charAt(0);
            } else {
                n1 = (int)card2;
            }
            if(card3 < card4){
                n2 = card3;
            } else {
                n2 = (int)card4;
            }
            System.out.println(n);
            System.out.println(n2);
            if(n1 < n2){
                System.out.print("W");
            } else if(n1 == n2){
                System.out.print("D");
            } else {
                System.out.print("L");
            }
        }
    }
}
