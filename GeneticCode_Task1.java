import java.util.Scanner;

public class GeneticCode_Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String n = "<";
        String n1 = ">";
        int index = 0;
        for(int i = text.lastIndexOf(n1); i != -1; i = text.lastIndexOf(n1, index)){
            System.out.print(i + 1 + " ");
            System.out.println(text.lastIndexOf(n) + 1);
            index = text.indexOf(n1, index) - 1;
        }
    }
}
