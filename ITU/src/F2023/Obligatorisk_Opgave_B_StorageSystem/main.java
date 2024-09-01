package F2023.Obligatorisk_Opgave_B_StorageSystem;

public class main {
    public static void main ( String [] args ){
        Storage s1 = new Storage (" A12 " , 10000) ;
        Storage s2 = new CloudStorage (" A13 " , 300 , " B1870C ");
        Storage s3 = new ScalablePriceStorage (" A14 " , 150 , 30) ;
        StorageOverview so = new StorageOverview () ;
        so . addStorage ( s1 );
        so . addStorage ( s2 );
        so . addStorage ( s3 );
        so . display () ;
    }
}

