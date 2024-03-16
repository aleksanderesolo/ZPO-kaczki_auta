//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        shop.setTax(new Poland());
        System.out.println(shop.getTax());

        shop.setTax(new Germany());
        System.out.println(shop.getTax());

        shop.setTax(new UnitedKingdom());
        System.out.println(shop.getTax());
    }
}