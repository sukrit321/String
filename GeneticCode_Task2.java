import java.util.Scanner;

public class GeneticCode_Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String n = "<";
        String n1 = ">";
        int index = 0;
        for(int i = text.indexOf(n); i != -1; i = text.indexOf(n, index)){
            System.out.print(text.substring(i + 1, text.indexOf(n1, index)));
            System.out.println();
            index = text.indexOf(n1, index) + 1;
        }
    }
}
