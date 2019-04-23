package Backend;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Vehicle {
   private String licenseplate,colour,VehicleType;
   private int registrationNum;
   private Customer Owner;
   private DeviceStatus stat = DeviceStatus.UNINSTALLED;
   private ArrayList<TrackingDevice> device = new ArrayList<TrackingDevice>();


    public Vehicle(String licenseplate,String colour,String VehicleType, int registrationNum ,Customer Owner){
        this.licenseplate = licenseplate;
        this.colour = colour;
        this.VehicleType = VehicleType;
        this.registrationNum = registrationNum;
        this.Owner = Owner;
    }


    public Customer getOwner() {
        return Owner;
    }

    public int getRegistrationNum() {
        return registrationNum;
    }

    public String getColour() {
        return colour;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public TrackingDevice getDevice() {
        return device.get(0);
    }


    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setDevice(TrackingDevice device) {
        this.device.add(device);
    }

    public void setOwner(Customer owner) {
        Owner = owner;
    }

    public void setRegistrationNum(int registrationNum) {
        this.registrationNum = registrationNum;
    }

    public void setVehicleType(String vehicleType) {
        VehicleType = vehicleType;
    }

    public String getLicenseplate() {
        return licenseplate;
    }

    public void setLicenseplate(String licenseplate) {
        this.licenseplate = licenseplate;
    }

    public String installdevice (TrackingDevice t){
        if (device.size() == 0){
            device.set(0, t);
            stat = DeviceStatus.INSTALLED;
            return "Device Installed";
        }
        return "Device Already Installed";
    }

    public String Uninstalldevice(){
        if(device.size() != 0){
            device.remove(0);
            stat = DeviceStatus.UNINSTALLED;
            return "Device Installed";
        }
        return "Device Already Installed";
    }

}
