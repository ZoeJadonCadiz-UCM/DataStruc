import java.util.Scanner;
import java.time.LocalDate;

public class TestWedding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter bride first name: ");
        String brideFirst = input.nextLine();

        System.out.print("Enter bride last name: ");
        String brideLast = input.nextLine();

        System.out.print("Enter groom first name: ");
        String groomFirst = input.nextLine();

        System.out.print("Enter groom last name: ");
        String groomLast = input.nextLine();

        System.out.print("Enter wedding year: ");
        int year = input.nextInt();

        System.out.print("Enter wedding month: ");
        int month = input.nextInt();

        System.out.print("Enter wedding day: ");
        int day = input.nextInt();
        input.nextLine();

        System.out.print("Enter wedding location: ");
        String location = input.nextLine();

        input.close();

        Person bride = new Person(brideFirst, brideLast);
        Person groom = new Person(groomFirst, groomLast);

        Couple couple = new Couple(bride, groom);
        LocalDate date = LocalDate.of(year, month, day);

        Wedding wedding = new Wedding(couple, date, location);

        System.out.println("\nWedding Details");
        System.out.println("\nBride: " + wedding.getCouple().getBride().getFirstName() + " " +
                wedding.getCouple().getBride().getLastName());

        System.out.println("Groom: " + wedding.getCouple().getGroom().getFirstName() + " " +
                wedding.getCouple().getGroom().getLastName());

        System.out.println("Date: " + wedding.getDate());
        System.out.println("Location: " + wedding.getLocation());
    }
}
