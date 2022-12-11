import java.util.Scanner;
public class task1_lr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Введите дату формата дд/мм/гггг:");
        s = sc.nextLine();
        int indexP = s.indexOf(".");

        if (indexP == 2 || indexP == 5) {
            System.out.println("Введенное выражение не соответствует заданному формату даты dd/mm/yyyy");
            System.exit(0);
        }

        if (s.charAt(0) == '4' || s.charAt(0) == '5' || s.charAt(0) == '6' || s.charAt(0) == '7' || s.charAt(0) == '8' || s.charAt(0) == '9') {
            System.out.println("Введенное выражение не является датой");
            System.exit(0);
        }

        if (s.charAt(0) == '3' && (s.charAt(1) == '2' || s.charAt(1) == '3' || s.charAt(1) == '4' || s.charAt(1) == '5' || s.charAt(1) == '6' && s.charAt(1) == '7' && s.charAt(1) == '8' || s.charAt(1) == '9')) {
            System.out.println("Введенное выражение не является датой");
            System.exit(0);
        }

        if (s.charAt(0) == '2' && s.charAt(1) == '9' && s.charAt(3) == '0' && s.charAt(4) == '2') {
            System.out.println("Введенное выражение не является датой");
            System.exit(0);
        }

        if (s.charAt(3) == '2' || s.charAt(3) == '3' || s.charAt(3) == '4' || s.charAt(3) == '5' || s.charAt(3) == '6' || s.charAt(3) == '7' || s.charAt(3) == '8' || s.charAt(3) == '9' ){
            System.out.println("Введенное выражение не является датой");
            System.exit(0);
        }

        if (s.charAt(3) == '1' && (s.charAt(4) == '3' || s.charAt(4) == '4' || s.charAt(4) == '5' || s.charAt(4) == '6' || s.charAt(4) == '7' || s.charAt(4) == '8' || s.charAt(4) == '9')){
            System.out.println("Введенное выражение не является датой");
            System.exit(0);
        }

        if (s.charAt(6) == '0'){
            System.out.println("Введенное выражение не является датой");
            System.exit(0);
        }
        if (s.charAt(6) == '1' && (s.charAt(7) == '1' || s.charAt(7) == '2' || s.charAt(7) == '3' || s.charAt(7) == '4' || s.charAt(7) == '5' || s.charAt(7) == '6' || s.charAt(7) == '7' || s.charAt(7) == '8')){
            System.out.println("Введенное выражение не является датой");
            System.exit(0);
        }
        System.out.println("Введенное выражение является датой");
    }
}