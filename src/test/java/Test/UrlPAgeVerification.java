package Test;

public class UrlPAgeVerification extends BaseClass {
    public static void main(String[] args) {
        urlVerification();
        verification("(//a[@class='navigation-mns-logo navigation-logo'])[1]","M&S");
        close();
    }
}
