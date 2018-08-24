package lk.edu.ijse.car_rental.dto;

public class RegisterVehiclesDTO {

    private String VehicleId;
    private String VehicleTitle;
    private BrandDTO brandDTO;
    private String VehicleOverView;
    private String VehiclePricePerDay;
    private String VehicleModelyear;
    private String VehicleFuelType;
    private String VehicleEngineCapacity;
    private String VehicleSeatingCapacity;
    private String VehicleAirConditioner;
    private String VehiclePowerDoorLocks;
    private String VehicleAntiLockBrakingSystem;
    private String VehicleBrakeAssist;
    private String VehiclePowerSteering;
    private String VehicleDriverAirbag;
    private String VehiclePassengerAirbag;
    private String VehiclePowerWindows;
    private String VehicleCDPlayer;
    private String VehicleCentralLocking;
    private String VehicleCrashSensor;
    private String VehicleLeatherSeats;

    public RegisterVehiclesDTO() {
    }


    public RegisterVehiclesDTO(String vehicleId, String vehicleTitle, BrandDTO brandDTO, String vehicleOverView, String vehiclePricePerDay, String vehicleModelyear, String vehicleFuelType, String vehicleEngineCapacity, String vehicleSeatingCapacity, String vehicleAirConditioner, String vehiclePowerDoorLocks, String vehicleAntiLockBrakingSystem, String vehicleBrakeAssist, String vehiclePowerSteering, String vehicleDriverAirbag, String vehiclePassengerAirbag, String vehiclePowerWindows, String vehicleCDPlayer, String vehicleCentralLocking, String vehicleCrashSensor, String vehicleLeatherSeats) {
        VehicleId = vehicleId;
        VehicleTitle = vehicleTitle;
        this.brandDTO = brandDTO;
        VehicleOverView = vehicleOverView;
        VehiclePricePerDay = vehiclePricePerDay;
        VehicleModelyear = vehicleModelyear;
        VehicleFuelType = vehicleFuelType;
        VehicleEngineCapacity = vehicleEngineCapacity;
        VehicleSeatingCapacity = vehicleSeatingCapacity;
        VehicleAirConditioner = vehicleAirConditioner;
        VehiclePowerDoorLocks = vehiclePowerDoorLocks;
        VehicleAntiLockBrakingSystem = vehicleAntiLockBrakingSystem;
        VehicleBrakeAssist = vehicleBrakeAssist;
        VehiclePowerSteering = vehiclePowerSteering;
        VehicleDriverAirbag = vehicleDriverAirbag;
        VehiclePassengerAirbag = vehiclePassengerAirbag;
        VehiclePowerWindows = vehiclePowerWindows;
        VehicleCDPlayer = vehicleCDPlayer;
        VehicleCentralLocking = vehicleCentralLocking;
        VehicleCrashSensor = vehicleCrashSensor;
        VehicleLeatherSeats = vehicleLeatherSeats;
    }

    public String getVehicleId() {
        return VehicleId;
    }

    public void setVehicleId(String vehicleId) {
        VehicleId = vehicleId;
    }

    public String getVehicleTitle() {
        return VehicleTitle;
    }

    public void setVehicleTitle(String vehicleTitle) {
        VehicleTitle = vehicleTitle;
    }

    public BrandDTO getBrandDTO() {
        return brandDTO;
    }

    public void setBrandDTO(BrandDTO brandDTO) {
        this.brandDTO = brandDTO;
    }

    public String getVehicleOverView() {
        return VehicleOverView;
    }

    public void setVehicleOverView(String vehicleOverView) {
        VehicleOverView = vehicleOverView;
    }

    public String getVehiclePricePerDay() {
        return VehiclePricePerDay;
    }

    public void setVehiclePricePerDay(String vehiclePricePerDay) {
        VehiclePricePerDay = vehiclePricePerDay;
    }

    public String getVehicleModelyear() {
        return VehicleModelyear;
    }

    public void setVehicleModelyear(String vehicleModelyear) {
        VehicleModelyear = vehicleModelyear;
    }

    public String getVehicleFuelType() {
        return VehicleFuelType;
    }

    public void setVehicleFuelType(String vehicleFuelType) {
        VehicleFuelType = vehicleFuelType;
    }

    public String getVehicleEngineCapacity() {
        return VehicleEngineCapacity;
    }

    public void setVehicleEngineCapacity(String vehicleEngineCapacity) {
        VehicleEngineCapacity = vehicleEngineCapacity;
    }

    public String getVehicleSeatingCapacity() {
        return VehicleSeatingCapacity;
    }

    public void setVehicleSeatingCapacity(String vehicleSeatingCapacity) {
        VehicleSeatingCapacity = vehicleSeatingCapacity;
    }

