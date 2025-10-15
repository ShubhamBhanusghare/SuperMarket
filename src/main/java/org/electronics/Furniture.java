package org.electronics;

public class Furniture extends Product{

    private String materialType;

    public Furniture(String name, double price, double discount, String materialType) {
        super(name, price, discount);
        this.materialType = materialType;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    @Override
    public String toString() {
        return super.toString() + "Furniture{" +
                "materialType='" + materialType + '\'' +
                '}';
    }
}
