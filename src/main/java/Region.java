public class Region extends Structures{

    String regionName;
    int regionSize;

    Region(String regionName, int regionSize){
        super();
        this.regionName = regionName;
        this.regionSize = regionSize;
    }

    public String getName(){
        return this.regionName;
    }
}
