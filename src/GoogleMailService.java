public class GoogleMailService extends SimpleMailService{

    public GoogleMailService(String to, String subject) {
        super(to, subject);
    }

    @Override
    public void sendEmail(){
        super.sendEmail();
        System.out.println("Sending email via gmail with specific configuration.");
    }
}
