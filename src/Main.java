import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner User = new Scanner(System.in);

        System.out.print("Enter a command: ");
        String user = User.nextLine();



        if (user.equals("Q")) {
            System.out.println("Are you sure you want to quit?(Y/N)");
            if (User.nextLine().equals("Y")) {
                System.exit(0);
            }
        }
        ArrayList<String> List = new ArrayList<String>();

        List.add("Milk");
        List.add("eggs");
        List.add("bread");
        List.add("");
        List.add("");
        List.add("");
        List.add("");

        List.set(3, "tomato");
        List.set(4, "butter");



        for(int i = 0; i < List.size(); i++) {
            System.out.println(List.get(i));
        }

    }
}