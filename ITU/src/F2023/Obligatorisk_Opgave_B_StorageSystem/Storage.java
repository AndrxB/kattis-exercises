package F2023.Obligatorisk_Opgave_B_StorageSystem;

import java.util.ArrayList;

public class Storage {
    protected String storageId;
    protected double price;

    Storage(String storageId, double price){
        this.storageId = storageId;
        this.price = price;
    }

    /* Show storage info */
    public void display() {
        System.out.println(" ** STORAGE INFO ** ");
        System.out.println("ID: " + storageId);
        System.out.println("Price: " + price);

    }
}
