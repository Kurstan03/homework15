import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write radius: ");
        Circle circle= new Circle(scanner.nextInt());

        System.out.println(circle.toString());

    }
}