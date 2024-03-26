public class SimpleMailService {
    public String from;
    public String to;
    public String subject;

    public SimpleMailService(String to, String subject) {
        this.from = "magazinul-nostru@mailService.com";
        this.to = to;
        this.subject = subject;
    }

    public void sendEmail(){
        System.out.println("Sending email from: "+from);
        System.out.println("Sending email to: "+to);
        System.out.println("Subject of email is: "+subject);
    }

}
