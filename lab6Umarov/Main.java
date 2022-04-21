package lab6Umarov;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		//initialize some scanner
		Scanner in = new Scanner(System.in);
		//create an instance of library class

		Student student1 = new Student(20000, "Damir", "Suleimenov", "IT1-2005");
		Student student2 = new Student(20001, "Amir", "Dauletbekov", "IT1-2005");
		Pupil pupil1 = new Pupil(10000, "Adlet", "Kauletov", "9 A");
		Pupil pupil2 = new Pupil(10001, "Gegel", "Farcs", "9 B");

		ArrayList<User> users = new ArrayList<>();
		users.add(student1);
		users.add(student2);
		users.add(pupil1);
		users.add(pupil2);
		Book book1 = new Book("War and Peace", "Lev Tolstoy", "10000", 1886,20,student1.checkUser(student1) );
		Book book2 = new Book("Les Misérables", " Victor Hugo", "10001", 1862,18,student1.checkUser(student1) );
		Book book3 = new Book("Auditor ", "Nikolai Gogol", "10002", 1836,15,student1.checkUser(student1));
		Book book4 = new Book("Three Comrades ", "Erich Maria Remarque", "10003", 1936,13,student1.checkUser(student1));
		Book book5 = new Book("Le Petit Prince", "Antoine de Saint-Exupery", "10004", 1942, 12, pupil1.checkUser(pupil1));
		Book book6 = new Book("Evil book", "Magnus Mist", "10005", 2021, 10,pupil1.checkUser(pupil1));

		ArrayList<Book> books = new ArrayList<>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		books.add(book6);
		Library library = new Library(books,users);
		int choice = -1;
		
		while (choice != 0) {
			System.out.println();
			System.out.println("Welcome to the IITU Library");
			System.out.println("1. Add book");
			System.out.println("2. Add user");
			System.out.println("3. Give book to user");
			System.out.println("4. Return book from user");
			System.out.println("5. Print books information");
			System.out.println("6. Print user information");
			System.out.println("7. Print users's books");
			System.out.println("0. Exit");
			
			choice = in.nextInt();
			
			switch (choice) {
				case 1:
				//here you have to add an opportunity to create an instance of a book class
				//and then you have to call corresponding method from library class in order to add created book
					library.addBook();

					break;
				case 2:
				// same as for case 1, but for "student" object
					library.addUser();
					break;
				case 3:
				//here you have to call corresponding method for adding a certain book for a certain student
					library.addBookToUser();
					break;
				case 4:
				//here you have to call corresponding method for returning a certain book from a certain student
					library.returnBookFromStudent();
					break;
				case 5:
				//here you have to call method in order to print info about all books in library
					library.printBooksInformation();
					break;
				case 6:
				//here you have to call method in order to print info about all students registered in library
					library.printUsersInformation();
					break;
				case 7:
				//here you have to call method in order to print info about books holded by a certain student
					library.printStudentsBooks();
					break;
			}
		}
	}
}
