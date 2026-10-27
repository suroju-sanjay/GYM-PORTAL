package com.sanjay.gym.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "gym")
@Setter
@Getter
public class Gym {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	String name;
	String phone;
	String email;
	Integer age;
	String gender;
	String plan;
	Integer duration;
	Double amount;
	String joiningDate;
	String status;
//		public Integer getId() {
//			return id;
//		}
//		public void setId(Integer id) {
//			this.id = id;
//		}
//		public String getName() {
//			return name;
//		}
//		public void setName(String name) {
//			this.name = name;
//		}
//		public String getPhone() {
//			return phone;
//		}
//		public void setPhone(String phone) {
//			this.phone = phone;
//		}
//		public String getEmail() {
//			return email;
//		}
//		public void setEmail(String email) {
//			this.email = email;
//		}
//		public Integer getAge() {
//			return age;
//		}
//		public void setAge(Integer age) {
//			this.age = age;
//		}
//		public String getGender() {
//			return gender;
//		}
//		public void setGender(String gender) {
//			this.gender = gender;
//		}
//		public String getPlan() {
//			return plan;
//		}
//		public void setPlan(String plan) {
//			this.plan = plan;
//		}
//		public Integer getDuration() {
//			return duration;
//		}
//		public void setDuration(Integer duration) {
//			this.duration = duration;
//		}
//		public Double getAmount() {
//			return amount;
//		}
//		public void setAmount(Double amount) {
//			this.amount = amount;
//		}
//		public String getJoiningDate() {
//			return joiningDate;
//		}
//		public void setJoiningDate(String joiningDate) {
//			this.joiningDate = joiningDate;
//		}
//		public String getStatus() {
//			return status;
//		}
//		public void setStatus(String status) {
//			this.status = status;
//		}
}
