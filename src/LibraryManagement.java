package assigned;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class LibraryManagement {
	    public static void main(String[] args) {
	        List<Book> books = new ArrayList<>();
	        List<Member> members = new ArrayList<>();

	        // Adding books to the library
	        books.add(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", "Fiction", 5));
	        books.add(new Book(2, "1984", "George Orwell", "Dystopian", 3));
	        books.add(new Book(3, "To Kill a Mockingbird", "Harper Lee", "Fiction", 1));

	        // Adding members to the library
	        members.add(new Member(1, "Alice", "1234567890"));
	        members.add(new Member(2, "Bob", "0987654321"));
	        members.add(new Member(3, "Janani", "1232345678"));

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
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine();  // Consume newline

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
	                        if (m.getName().equalsIgnoreCase(memberName)) {
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
	                        if (b.getTitle().equalsIgnoreCase(bookTitle)) {
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
	                        if (m.getName().equalsIgnoreCase(memberName)) {
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
	                        if (b.getTitle().equalsIgnoreCase(bookTitle)) {
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
	                case 5:
	                    exit = true;
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }

	        scanner.close();
	    }

	    public static void borrowBook(Member member, Book book) {
	        if (book.getQuantity() > 0) {
	            book.setQuantity(book.getQuantity() - 1);
	            member.addBook(book);
	            System.out.println(member.getName() + " has borrowed " + book.getTitle());
	        } else {
	            System.out.println("Book is not available.");
	        }
	    }

	    public static void returnBook(Member member, Book book) {
	        if (member.getBooksBorrowed().contains(book)) {
	            book.setQuantity(book.getQuantity() + 1);
	            member.removeBook(book);
	            System.out.println(member.getName() + " has returned " + book.getTitle());
	        } else {
	            System.out.println("This book was not borrowed by the member.");
	        }
	    }
	}

	class Book {
	    private int id;
	    private String title;
	    private String author;
	    private String genre;
	    private int quantity;

	    public Book(int id, String title, String author, String genre, int quantity) {
	        this.id = id;
	        this.title = title;
	        this.author = author;
	        this.genre = genre;
	        this.quantity = quantity;
	    }

	    // Getters and Setters
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

	    public String getAuthor() {
	        return author;
	    }

	    public void setAuthor(String author) {
	        this.author = author;
	    }

	    public String getGenre() {
	        return genre;
	    }

	    public void setGenre(String genre) {
	        this.genre = genre;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(int quantity) {
	        this.quantity = quantity;
	    }

	    @Override
	    public String toString() {
	        return "Book{" +
	                "bookId=" + id +
	                ", title='" + title + '\'' +
	                ", author='" + author + '\'' +
	                ", genre='" + genre + '\'' +
	                ", quantityAvailable=" + quantity +
	                '}';
	    }
	}

	class Member {
	    private int memId;
	    private String name;
	    private String phoneNumber;
	    private List<Book> booksBorrowed;

	    public Member(int memId, String name, String phoneNumber) {
	        this.memId = memId;
	        this.name = name;
	        this.phoneNumber = phoneNumber;
	        this.booksBorrowed = new ArrayList<>();
	    }

	    // Getters and Setters
	    public int getMemId() {
	        return memId;
	    }

	    public void setMemId(int memId) {
	        this.memId = memId;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getPhoneNumber() {
	        return phoneNumber;
	    }

	    public void setPhoneNumber(String phoneNumber) {
	        this.phoneNumber = phoneNumber;
	    }

	    public List<Book> getBooksBorrowed() {
	        return booksBorrowed;
	    }

	    public void addBook(Book book) {
	        booksBorrowed.add(book);
	    }

	    public void removeBook(Book book) {
	        booksBorrowed.remove(book);
	    }

	    @Override
	    public String toString() {
	        return "Member{" +
	                "memberId=" + memId +
	                ", name='" + name + '\'' +
	                ", phoneNumber='" + phoneNumber + '\'' +
	                ", booksBorrowed=" + booksBorrowed +
	                '}';
	    }
	}



