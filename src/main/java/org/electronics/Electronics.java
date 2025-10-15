package org.electronics;

public class Electronics extends Product{

    private String warrantyPeriod;

    public Electronics(String name, double price, double discount, String warrantyPeriod) {
        super(name, price, discount);
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public String toString() {
        return super.toString() + "Electronics{" +
                "warrantyPeriod='" + warrantyPeriod + '\'' +
                '}';
    }
}
