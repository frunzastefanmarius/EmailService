public class OutlookMailService extends SimpleMailService{
    public OutlookMailService(String to, String subject) {
        super(to, subject);
    }
    @Override
    public void sendEmail(){
        super.sendEmail();
        System.out.println("Sending email via Outlook with specific configuration.");
    }
}
