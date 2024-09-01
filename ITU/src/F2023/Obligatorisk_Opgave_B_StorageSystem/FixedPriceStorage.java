package F2023.Obligatorisk_Opgave_B_StorageSystem;

import java.util.ArrayList;

public class FixedPriceStorage extends PhysicalStorage {
    private String storageId;
    private double price;
    private int keyCounter;

    public FixedPriceStorage(String storageId, double price) {
        super(storageId, price);
        this.keyCardNumbers = new ArrayList<>();
        this.keyCounter = 0;
    }

    @Override
    public void addKeyCardNumber(String cardNumber){
        super.addKeyCardNumber(cardNumber);
        if(keyCounter % 3 == 0){
            price += 1000;
        }

        keyCounter++;
    }
}


