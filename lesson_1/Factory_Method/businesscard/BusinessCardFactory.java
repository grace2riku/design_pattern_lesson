package businesscard;

import framework.Factory;
import framework.Product;

public class BusinessCardFactory extends Factory {

    @Override
    protected Product createProduct(String owner) {
        return new BusinessCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "を登録しました。");        
    }    
}
