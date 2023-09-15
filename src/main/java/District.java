public class District extends Structures{

    String districtName;
    int districtSize;

    District(String districtName, int districtSize){
        super();
        this.districtName = districtName;
        this.districtSize = districtSize;
    }

    public String getName(){
        return this.districtName;
    }
}
