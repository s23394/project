
import OverfillException.OverfillException;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;


 public class Container {

    double weight;
    double height;
    double length;
    double maxWeight;
     int serialNumber;

    {
       Random number = new Random();
       serialNumber = number.nextInt(23394);
    }


    public Container(double weight, double height, double length, double maxWeight) {
       this.weight = weight;
       this.height = height;
       this.length = length;
       this.maxWeight = maxWeight;


    }

    public void remove() {
       this.weight = 0;
       System.out.println("Remove this commodity");
    }

    public void load() throws OverfillException {
       if (weight > maxWeight) {
          throw new OverfillException("this weight is to high");
       }
       this.weight = weight;
    }
    @Override
    public String toString() {
       return super.toString();
    }
 }

