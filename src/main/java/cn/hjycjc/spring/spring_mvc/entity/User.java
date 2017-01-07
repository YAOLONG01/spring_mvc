package cn.hjycjc.spring.spring_mvc.entity;

public class User {
	private String username;
	private Integer age;
	private String password;
	
	private Address address;

	public User() {
	}

	public User(String username, Integer age, String password, Address address) {
		this.username = username;
		this.age = age;
		this.password = password;
		this.address = address;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", age=" + age + ", password=" + password + ", address=" + address + "]";
	}

}
