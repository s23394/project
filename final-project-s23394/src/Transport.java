import OverfillException.OverfillException;

import java.util.ArrayList;
import java.util.List;

public class Transport {
    private static int maxContainers;
    double maxSpeed;

    ArrayList<Container> containers = new ArrayList<>();

    public Transport() {
        this.maxSpeed = maxSpeed;
        this.containers = containers;
    }

    public static int getMaxContainers() {
        return maxContainers / 2;

    }


    public void addContainer(Container container) {
        containers.add(container);
    }

    public void addContainer(Container container, int val) {
        for (int i = 0; i < val; i++) ;
        containers.add(container);
    }

    public void removeContainer(Container container) {
        containers.remove(container);
    }

    public void removeContainer(int val) {
        containers.remove(val);
    }

    public Transport createTransport(ArrayList<Container> containers, double maxSpeed) {
        Transport transport = new Transport();
        transport.containers = containers;
        transport.maxSpeed = maxSpeed;
        return transport;
    }
}