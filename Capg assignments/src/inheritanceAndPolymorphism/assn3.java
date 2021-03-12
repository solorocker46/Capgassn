package inheritanceAndPolymorphism;
import java.util.*;
abstract class Item
{
	private int id;
	private String title;
	private int copies;
	public Item(int id, String title, int copies) {
		super();
		this.id = id;
		this.title = title;
		this.copies = copies;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCopies() {
		return copies;
	}
	public void setCopies(int copies) {
		this.copies = copies;
	}
	public boolean equals(Item item)
	{
		if(item == null)
		{
			return false;
		}
		if(id == item.id && title.equals(item.title) && copies == item.copies)
		{
			return true;
		}
		return false;
		
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", title=" + title + ", copies=" + copies + "]";
	}
	public void checkIn()
	{
		copies += 1;
	}
	public void checkOut()
	{
		copies -= 1;
	}
	public void addItem(int id, String name, int copies)
	{
		setId(id);
		setTitle(name);
		setCopies(copies);
	}
	public void print()
	{
		System.out.println("Id = "+id);
		System.out.println("Title = "+title);
		System.out.println("Number of copies = "+copies);
	}
}
abstract class WrittenItem extends Item
{
	private String author;

	public WrittenItem(int id, String title, int copies, String author) {
		super(id, title, copies);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "WrittenItem [author=" + author + "]";
	}
	
}
class Book extends WrittenItem
{

	public Book(int id, String title, int copies, String author) {
		super(id, title, copies, author);
		// TODO Auto-generated constructor stub
	}
	
}
class JournalPaper extends WrittenItem
{
	private int year;
	public JournalPaper(int id, String title, int copies, String author, int year) {
		super(id, title, copies, author);
		this.year = year;
	}
	
	
}
abstract class MediaItem extends Item
{

	public MediaItem(int id, String title, int copies) {
		super(id, title, copies);
		// TODO Auto-generated constructor stub
	}
	
}
public class assn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
