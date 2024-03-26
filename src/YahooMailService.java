public class YahooMailService extends SimpleMailService{
    public YahooMailService(String to, String subject) {
        super(to, subject);
    }
    @Override
    public void sendEmail(){
        super.sendEmail();
        System.out.println("Sending email via Yahoo with specific configuration.");
    }
}
