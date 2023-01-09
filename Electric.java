package com.assignment.jsf.electricbill;

public class Electric {
	String meterId;
	String current_Meter_Reading;
	String previous_Meter_Reading;
	String zone;
	long result;
	public Electric()
	{
		super();
	}

	public Electric(String meterId, String current_Meter_Reading, String previous_Meter_Reading, String zone,
			long result) {

		super();
		this.meterId = meterId;
		this.current_Meter_Reading = current_Meter_Reading;
		this.previous_Meter_Reading = previous_Meter_Reading;
		this.zone = zone;
		this.result = result;
	}
	public String getMeterId() {
		return meterId;
	}
	
	public void setMeterId(String meterId) {
		this.meterId = meterId;
	}

	public String getCurrent_Meter_Reading() {
		return current_Meter_Reading;
	}

	public void setCurrent_Meter_Reading(String current_Meter_Reading) {
		this.current_Meter_Reading = current_Meter_Reading;
	}

	public String getPrevious_Meter_Reading() {
		return previous_Meter_Reading;
	}

	public void setPrevious_Meter_Reading(String previous_Meter_Reading) {
		this.previous_Meter_Reading = previous_Meter_Reading;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public long getResult() {
		return result;
	}

	public void setResult(long result) {
		this.result = result;
	}

}