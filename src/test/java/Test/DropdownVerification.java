package Test;

public class DropdownVerification extends BaseClass {
    public static void main(String[] args) {
        urlVerification();

        pageFactory.getDropdownHover().dropdownHover();
        verification("//h1","Women’s New In");
        close();
    }
}
