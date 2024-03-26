import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Salut! Care este numele tau?");
        String name = scanner.nextLine();
        System.out.println("Care este emailul tau?");
        String email = scanner.nextLine();

        sendRegistrationEmail(name,email);


    }

    public static void sendRegistrationEmail(String name, String email){
        String subject = "Bine ai venit pe site, "+name+". Te-ai inregistrat cu succes!";
        EmailFactory emailFactory = new EmailFactory(email);
        SimpleMailService simpleMailService = emailFactory.getMailService(subject);
        simpleMailService.sendEmail();

    }

}