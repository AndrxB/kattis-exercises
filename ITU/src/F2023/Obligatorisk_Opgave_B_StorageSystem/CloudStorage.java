package F2023.Obligatorisk_Opgave_B_StorageSystem;

public class CloudStorage extends Storage {
    private int sizeGB;
    private String accessKey;

    public CloudStorage(String storageId, int sizeGB, String accessKey){
        super(storageId, sizeGB * 0.15);
        this.sizeGB = sizeGB;
        this.accessKey = accessKey;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Cloud space: " + sizeGB);
        System.out.println("Access key" + accessKey);
    }
}
