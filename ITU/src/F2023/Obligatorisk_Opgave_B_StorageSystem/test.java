package F2023.Obligatorisk_Opgave_B_StorageSystem;

import java.util.Scanner;

public class test{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        StorageOverview so = new StorageOverview();

        double price = 1000;
        double pricePerSquareMeter = 2500;


        System.out.println("Welcome to your Storage!");
        System.out.println("Type 'help' for commands");
        System.out.println("/----------------------/");

        while(sc.hasNext()){
            String line = sc.nextLine();

            if(line.equalsIgnoreCase("addStorage")){
                System.out.println();


                System.out.println("You've chosen to add a new Storage");
                System.out.println("Which type of storage are you interrested in purchasing?");
                System.out.println("/------------------------------------------------------/");
                System.out.println("Regular pricings for a fixed storage is " + price);
                System.out.println("Scalable storage prices are squareMeters * " + pricePerSquareMeter);
                System.out.println("CloudStorage prices are 'GB * 0.15'");
                System.out.println();
                System.out.println("To view your current Storage System, please type 'display'");
                System.out.println("/------------------------------------------------------/");
                System.out.println();
                line = sc.nextLine();


                if(line.equalsIgnoreCase("fixed storage")){
                    System.out.println("Please type the name of the new Storage:");
                    String storageId = sc.nextLine();
                    Storage s = new FixedPriceStorage(storageId, price);

                    System.out.println("Your new Storage: " + storageId + " is now created");

                    if(verification()){
                        so.addStorage(s);
                    } else {
                        System.out.println("Storage has not been added");
                    }
                } else if(line.equalsIgnoreCase("scalable storage")){
                    System.out.println("Please type the name of the new Storage: ");
                    String storageId = sc.nextLine();
                    System.out.println();
                    System.out.println("Please type your required (int) size of your storage: ");
                    int squareMeter  = sc.nextInt();

                    Storage s = new ScalablePriceStorage(storageId, pricePerSquareMeter, squareMeter);

                    System.out.println("Your new Storage: " + storageId + " is now created");

                    if(verification()){
                        so.addStorage(s);
                    } else {
                        System.out.println("Storage has not been added");
                    }
                } else if(line.equalsIgnoreCase("cloud storage")){
                    System.out.println("Please type the name of the new Storage: ");
                    String storageId = sc.nextLine();
                    System.out.println();
                    System.out.println("Please type your required (int) GB of your storage: ");
                    int sizeGB  = sc.nextInt();
                    System.out.println();
                    System.out.println("Please type the accessKey to your storage: " + storageId);
                    String accessKey = sc.nextLine();

                    Storage s = new CloudStorage(storageId, sizeGB, accessKey);

                    System.out.println("Your new Storage: " + storageId + " is now created");
                }
            }


            if(line.equalsIgnoreCase("help")){
                help();
            } else if(line.equalsIgnoreCase("close")){
                break;
            } else if(line.equalsIgnoreCase("display")){
                so.display();
            }
        }
    }

    public static void help(){
        System.out.println("addStorage");
        System.out.println("Fixed Storage - StorageID, price");
        System.out.println("Scalable Storage - StorageId, PricePerSquareMeter, squareMeters");
        System.out.println("StorageId, SizeGB, AccessKey");
        System.out.println("display");
        System.out.println("close program");
    }

    public static Boolean verification(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Please confirm, to add storage to your overview");
        System.out.println("yes/no");
        System.out.println();
        return sc.nextLine().equals("yes");
    }
}