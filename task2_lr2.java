import java.util.Scanner;
public class task2_lr2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1;
        System.out.println("Введите пароль:");
        s1 = sc.nextLine();
        if (s1.length() >= 8){
            System.out.println("Пароль надежен.");
            System.exit(0);
        }
        else {
            System.out.println("Пароль ненадежен. Повторите ввод");
        }
        if (s1.matches("[a-zA-Z]+") && s1.matches("[1-9]+") && s1.matches("[_]*")){
            System.out.println("Пароль надежен");
        }
        else {
            System.out.println("Пароль ненадежен. Повторите ввод");
            System.exit(0);
        }
    }
}