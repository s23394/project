import OverfillException.OverfillException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class Main {


    public static ArrayList moveContainer(Transport trans1, Transport trans2) {
        ArrayList<Container> transport1 = trans1.containers;
        ArrayList<Container> transport2 = trans2.containers;
        for (int i = 0; i < transport1.size(); i++) {
            transport2.add(transport1.get(i));
        }
        for (int i = 0; i < transport1.size(); i++) {
            transport1.remove(i);
        }
        return transport2;
    }


    public static void main(String[] args) throws Exception {
        Random random = new Random();
        double weight = Math.random() * 3500;
        double Height = Math.random() * 2;
        double Length = Math.random() * 35;
        double maxWeight = (double) Math.random() * 4000;
        Container container = new Container(weight, Height, Length, maxWeight);

        LiquidsContain liquidsContain = new LiquidsContain(weight, Height, Length, maxWeight, LiquidType.Save_Liquid);


        GazContain gazContain = new GazContain(weight, Height, Length, maxWeight);


        RefrigeratedContainer refrigeratedContainer = new RefrigeratedContainer(weight, Height, Length, maxWeight, "Eggs");


        ArrayList<Container> containers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        containers.add(liquidsContain);
        containers.add(gazContain);
        containers.add(refrigeratedContainer);

        ArrayList<Container> containers1 = new ArrayList<>();


        Transport transport = new Transport();
        transport.createTransport(containers, 4.4);
        transport.containers.removeAll(Collections.singleton(0));


        Transport transport1 = new Transport();
        transport1.createTransport(containers, 5.9);


        System.out.println("choose your type of container , you have 3 options :LiquidContain, GazContain,RefrigeratedContainer ");
        String Type = sc.nextLine();
        System.out.println("please enter quantity of container");
        int quantity = sc.nextInt();


        if (Type.equalsIgnoreCase("liquids Contain")) {
            LiquidsContain liquidsContain2 = new LiquidsContain(weight, Height, Length, maxWeight, LiquidType.Dangerous_Liquid);
            transport.addContainer(liquidsContain2, quantity);

            if (Type.equalsIgnoreCase("gaz contain")) {
                GazContain gazContain1 = new GazContain(weight, Height, Length, maxWeight);
                transport.addContainer(gazContain1, quantity);

                if (Type.equalsIgnoreCase("refrigerated Container")) {
                    System.out.println("cheese your product");
                    String productType = sc.nextLine();
                    if (productType.equalsIgnoreCase("fish") || productType.equalsIgnoreCase("eggs") || productType.equalsIgnoreCase("meal") || productType.equalsIgnoreCase("Ice-cream"))
                        ;
                    RefrigeratedContainer refrigeratedContainer1 = new RefrigeratedContainer(weight, Height, Length, maxWeight, productType);
                }}
            System.out.println("podano"+Type + "numer" + quantity);
            System.out.println(refrigeratedContainer);
            System.out.println("kontemery na sttuktu nr 2");
            System.out.println(transport1.containers);



                    moveContainer(transport1, transport);
                    System.out.println("containters in the transport nr 1 ");
                    {
                        System.out.println(transport.containers);
                    }
                    System.out.println("containters in the transport nr  2");
                    {
                        System.out.println(transport1.containers);
                    }

                }


                for (Container container1 : containers) {
                    container1.weight = 0;
                }
                System.out.println(containers);


                System.out.println("remove every second container  ");
                {
                    for (int i = 0; i < transport1.containers.size(); i += 2) {
                        transport1.containers.remove(i);
                    }
                }

                System.out.println(transport1.containers);
            }

        }
