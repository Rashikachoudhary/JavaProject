package incapsulation;

public class Library {
	private int RollNo;
	private int borrowed_book;
	final private int max_books=5;

	public void borrow_book() {
		if(borrowed_book < 5) {
			borrowed_book++;
			System.out.println("you can borrow");
			System.out.println("total borrowed books are : "+borrowed_book);
		}
		else {
			System.out.println("You can't borrow");
		}
	}
	public void returnBook() {
		if(borrowed_book>0) {
			borrowed_book--;
			System.out.println("the book has returned");
		}
		else {
			System.out.println("No book to be returned");
		}
		System.out.println("total borrowed books are : "+borrowed_book);
	}
	public int getborrowed_book() {
		return borrowed_book;
	}
	
}
