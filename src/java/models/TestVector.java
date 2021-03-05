package models;

public class TestVector {

    private double time;
    private double flowRate;
    private double range;
    private double temp;
    private double density;
    private double grossVolumeIn;
    private double netVolume;
    private double pressure;
    private double outage;
    private double grossVolume;
    private double grossHeel;
    private int loadStatus;
    private int tLoadStatus;
    private double sPOutage;
    private String carID;

    public TestVector() {

    }

    public TestVector(double time, double flowRate, double range, double temp, double density, double grossVolumeIn,
            double netVolume, double pressure, double outage, double grossVolume, double grossHeel, int loadStatus,
            int tLoadStatus, double sPOutage, String carID) {

        this.time = time;
        this.flowRate = flowRate;
        this.range = range;
        this.temp = temp;
        this.density = density;
        this.grossVolumeIn = grossVolumeIn;
        this.netVolume = netVolume;
        this.pressure = pressure;
        this.outage = outage;
        this.grossVolume = grossVolume;
        this.grossHeel = grossHeel;
        this.loadStatus = loadStatus;
        this.tLoadStatus = tLoadStatus;
        this.sPOutage = sPOutage;
        this.carID = carID;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getFlowRate() {
        return flowRate;
    }

    public void setFlowRate(double flowRate) {
        this.flowRate = flowRate;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getGrossVolumeIn() {
        return grossVolumeIn;
    }

    public void setGrossVolumeIn(double grossVolumeIn) {
        this.grossVolumeIn = grossVolumeIn;
    }

    public double getNetVolume() {
        return netVolume;
    }

    public void setNetVolume(double netVolume) {
        this.netVolume = netVolume;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getOutage() {
        return outage;
    }

    public void setOutage(double outage) {
        this.outage = outage;
    }

    public double getGrossVolume() {
        return grossVolume;
    }

    public void setGrossVolume(double grossVolume) {
        this.grossVolume = grossVolume;
    }

    public double getGrossHeel() {
        return grossHeel;
    }

    public void setGrossHeel(double grossHeel) {
        this.grossHeel = grossHeel;
    }

    public int getLoadStatus() {
        return loadStatus;
    }

    public void setLoadStatus(int loadStatus) {
        this.loadStatus = loadStatus;
    }

    public int gettLoadStatus() {
        return tLoadStatus;
    }

    public void settLoadStatus(int tLoadStatus) {
        this.tLoadStatus = tLoadStatus;
    }

    public double getsPOutage() {
        return sPOutage;
    }

    public void setsPOutage(double sPOutage) {
        this.sPOutage = sPOutage;
    }

    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    @Override
    public String toString() {
        return time + ", " + flowRate + ", " + range + ", " + temp
                + ", " + density + ", " + grossVolumeIn + ", " + netVolume
                + ", " + pressure + ", " + outage + ", " + grossVolume + ", "
                + grossHeel + ", " + loadStatus + ", " + tLoadStatus + ", " + sPOutage
                + ", " + carID + "\n";
    }

}
