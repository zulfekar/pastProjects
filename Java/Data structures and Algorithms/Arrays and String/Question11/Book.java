package Question11;
public class Book {
	long isbn;
	String title, author;
	int yearPublication;
	double price;
	
	Book(long isbn, String title, String author, int yearPublication, double price) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.yearPublication = yearPublication;
		this.price = price;
	}
	
	public long getISBN() {
		return isbn;
	}
	public void setISBN(long isbn) {
		this.isbn = isbn;
	}
	
	public String getTITLE() {
		return title;
	}
	public void setTITLE(String title) {
		this.title = title;
	}
	
	public String getAUTHOR() {
		return author;
	}
	public void setAUTHOR(String author) {
		this.author = author;
	}
	
	public int getYEARPUBLICATION() {
		return yearPublication;
	}
	public void setYEARPUBLICATION(int yearPublication) {
		this.yearPublication = yearPublication;
	}
	
	public double getPRICE() {
		return price;
	}
	public void setPRICE(long price) {
		this.price = price;
	}
	
	public String toString () {
		return "isbn: "+ getISBN() + " & title: "+ title + " & author: "+ author + " & year of publication: "+ yearPublication + " & price: "+ price;
	}
}
