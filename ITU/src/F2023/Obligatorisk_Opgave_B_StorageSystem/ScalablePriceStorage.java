package F2023.Obligatorisk_Opgave_B_StorageSystem;

import java.util.ArrayList;

public class ScalablePriceStorage extends PhysicalStorage {
    private double pricePerSquareMeter;
    private int squareMeters;

    public ScalablePriceStorage(String storageId, double pricePerSquareMeter, int squareMeters) {
        super(storageId, pricePerSquareMeter * squareMeters);
        this.pricePerSquareMeter = pricePerSquareMeter;
        this.squareMeters = squareMeters;
        this.keyCardNumbers = new ArrayList<>();
    }

    /* Rent additional square meters. Price gets updated automatically.  */
    public void rentSquareMeters(int sqmeters) {
        squareMeters += sqmeters;
        price = squareMeters * pricePerSquareMeter;
    }

    @Override
    public void display(){
        super.display();
        System.out.println(squareMeters + " kvm");
    }
}


