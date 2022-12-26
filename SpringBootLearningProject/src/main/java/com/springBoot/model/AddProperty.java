package com.springBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name ="property_details")
public class AddProperty {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String houseNo;
	private String landMark;
	private String pinCode;
	private String streetNo;
	private int floor;
	private String roomRent;
	private String sharing;
	
	private String amenities;
	private String fileName;
	private String url;
	
	
	
	
	
	public String getRoomRent() {
		return roomRent;
	}

	public void setRoomRent(String roomRent) {
		this.roomRent = roomRent;
	}

	public String getSharing() {
		return sharing;
	}

	public void setSharing(String sharing) {
		this.sharing = sharing;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public String getAmenities() {
		return amenities;
	}

	public void setAmenities(String amenities) {
		this.amenities = amenities;
	}

	@Override
	public String toString() {
		return "AddProperty [id=" + id + ", houseNo=" + houseNo + ", landMark=" + landMark + ", pinCode=" + pinCode
				+ ", streetNo=" + streetNo + ", floor=" + floor + ", roomRent=" + roomRent + ", sharing=" + sharing
				+ ", amenities=" + amenities + ", fileName=" + fileName + ", url=" + url + "]";
	}

	

}
