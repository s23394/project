import OverfillException.OverfillException;

import java.util.ArrayList;
import java.util.List;

public class RefrigeratedContainer extends Container implements Explosible {

    private double temp;
    String product;


    static {
        ArrayList<String> products = new ArrayList<>();
        products.add("fish");
        products.add("Meal");
        products.add("Eggs");
        products.add("Ice-cream");
    }
    public RefrigeratedContainer(double weight, double height, double length, double maxWeight,String product) {
        super(weight, height, length, maxWeight);
        this.temp=temp;
        this.product=product;

        if(product.equals("fish")) {
            this.temp = 2;
        } else if(product.equals("Meal")){
            this.temp=-15;
        }else if(product.equals("Eggs")){
            this.temp=19;
        }else if(product.equals("Ice-cream")){
            this.temp=-18;
        }

    }

    @Override
    public String toString() {
        return "RefrigeratedContainer{" +
                "weight=" + weight +
                ", height=" + height +
                ", length=" + length +
                ", maxWeight=" + maxWeight +
                ", temp=" + temp +
                ", product='" + product + '\'' +
                '}';
    }



    @Override
    public void explode() {
        System.out.println("Liquid container with serial number" + serialNumber + " exploded!”.");
    }

    @Override
    public void load() throws OverfillException {
        if (weight > maxWeight) {
            throw new OverfillException("you cannot load this weight is to high");
            }
        }
    }