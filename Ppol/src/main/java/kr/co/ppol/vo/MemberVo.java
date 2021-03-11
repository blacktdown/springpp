package kr.co.ppol.vo;

public class MemberVo {
	
	private String uid;
	private String pass;
	private String name;
	private String nick;
	private String email;
	private String hp;
	private int grade;
	private int sample6_postcode;
	private String sample6_address;
	private String sample6_detailAddress;
	private String sample6_extraAddress;
	private String regip;
	public int getSample6_postcode() {
		return sample6_postcode;
	}
	public void setSample6_postcode(int sample6_postcode) {
		this.sample6_postcode = sample6_postcode;
	}
	public String getSample6_address() {
		return sample6_address;
	}
	public void setSample6_address(String sample6_address) {
		this.sample6_address = sample6_address;
	}
	public String getSample6_detailAddress() {
		return sample6_detailAddress;
	}
	public void setSample6_detailAddress(String sample6_detailAddress) {
		this.sample6_detailAddress = sample6_detailAddress;
	}
	public String getSample6_extraAddress() {
		return sample6_extraAddress;
	}
	public void setSample6_extraAddress(String sample6_extraAddress) {
		this.sample6_extraAddress = sample6_extraAddress;
	}
	private String rdate;
	
	//추가필드(폼)
	private String pass1;
	
	
	public String getPass1() {
		return pass1;
	}
	public void setPass1(String pass1) {
		this.pass1 = pass1;
	}
	
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getRegip() {
		return regip;
	}
	public void setRegip(String regip) {
		this.regip = regip;
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}

}