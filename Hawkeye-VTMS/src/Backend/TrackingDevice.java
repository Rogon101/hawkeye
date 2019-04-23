package Backend;

public class TrackingDevice {
    private Float Cost;
    private String serialNum;

    public TrackingDevice (Float Cost,String serialNum){
        this.Cost = Cost;
        this.serialNum = serialNum;
    }

    public Float getCost() {
        return Cost;
    }

    public String getSerialNum() {
        return serialNum;
    }
}
