import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*        Scanner scanner = new Scanner("первый абзац, \n" +
                "второй абзац, \n" +
                "третий абзац, \n" +
                "четвертый абзац");
        String s = scanner.nextLine();
        System.out.println(s);

        String s1 = scanner.nextLine();
        System.out.println(s1);

        String s2 = scanner.nextLine();
        System.out.println(s2);

        String s3 = scanner.nextLine();
        System.out.println(s3);
*/

/*        Scanner sc = new Scanner(System.in);
        System.out.print("vvedite chislo: ");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("spasibo chto vveli chislo: " + number);
        } else if (sc.hasNextLine()) {
            String slovo = sc.nextLine();
            System.out.println("vveden nabor bykv: " + slovo);
        }
        sc.close();
*/
    Scanner sc1 = new Scanner(System.in);
    System.out.print("please write name <User>: ");

    String user = sc1.nextLine();
    System.out.println("Hello " + user);
    sc1.close();
    }
}
