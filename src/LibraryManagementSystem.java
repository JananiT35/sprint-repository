import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class LibraryManagementSystem {
	public static void main(String[] args) {
		 List<Book> books = new ArrayList<>();
	        List<Member> members = new ArrayList<>();
    
	        books.add(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", "Fiction", 5));
	        books.add(new Book(2, "1984", "George Orwell", "Dystopian", 3));
	        books.add(new Book(3, "To Kill a Mockingbird", "Harper Lee", "Fiction", 4));
	        books.add(new Book(4, "Harry Potter", "J.K.Rowling", "Fiction", 10));
	        
	        members.add(new Member(1, "Alice", 1234567890));
	        members.add(new Member(2, "Bob",   987654321));
	        members.add(new Member(3, "Janani",1232345678));
	        
	        System.out.println("Books in the library:");
	        for (Book book : books) {
	            System.out.println(book);
	        }
	        
	        System.out.println("\nMembers of the library:");
	        for (Member member : members) {
	            System.out.println(member);
	        }
	        
	        Scanner scanner = new Scanner(System.in);
	     boolean exit = false;

	        while (!exit) {
	            System.out.println("\nLibrary Management System");
	            System.out.println("1. Display all books");
	            System.out.println("2. Display all members");
	            System.out.println("3. Borrow a book");
	            System.out.println("4. Return a book");
	            //System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine();  
	            switch (choice) {
                case 1:
                    System.out.println("Books in the library:");
                    for (Book book : books) {
                        System.out.println(book);
                    }
                    break;
                case 2:
                    System.out.println("Members of the library:");
                    for (Member member : members) {
                        System.out.println(member);
                    }
                    break;
                case 3:
                    System.out.print("Enter member name: ");
                    String memberName = scanner.nextLine();
                    Member member = null;
                    for (Member m : members) {
                        if (m.getname().equalsIgnoreCase(memberName)) {
                            member = m;
                            break;
                        }
                    }
                    if (member == null) {
                        System.out.println("Member not found.");
                        break;
                    }

                    System.out.print("Enter book title: ");
                    String bookTitle = scanner.nextLine();
                    Book book = null;
                    for (Book b : books) {
                    	if (b.gettitle().equalsIgnoreCase(bookTitle)) {
                            book = b;
                            break;
                        }
                    }
                    if (book == null) {
                        System.out.println("Book not found.");
                        break;
                    }

                    borrowBook(member, book);
                    break;
                case 4:
                    System.out.print("Enter member name: ");
                    memberName = scanner.nextLine();
                    member = null;
                    for (Member m : members) {
                        if (m.getname().equalsIgnoreCase(memberName)) {
                            member = m;
                            break;
                        }
                    }
                    if (member == null) {
                        System.out.println("Member not found.");
                        break;
                    }

                    System.out.print("Enter book title: ");
                    bookTitle = scanner.nextLine();
                    book = null;
                    for (Book b : books) {
                        if (b.gettitle().equalsIgnoreCase(bookTitle)) {
                        	book = b;
                            break;
                        }
                    }
                    if (book == null) {
                        System.out.println("Book not found.");
                        break;
                    }

                    returnBook(member, book);
                    break;
                /*case 5:
                    exit = true;
                    break;*/
                default:
                	System.out.println("Invalid choice. Please try again.");
	            }     
	}
	        

}
	public static void borrowBook(Member member, Book book) {
	    if (book.getquantity() > 0) {
	        book.setquantity(book.getquantity() - 1);
	        member.addBook(book);
	        System.out.println(member.getname() + " has borrowed " + book.gettitle());
	    } else {
	        System.out.println("Book is not available.");
	    }
	}
	public static void returnBook(Member member, Book book) {
	    if (member.getBooksBorrowed().contains(book)) {
	        book.setquantity(book.getquantity() + 1);
	        member.removeBook(book);
	        System.out.println(member.getname() + " has returned " + book.gettitle());
	    } else {
	        System.out.println("This book was not borrowed by the member.");
	    }
	}
	}
class Book{
	private int id;
	private String title;
	private String author;
	private String genre;
	private int quantity;
	Book(int id,String title,String author,String genre,int quantity){
		this.id=id;
		this.title=title;
		this.author=author;
		this.genre=genre;
		this.quantity=quantity;
	}
	public int getid() {
		return id;
	}
	void setid(int id) {
		this.id=id;
	}
	public String gettitle() {
		return title;
	}
	void settitle(String title) {
		this.title=title;
	}
	public String getauthor() {
		return author;
	}
	void setauthor(String author) {
		this.author=author;
	}
	public String getgenre() {
		return genre;
	}
	void setgenre(String genre) {
		this.genre=genre;
	}
	public int getquantity() {
		return quantity;
	}
	void setquantity(int quantity) {
		this.quantity=quantity;
	}
	public String toString() {
        return "Book{" +"bookId=" + id +  ", title='" + title + '\'' + ", author='" + author + '\'' +", genre='" + genre + '\'' + ", quantityAvailable=" + quantity +'}';
    }
}
class Member{
	private int memid;
	private String name;
	private int phno;
    private List<Book> booksborrowed;
    Member(int memid,String name,int phno){
    	this.memid=memid;
    	this.name=name;
    	this.phno=phno;
    	this.booksborrowed = new ArrayList<>();
    }
    
    public int getmemid() {
    	return memid;
    }
    void setmemid(int memid) {
    	this.memid=memid;
    }
    
    public String getname() {
    	return name;
    }
    void setname(String name) {
    	this.name=name;
    }
    
    public int getphno() {
    	return phno;
    }
    void setphno(int phno) {
    	this.phno=phno;
    }
	
    public List<Book> getBooksBorrowed() {
        return booksborrowed;
    }

    public void addBook(Book book) {
        booksborrowed.add(book);
    }

    public void removeBook(Book book) {
        booksborrowed.remove(book);
    }

    @Override
    public String toString() {
        return "Member{" +  "memberId=" + memid +", name='" + name + '\'' + ", phoneNumber='" + phno+ '\'' + ", booksBorrowed=" + booksborrowed +  '}';
    }
}

