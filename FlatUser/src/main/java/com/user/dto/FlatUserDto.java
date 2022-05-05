package com.user.dto;

public class FlatUserDto {
		private long id;
		private String name;
		private String flatNo;
		private String location;
		private String city;
		private String type;
		private Double price;
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getFlatNo() {
			return flatNo;
		}
		public void setFlatNo(String flatNo) {
			this.flatNo = flatNo;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public Double getPrice() {
			return price;
		}
		public void setPrice(Double price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "FlatUserDto [id=" + id + ", name=" + name + ", flatNo=" + flatNo + ", location=" + location
					+ ", city=" + city + ", type=" + type + ", price=" + price + "]";
		}
		

	}

