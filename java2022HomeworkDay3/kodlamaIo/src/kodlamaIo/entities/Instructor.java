package kodlamaIo.entities;

public class Instructor extends User {

	private String firstName;
	private String lasttName;
	private String imageUrl;

	public Instructor(String firstName, String lasttName, String imageUrl, int id, String email, String password) {
		super(id, email, password);
		this.firstName = firstName;
		this.lasttName = lasttName;
		this.imageUrl = imageUrl;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLasttName() {
		return lasttName;
	}

	public void setLasttName(String lasttName) {
		this.lasttName = lasttName;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}
