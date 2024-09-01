package F2023.Obligatorisk_Opgave_B_StorageSystem;

import java.util.ArrayList;

public class PhysicalStorage extends Storage {
    protected ArrayList<String> keyCardNumbers;

    PhysicalStorage(String storageId, double price){
        super(storageId, price);
        ArrayList<String> keyCardNumbers;
    }

    /* Show storage info */
    public void display() {
        super.display();
        if (keyCardNumbers.size() > 0) {
            System.out.println("Access keys: ");
            for (String k : keyCardNumbers) {
                System.out.println("- " + k);
            }
        }
    }

    /* Add new key card number to the key card list. */
    public void addKeyCardNumber(String cardNumber) {
        keyCardNumbers.add(cardNumber);
    }
}
