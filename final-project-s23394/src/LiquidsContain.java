import OverfillException.OverfillException;

import java.sql.Savepoint;


public class LiquidsContain extends Container implements Explosible {
    LiquidType liquidType;
  ;

    public LiquidsContain(double weight, double height, double length, double maxWeight,LiquidType liquidType) {
        super(weight, height, length, maxWeight);
        this.liquidType=liquidType;
            }

    @Override
    public String toString() {
        return "LiquidsContain{" +
                "weight=" + weight +
                ", height=" + height +
                ", length=" + length +
                ", maxWeight=" + maxWeight +
                ", liquidType=" + liquidType +
                '}';
    }

    @Override
    public void load() throws OverfillException {
        switch (liquidType) {
            case Save_Liquid:
                this.weight = maxWeight * 0.9;
                break;
            case Dangerous_Liquid:
                this.weight = maxWeight / 2;
            default:
                if (this.weight > maxWeight) {
                    throw new OverfillException("you cannot load your product , this weight is to high");
                }


        }
    }
}


