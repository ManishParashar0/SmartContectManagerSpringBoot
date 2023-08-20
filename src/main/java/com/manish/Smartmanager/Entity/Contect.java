package com.manish.Smartmanager.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "contect")
public class Contect {
	@Id()
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String name, nickname, email, work, imageurl;
	private Long mobile;
	@Column(length = 500)
	private String discription;
	@ManyToOne()
	private User user;

	public Contect() {
		super();
	}

	public Contect(int cid, String name, String nickname, String email, String work, String imageurl, Long mobile,
			String discription) {
		super();
		this.cid = cid;
		this.name = name;
		this.nickname = nickname;
		this.email = email;
		this.work = work;
		this.imageurl = imageurl;
		this.mobile = mobile;
		this.discription = discription;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

}
