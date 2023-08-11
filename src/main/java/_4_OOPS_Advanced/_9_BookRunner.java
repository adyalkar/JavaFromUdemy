package _4_OOPS_Advanced;

public class _9_BookRunner {

	public static void main(String[] args) {
		
		
		_8_Book book = new _8_Book(101,"Math","Anup");
		book.addReview(new _A_Reviews(101,"The book is good",5));
		book.addReview(new _A_Reviews(101,"The book is extra-ordinory",9));

		System.out.println(book);

	}

}
