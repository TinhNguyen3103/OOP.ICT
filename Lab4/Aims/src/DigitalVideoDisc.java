
public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	
	//Constructor
	
	public DigitalVideoDisc(String title) {
		super();
		this.setTitle(title);
	}
	
	public  DigitalVideoDisc(String title,String category) {
		super();
		this.setTitle(title);
		this.setCategory(category);
	}
	public  DigitalVideoDisc(String title, String category, String director) {
		super();
		this.setTitle(title);
		this.setCategory(category);
		this.setDirector(director);
	}
	public  DigitalVideoDisc(String title,String category, String director, int length, float cost) {
		super();
		this.setTitle(title);
		this.setCategory(category);
		this.setCost(cost);
		this.setLength(length);
		this.setDirector(director);
	}
	
	
	// Getter and setter
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
}