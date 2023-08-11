package _4_OOPS_Advanced;

import java.util.ArrayList;

public class _8_Book {
	
	private int id;
	private String name;
	private String author;
	private ArrayList<_A_Reviews> reviews = new ArrayList<>();
	
	//constructor
	
	public _8_Book(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	public void addReview(_A_Reviews reviews ) {
		this.reviews.add(reviews);
	}

	@Override
	public String toString() {
		return "_8_Book [id=" + id + ", name=" + name + ", author=" + author + ", reviews=" + reviews + "]";
	}
	
	
}



