public class EmailFactory {

    public String email;
    public EmailFactory(String email){
        this.email = email;
    }
    public SimpleMailService getMailService(String subject){
        if(this.email.contains("yahoo.com")){
            return new YahooMailService(this.email, subject);
        } else if (this.email.contains("gmail.com")) {
            return new GoogleMailService(this.email, subject);
        } else if (this.email.contains("outlook.com")) {
            return new OutlookMailService(this.email,subject);
        }else {
            return new OutlookMailService(this.email, subject);
        }
    }
}
