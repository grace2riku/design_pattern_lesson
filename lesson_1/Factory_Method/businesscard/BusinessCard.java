package businesscard;

import framework.Product;

public class BusinessCard extends Product {
    private String owner;

    BusinessCard(String owner) {
        System.out.println(owner + "の名刺を作ります。");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(this + "を使います。");
    }

    @Override
    public String toString() {
        return "BusinessCard [owner=" + owner + "]";
    }

    public String getOwner() {
        return owner;
    }
}
