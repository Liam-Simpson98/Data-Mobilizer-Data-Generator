package models;

/**
 * Test Vector.
 * 
 * @author Trevor Parlee
 * @version March 4, 2021
 */
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

    /**
     * Test Vector constructor.
     */
    public TestVector() {

    }

    /**
     * Test Vector constructor.
     * @param time is the time value.
     * @param flowRate is the flow rate value.
     * @param range is the range value.
     * @param temp is the temperature value.
     * @param density is the density value.
     * @param grossVolumeIn is the gross volume in value.
     * @param netVolume is the net volume value.
     * @param pressure is the pressure value.
     * @param outage is the outage value.
     * @param grossVolume is the gross volume value.
     * @param grossHeel is the gross heel value.
     * @param loadStatus is the load status value.
     * @param tLoadStatus is the tload value.
     * @param sPOutage is the SP outage value.
     * @param carID is the identification of the car.
     */
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

    /**
     * Get Time.
     * 
     * @return the time value.
     */
    public double getTime() {
        return time;
    }

    /**
     * Set Time.
     * 
     * @param time is the time value.
     */
    public void setTime(double time) {
        this.time = time;
    }

    /**
     * Get Flow Rate.
     * 
     * @return the flow rate value.
     */
    public double getFlowRate() {
        return flowRate;
    }

    /**
     * Set Flow Rate.
     * 
     * @param flowRate is the flow rate value.
     */
    public void setFlowRate(double flowRate) {
        this.flowRate = flowRate;
    }

    /**
     * Get Range.
     * 
     * @return the range value.
     */
    public double getRange() {
        return range;
    }

    /**
     * Set Range.
     * 
     * @param range is the range value.
     */
    public void setRange(double range) {
        this.range = range;
    }

    /**
     * Get Temperature.
     * 
     * @return the temperature value.
     */
    public double getTemp() {
        return temp;
    }

    /**
     * Set Temperature.
     * 
     * @param temp is the temperature value.
     */
    public void setTemp(double temp) {
        this.temp = temp;
    }

    /**
     * Get Density.
     * 
     * @return the density value.
     */
    public double getDensity() {
        return density;
    }

    /**
     * Set Density.
     * 
     * @param density is the density value.
     */
    public void setDensity(double density) {
        this.density = density;
    }

    /**
     * Get Gross Volume In.
     * 
     * @return the gross volume in value.
     */
    public double getGrossVolumeIn() {
        return grossVolumeIn;
    }

    /**
     * Set Gross Volume In.
     * 
     * @param grossVolumeIn is the gross volume in value.
     */
    public void setGrossVolumeIn(double grossVolumeIn) {
        this.grossVolumeIn = grossVolumeIn;
    }

    /**
     * Get Net Volume.
     * 
     * @return the net volume value.
     */
    public double getNetVolume() {
        return netVolume;
    }

    /**
     * Set Net Volume.
     * 
     * @param netVolume is the net volume value.
     */
    public void setNetVolume(double netVolume) {
        this.netVolume = netVolume;
    }

    /**
     * Get Pressure.
     * 
     * @return the pressure value.
     */
    public double getPressure() {
        return pressure;
    }

    /**
     * Set Pressure.
     * 
     * @param pressure is the pressure value.
     */
    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    /**
     * Get Outage.
     * 
     * @return the outage value.
     */
    public double getOutage() {
        return outage;
    }

    /**
     * Set Outage.
     * 
     * @param outage is the outage value.
     */
    public void setOutage(double outage) {
        this.outage = outage;
    }

    /**
     * Get Gross Volume.
     * 
     * @return the gross volume value.
     */
    public double getGrossVolume() {
        return grossVolume;
    }

    /**
     * Set Gross Volume.
     * 
     * @param grossVolume is the gross volume value.
     */
    public void setGrossVolume(double grossVolume) {
        this.grossVolume = grossVolume;
    }

    /**
     * Get Gross Heel.
     * 
     * @return the gross heel value.
     */
    public double getGrossHeel() {
        return grossHeel;
    }

    /**
     * Set Gross Heel.
     * 
     * @param grossHeel is the gross heel value.
     */
    public void setGrossHeel(double grossHeel) {
        this.grossHeel = grossHeel;
    }

    /**
     * Get Load Status.
     * 
     * @return the load status value.
     */
    public int getLoadStatus() {
        return loadStatus;
    }

    /**
     * Set Load Status.
     * 
     * @param loadStatus is the load status value.
     */
    public void setLoadStatus(int loadStatus) {
        this.loadStatus = loadStatus;
    }

    /**
     * Get tLoad Status.
     * 
     * @return the tload status value.
     */
    public int gettLoadStatus() {
        return tLoadStatus;
    }

    /**
     * Set tLoad Status.
     * 
     * @param tLoadStatus is the tload status value.
     */
    public void settLoadStatus(int tLoadStatus) {
        this.tLoadStatus = tLoadStatus;
    }

    /**
     * Get SP Outage.
     * 
     * @return the SP outage value.
     */
    public double getsPOutage() {
        return sPOutage;
    }

    /**
     * Set SO Outage.
     * 
     * @param sPOutage is the SP outage value.
     */
    public void setsPOutage(double sPOutage) {
        this.sPOutage = sPOutage;
    }

    /**
     * Get Car ID.
     * 
     * @return the identification of the car.
     */
    public String getCarID() {
        return carID;
    }

    /**
     * Set Car ID.
     * 
     * @param carID is the identification of the car.
     */
    public void setCarID(String carID) {
        this.carID = carID;
    }

    /**
     * To String.
     * 
     * @return the string format.
     */
    @Override
    public String toString() {
        return time + ", " + flowRate + ", " + range + ", " + temp
                + ", " + density + ", " + grossVolumeIn + ", " + netVolume
                + ", " + pressure + ", " + outage + ", " + grossVolume + ", "
                + grossHeel + ", " + loadStatus + ", " + tLoadStatus + ", " + sPOutage
                + ", " + carID + "\n";
    }

}
