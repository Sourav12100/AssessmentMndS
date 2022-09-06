package Test;

public class LinkClick extends BaseClass {
    public static void main(String[] args) {
        urlVerification();
        pageFactory.getHomePage().signInLinkClick();
        verification("//div//h1","Sign In");
        close();
    }
}
