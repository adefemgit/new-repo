package emailapp;

public class EmailApp {
    public static void main(String[] args) {
        Email email1 = new Email("Goodness ", "victor");
        email1.setMailboxCapacity(200);
        email1.setAlternateEmail("victornze1@gmail.com");
        email1.emailInfo();
    }


}
