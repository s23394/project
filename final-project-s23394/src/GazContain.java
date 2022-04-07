import OverfillException.OverfillException;


public class GazContain extends Container implements Explosible{


    private double pressure;

    public GazContain(double weight, double height, double length, double maxWeight) {
        super(weight, height, length, maxWeight);
        this.pressure=pressure;
    }

    @Override
    public String toString() {
        return "GazContain{" +
                "weight=" + weight +
                ", height=" + height +
                ", length=" + length +
                ", maxWeight=" + maxWeight +
                ", pressure=" + pressure +
                '}';
    }

    @Override
    public void load() throws OverfillException {
        if(weight>maxWeight){
            throw new OverfillException("you cannot load this weight is to high");
        }
        }

    @Override
    public void remove() {
        weight=weight*0.05;
    }

    @Override
    public void explode() {
        System.out.println("Liquid container with serial number" + serialNumber + " exploded!”.");
    }
}