    public String getVehicleAirConditioner() {
        return VehicleAirConditioner;
    }

    public void setVehicleAirConditioner(String vehicleAirConditioner) {
        VehicleAirConditioner = vehicleAirConditioner;
    }

    public String getVehiclePowerDoorLocks() {
        return VehiclePowerDoorLocks;
    }

    public void setVehiclePowerDoorLocks(String vehiclePowerDoorLocks) {
        VehiclePowerDoorLocks = vehiclePowerDoorLocks;
    }

    public String getVehicleAntiLockBrakingSystem() {
        return VehicleAntiLockBrakingSystem;
    }

    public void setVehicleAntiLockBrakingSystem(String vehicleAntiLockBrakingSystem) {
        VehicleAntiLockBrakingSystem = vehicleAntiLockBrakingSystem;
    }

    public String getVehicleBrakeAssist() {
        return VehicleBrakeAssist;
    }

    public void setVehicleBrakeAssist(String vehicleBrakeAssist) {
        VehicleBrakeAssist = vehicleBrakeAssist;
    }

    public String getVehiclePowerSteering() {
        return VehiclePowerSteering;
    }

    public void setVehiclePowerSteering(String vehiclePowerSteering) {
        VehiclePowerSteering = vehiclePowerSteering;
    }

    public String getVehicleDriverAirbag() {
        return VehicleDriverAirbag;
    }

    public void setVehicleDriverAirbag(String vehicleDriverAirbag) {
        VehicleDriverAirbag = vehicleDriverAirbag;
    }

    public String getVehiclePassengerAirbag() {
        return VehiclePassengerAirbag;
    }

    public void setVehiclePassengerAirbag(String vehiclePassengerAirbag) {
        VehiclePassengerAirbag = vehiclePassengerAirbag;
    }

    public String getVehiclePowerWindows() {
        return VehiclePowerWindows;
    }

    public void setVehiclePowerWindows(String vehiclePowerWindows) {
        VehiclePowerWindows = vehiclePowerWindows;
    }

    public String getVehicleCDPlayer() {
        return VehicleCDPlayer;
    }

    public void setVehicleCDPlayer(String vehicleCDPlayer) {
        VehicleCDPlayer = vehicleCDPlayer;
    }

    public String getVehicleCentralLocking() {
        return VehicleCentralLocking;
    }

    public void setVehicleCentralLocking(String vehicleCentralLocking) {
        VehicleCentralLocking = vehicleCentralLocking;
    }

    public String getVehicleCrashSensor() {
        return VehicleCrashSensor;
    }

    public void setVehicleCrashSensor(String vehicleCrashSensor) {
        VehicleCrashSensor = vehicleCrashSensor;
    }

    public String getVehicleLeatherSeats() {
        return VehicleLeatherSeats;
    }

    public void setVehicleLeatherSeats(String vehicleLeatherSeats) {
        VehicleLeatherSeats = vehicleLeatherSeats;
    }

    @Override
    public String toString() {
        return "RegisterVehiclesDTO{" +
                "VehicleId='" + VehicleId + '\'' +
                ", VehicleTitle='" + VehicleTitle + '\'' +
                ", brandDTO=" + brandDTO +
                ", VehicleOverView='" + VehicleOverView + '\'' +
                ", VehiclePricePerDay='" + VehiclePricePerDay + '\'' +
                ", VehicleModelyear='" + VehicleModelyear + '\'' +
                ", VehicleFuelType='" + VehicleFuelType + '\'' +
                ", VehicleEngineCapacity='" + VehicleEngineCapacity + '\'' +
                ", VehicleSeatingCapacity='" + VehicleSeatingCapacity + '\'' +
                ", VehicleAirConditioner='" + VehicleAirConditioner + '\'' +
                ", VehiclePowerDoorLocks='" + VehiclePowerDoorLocks + '\'' +
                ", VehicleAntiLockBrakingSystem='" + VehicleAntiLockBrakingSystem + '\'' +
                ", VehicleBrakeAssist='" + VehicleBrakeAssist + '\'' +
                ", VehiclePowerSteering='" + VehiclePowerSteering + '\'' +
                ", VehicleDriverAirbag='" + VehicleDriverAirbag + '\'' +
                ", VehiclePassengerAirbag='" + VehiclePassengerAirbag + '\'' +
                ", VehiclePowerWindows='" + VehiclePowerWindows + '\'' +
                ", VehicleCDPlayer='" + VehicleCDPlayer + '\'' +
                ", VehicleCentralLocking='" + VehicleCentralLocking + '\'' +
                ", VehicleCrashSensor='" + VehicleCrashSensor + '\'' +
                ", VehicleLeatherSeats='" + VehicleLeatherSeats + '\'' +
                '}';
    }
}
