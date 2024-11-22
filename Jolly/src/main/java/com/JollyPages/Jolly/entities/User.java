package com.JollyPages.Jolly.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Transient;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	private String firstname;
	private String lastname;
	private String password;
	private String gmail;
	private String weight;
	private String height;
	private String goal;
	@Transient
	private int otp;
	@ManyToOne
	private Workout workout;
	@ManyToOne
	private Diet diet;
	
	@PrePersist
    protected void onCreate() {
        this.timestamp = LocalDateTime.now(); // Automatically set the timestamp before insert
    }
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	private LocalDateTime timestamp;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public int getId() {
		return userid;
	}
	public void setId(int userid) {
		this.userid = userid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getGoal() {
		return goal;
	}
	public void setGoal(String goal) {
		this.goal = goal;
	}
	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}
	public Workout getWorkout() {
		return workout;
	}
	public void setWorkout(Workout workout) {
		this.workout = workout;
	}
	public Diet getDiet() {
		return diet;
	}
	public void setDiet(Diet diet) {
		this.diet = diet;
	}
	
	
	@Override
	public String toString() {
		return "User [userid=" + userid + ", firstname=" + firstname + ", lastname=" + lastname + ", password="
				+ password + ", gmail=" + gmail + ", weight=" + weight + ", height=" + height + ", goal=" + goal
				+ ", otp=" + otp + ", workout=" + workout + ", diet=" + diet + ", timestamp=" + timestamp + "]";
	}


	public User(int userid, String firstname, String lastname, String password, String gmail, String weight,
			String height, String goal, int otp, Workout workout, Diet diet, LocalDateTime timestamp) {
		super();
		this.userid = userid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.gmail = gmail;
		this.weight = weight;
		this.height = height;
		this.goal = goal;
		this.otp = otp;
		this.workout = workout;
		this.diet = diet;
		this.timestamp = timestamp;
	}


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
