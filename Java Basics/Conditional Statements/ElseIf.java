import java.util.*;

public class ElseIf {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age < 18) {
            System.out.println("Junior");
        } else if(age > 60) {
            System.out.println("Senior");
        } else {
            System.out.println("Adult");
        }
    }
}