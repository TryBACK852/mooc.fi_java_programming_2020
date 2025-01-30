
import java.util.Scanner;

public class LineByLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.equals("")) {
            return;
        }
        while (!input.equals("")) {
            String[] fragments = input.split(" ");
            for (String fragment : fragments) {
                System.out.println(fragment);
            }
            input = scanner.nextLine();
        }
    }
}

  
