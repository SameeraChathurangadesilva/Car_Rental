package lk.edu.ijse.car_rental.entity;

import javax.persistence.*;

@Entity
public class RegisterVehicles {

    @Id
    private String vehicleId;
    private String vehicleTitle;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "brandid",referencedColumnName = "brandid")
    private Brand brand;
    private String vehicleOverView;
    private String vehiclePricePerDay;
    private String vehicleModelyear;
    private String vehicleFuelType;
    private String vehicleEngineCapacity;
    private String vehicleSeatingCapacity;
    private String vehicleAirConditioner;
    private String vehiclePowerDoorLocks;
    private String vehicleAntiLockBrakingSystem;
    private String vehicleBrakeAssist;
    private String vehiclePowerSteering;
    private String vehicleDriverAirbag;
    private String vehiclePassengerAirbag;
    private String vehiclePowerWindows;
    private String vehicleCDPlayer;
    private String vehicleCentralLocking;
    private String vehicleCrashSensor;
    private String vehicleLeatherSeats;



    public RegisterVehicles() {
    }

    public RegisterVehicles(String vehicleId, String vehicleTitle, Brand brand, String vehicleOverView, String vehiclePricePerDay, String vehicleModelyear, String vehicleFuelType, String vehicleEngineCapacity, String vehicleSeatingCapacity, String vehicleAirConditioner, String vehiclePowerDoorLocks, String vehicleAntiLockBrakingSystem, String vehicleBrakeAssist, String vehiclePowerSteering, String vehicleDriverAirbag, String vehiclePassengerAirbag, String vehiclePowerWindows, String vehicleCDPlayer, String vehicleCentralLocking, String vehicleCrashSensor, String vehicleLeatherSeats) {
        this.vehicleId = vehicleId;
        this.vehicleTitle = vehicleTitle;
        this.brand = brand;
        this.vehicleOverView = vehicleOverView;
        this.vehiclePricePerDay = vehiclePricePerDay;
        this.vehicleModelyear = vehicleModelyear;
        this.vehicleFuelType = vehicleFuelType;
        this.vehicleEngineCapacity = vehicleEngineCapacity;
        this.vehicleSeatingCapacity = vehicleSeatingCapacity;
        this.vehicleAirConditioner = vehicleAirConditioner;
        this.vehiclePowerDoorLocks = vehiclePowerDoorLocks;
        this.vehicleAntiLockBrakingSystem = vehicleAntiLockBrakingSystem;
        this.vehicleBrakeAssist = vehicleBrakeAssist;
        this.vehiclePowerSteering = vehiclePowerSteering;
        this.vehicleDriverAirbag = vehicleDriverAirbag;
        this.vehiclePassengerAirbag = vehiclePassengerAirbag;
        this.vehiclePowerWindows = vehiclePowerWindows;
        this.vehicleCDPlayer = vehicleCDPlayer;
        this.vehicleCentralLocking = vehicleCentralLocking;
        this.vehicleCrashSensor = vehicleCrashSensor;
        this.vehicleLeatherSeats = vehicleLeatherSeats;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleTitle() {
        return vehicleTitle;
    }

    public void setVehicleTitle(String vehicleTitle) {
        this.vehicleTitle = vehicleTitle;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getVehicleOverView() {
        return vehicleOverView;
    }

    public void setVehicleOverView(String vehicleOverView) {
        this.vehicleOverView = vehicleOverView;
    }

    public String getVehiclePricePerDay() {
        return vehiclePricePerDay;
    }

    public void setVehiclePricePerDay(String vehiclePricePerDay) {
        this.vehiclePricePerDay = vehiclePricePerDay;
    }

    public String getVehicleModelyear() {
        return vehicleModelyear;
    }

    public void setVehicleModelyear(String vehicleModelyear) {
        this.vehicleModelyear = vehicleModelyear;
    }

    public String getVehicleFuelType() {
        return vehicleFuelType;
    }

    public void setVehicleFuelType(String vehicleFuelType) {
        this.vehicleFuelType = vehicleFuelType;
    }

    public String getVehicleEngineCapacity() {
        return vehicleEngineCapacity;
    }

    public void setVehicleEngineCapacity(String vehicleEngineCapacity) {
        this.vehicleEngineCapacity = vehicleEngineCapacity;
    }

    public String getVehicleSeatingCapacity() {
        return vehicleSeatingCapacity;
    }

    public void setVehicleSeatingCapacity(String vehicleSeatingCapacity) {
        this.vehicleSeatingCapacity = vehicleSeatingCapacity;
    }

    public String getVehicleAirConditioner() {
        return vehicleAirConditioner;
    }

    public void setVehicleAirConditioner(String vehicleAirConditioner) {
        this.vehicleAirConditioner = vehicleAirConditioner;
    }

    public String getVehiclePowerDoorLocks() {
        return vehiclePowerDoorLocks;
    }

    public void setVehiclePowerDoorLocks(String vehiclePowerDoorLocks) {
        this.vehiclePowerDoorLocks = vehiclePowerDoorLocks;
    }

    public String getVehicleAntiLockBrakingSystem() {
        return vehicleAntiLockBrakingSystem;
    }

    public void setVehicleAntiLockBrakingSystem(String vehicleAntiLockBrakingSystem) {
        this.vehicleAntiLockBrakingSystem = vehicleAntiLockBrakingSystem;
    }

    public String getVehicleBrakeAssist() {
        return vehicleBrakeAssist;
    }

    public void setVehicleBrakeAssist(String vehicleBrakeAssist) {
        this.vehicleBrakeAssist = vehicleBrakeAssist;
    }

    public String getVehiclePowerSteering() {
        return vehiclePowerSteering;
    }

    public void setVehiclePowerSteering(String vehiclePowerSteering) {
        this.vehiclePowerSteering = vehiclePowerSteering;
    }

    public String getVehicleDriverAirbag() {
        return vehicleDriverAirbag;
    }

    public void setVehicleDriverAirbag(String vehicleDriverAirbag) {
        this.vehicleDriverAirbag = vehicleDriverAirbag;
    }

    public String getVehiclePassengerAirbag() {
        return vehiclePassengerAirbag;
    }

    public void setVehiclePassengerAirbag(String vehiclePassengerAirbag) {
        this.vehiclePassengerAirbag = vehiclePassengerAirbag;
    }

    public String getVehiclePowerWindows() {
        return vehiclePowerWindows;
    }

    public void setVehiclePowerWindows(String vehiclePowerWindows) {
        this.vehiclePowerWindows = vehiclePowerWindows;
    }

    public String getVehicleCDPlayer() {
        return vehicleCDPlayer;
    }

    public void setVehicleCDPlayer(String vehicleCDPlayer) {
        this.vehicleCDPlayer = vehicleCDPlayer;
    }

    public String getVehicleCentralLocking() {
        return vehicleCentralLocking;
    }

    public void setVehicleCentralLocking(String vehicleCentralLocking) {
        this.vehicleCentralLocking = vehicleCentralLocking;
    }

    public String getVehicleCrashSensor() {
        return vehicleCrashSensor;
    }

    public void setVehicleCrashSensor(String vehicleCrashSensor) {
        this.vehicleCrashSensor = vehicleCrashSensor;
    }

    public String getVehicleLeatherSeats() {
        return vehicleLeatherSeats;
    }

    public void setVehicleLeatherSeats(String vehicleLeatherSeats) {
        this.vehicleLeatherSeats = vehicleLeatherSeats;
    }

    @Override
    public String toString() {
        return "RegisterVehicles{" +
                "vehicleId='" + vehicleId + '\'' +
                ", vehicleTitle='" + vehicleTitle + '\'' +
                ", brand=" + brand +
                ", vehicleOverView='" + vehicleOverView + '\'' +
                ", vehiclePricePerDay='" + vehiclePricePerDay + '\'' +
                ", vehicleModelyear='" + vehicleModelyear + '\'' +
                ", vehicleFuelType='" + vehicleFuelType + '\'' +
                ", vehicleEngineCapacity='" + vehicleEngineCapacity + '\'' +
                ", vehicleSeatingCapacity='" + vehicleSeatingCapacity + '\'' +
                ", vehicleAirConditioner='" + vehicleAirConditioner + '\'' +
                ", vehiclePowerDoorLocks='" + vehiclePowerDoorLocks + '\'' +
                ", vehicleAntiLockBrakingSystem='" + vehicleAntiLockBrakingSystem + '\'' +
                ", vehicleBrakeAssist='" + vehicleBrakeAssist + '\'' +
                ", vehiclePowerSteering='" + vehiclePowerSteering + '\'' +
                ", vehicleDriverAirbag='" + vehicleDriverAirbag + '\'' +
                ", vehiclePassengerAirbag='" + vehiclePassengerAirbag + '\'' +
                ", vehiclePowerWindows='" + vehiclePowerWindows + '\'' +
                ", vehicleCDPlayer='" + vehicleCDPlayer + '\'' +
                ", vehicleCentralLocking='" + vehicleCentralLocking + '\'' +
                ", vehicleCrashSensor='" + vehicleCrashSensor + '\'' +
                ", vehicleLeatherSeats='" + vehicleLeatherSeats + '\'' +
                '}';
    }
}
