package models;


public class TestVector {
    double Time;
	double flowRate;
	double range;
	double temp;
	double density;
	double grossVolumeIn;
	double netVolume;
	double pressure;
	double outage;
	double grossVolume;
	double grossHeel;
	int loadStatus;
	int tLoadStatus;
	double sPOutage;
	String carID;
	
	public TestVector() {
		double Time = 0;
		double flowRate = 0;
		double range = 0; 
		double temp = 0;
		double density = 0;
		double grossVolumeIn = 0;
		double netVolume = 0;
		double pressure = 0;
		double outage = 0;
		double grossVolume = 0;
		double grossHeel = 0;
		int loadStatus = 0;
		int tLoadStatus = 0;
		double sPOutage = 0;
		String carID = null;
	}
	public TestVector(double time, double flowRate, double range, double temp, double density, double grossVolumeIn,
			double netVolume, double pressure, double outage, double grossVolume, double grossHeel, int loadStatus,
			int tLoadStatus, double sPOutage, String carID) {
		super();
		Time = time;
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
		return Time;
	}
	public void setTime(double time) {
		Time = time;
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
		return Time + ", " + flowRate + ", " + range + ", " + temp
				+ ", " + density + ", " + grossVolumeIn + ", " + netVolume
				+ ", " + pressure + ", " + outage + ", " + grossVolume + ", "
				+ grossHeel + ", " + loadStatus + ", " + tLoadStatus + ", " + sPOutage
				+ ", " + carID+"\n";
	}
	
}
