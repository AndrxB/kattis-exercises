package F2023.Obligatorisk_Opgave_B_StorageSystem;

import java.util.ArrayList;

public class StorageOverview {
    private ArrayList<Storage> storages;

    public StorageOverview() {
        storages = new ArrayList<>();
    }

    /* Show storage info */
    public void display() {
        for (Storage s : storages) {
            s.display();
            System.out.println();
        }
    }

    public void addStorage(Storage s) {
        storages.add(s);
    }
}

