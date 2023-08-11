package _4_OOPS_Advanced;

public class _A_Reviews {
	private int id ;
	private String description;
	private int rating;
	
	public _A_Reviews(int id, String description, int rating) {
		super();
		this.id = id;
		this.description = description;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "_10_Reviews [id=" + id + ", description=" + description + ", rating=" + rating + "]";
	}
	
	
	
	
}
