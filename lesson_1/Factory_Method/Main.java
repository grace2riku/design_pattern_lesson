import framework.Factory;
import framework.Product;
import idcard.IDCardFactory;
import businesscard.BusinessCardFactory;    // 追加

public class Main {
    public static void main(String[] args) {
        System.out.println("/***** IDCardのFactory *****/");
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Hiroshi Yuki");
        Product card2 = factory.create("Tomura");
        Product card3 = factory.create("Hanako Sato");
        card1.use();
        card2.use();
        card3.use();

        // 追加 ここから
        System.out.println();
        System.out.println("/***** BussinesCardのFactory *****/");
        Factory bussinessCardFactory = new BusinessCardFactory();
        Product bussinesCardPerson = bussinessCardFactory.create("Koji Abe");
        Product bussinesCardCat = bussinessCardFactory.create("Riku Abe");
        bussinesCardPerson.use();
        bussinesCardCat.use();
        // 追加 ここまで
    }
}
