package lab6Umarov;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();


    //fill this class with all necessary fields
    //as well as do not forget to add constructor, which will allow to create an instance of that class later on
    //note: create an arraylist of books and students within the constructor (why?).
    Library(ArrayList<Book> books, ArrayList<User> users) {
        this.books = books;
        this.users = users;
    }

    //this method allows to add book to library
    public void addBook(Book book) {
        this.books.add(book);
    }
    public void addBook() {
        Pupil pupil = new Pupil();
        Student student = new Student();
        Scanner in = new Scanner(System.in);
        System.out.println("Write author name");
        String author = in.nextLine();
        System.out.println("Write title of the book");
        String title = in.nextLine();
        /*System.out.println("Write ISBN ");
        String isbn = in.nextLine();*/
        System.out.println("Write year ");
        int year = in.nextInt();

        System.out.println("Write quantity of books");
        int quanity = in.nextInt();
        System.out.println("Who will read this book?\n0 - Student\n1 - Pupil");
        int choose = in.nextInt();
        String forwho;
        if (choose == 0) {
            Book book = new Book(title, author, 10001 + books.size() + " ", year, quanity,student);
            books.add(book);
        }else{
            Book book = new Book(title, author, 10001 + books.size() + " ", year, quanity,pupil);
            books.add(book);
        }



    }

    //this method allows to add students to library
    public void addUser(User user) {
        this.users.add(user);
    }

    public void addUser(){
        Scanner in = new Scanner(System.in);
        System.out.println("Write name");
        String name = in.nextLine();
        System.out.println("Write surname");
        String surname = in.nextLine();
        System.out.println("Write group ");
        String group = in.nextLine();
        System.out.println("Write who do you want to create\n0 - Student\n1 - Pupil");
        int num = in.nextInt();
        if (num == 0) {
            Student student = new Student(users.size() + 20000,name,surname,group);
            users.add(student);
        }else {
            Pupil pupil = new Pupil(users.size() + 10000, name,surname,group);
        }

    }

    //this method allows to increase amount of a certain book in a library after its return from a student
    public void increaseBookQuantity(Book book, int num) {
        book.addQuantity(num);
    }

    //this method allows to decrease amount of a certain book in a library after its borrowing by a student
    public void decreaseBookQuantity(Book book, int num) {
        book.decreaseQuantity(num);
    }

    //this method allows to borrow a certain book by a certain student; as well as here we have to decrease amount of taken book
    public void addBookToStudent(Student student, Book book) {
        student.borrowBook(book);
    }

    public void addBookToUser(){
        Scanner in = new Scanner(System.in);
        Pupil pupil = new Pupil();
        for (int i = 0; i < users.size(); i ++) {
            System.out.println(i + " -->");
            users.get(i).printUsersInformation(users.get(i));
        }
        System.out.println("Write number from list");
        int num = in.nextInt();
        if (users.get(num).getId() >= 20000) {
            for (int i = 0; i < books.size(); i ++) {
                System.out.println(i + " -->");
                books.get(i).getInfo();
            }
            int  num2 = in.nextInt();
            users.get(num).borrowBook(books.get(num2));
        }else {
            for (int i = 0; i < books.size(); i ++) {
                if (books.get(i).getForwho().getClass().equals(pupil.getClass())) {
                    System.out.println(i + "--> ");
                    books.get(i).getInfo();
                }
            }
            int  num2 = in.nextInt();
            users.get(num).borrowBook(books.get(num2));
        }






    }

    //this method allows to return a certain book by a certain student; as well as here we have to increase amount of returned book
    public void returnBookFromStudent() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < users.size(); i++) {
            System.out.println(i + " -->");
            users.get(i).printUsersInformation(users.get(i));
        }
        System.out.println("Write number from list");

        int num = in.nextInt();
        if (users.get(num).getBorrowedBooks().size() != 0) {
            for (int i = 0; i < users.get(num).getBorrowedBooks().size(); i++) {
                System.out.println(i + " " + users.get(num).getBorrowedBooks().get(i).getTitle());
            }
            int num2 = in.nextInt();
            users.get(num).returnBook(users.get(num).getBorrowedBooks().get(num2));
        }else System.out.println("This student didn't borrow any book");
    }

    //this method allows to print info about all books in library, including overall their amount and so on
    public void printBooksInformation() {
        for (int i = 0; i < books.size(); i++){
            books.get(i).getInfo();
        }
     }

    //this method allows to print info about all registered students in library, including overall their amount and so on
    public void printUsersInformation() {
        for (int i = 0; i < users.size(); i++) {
            System.out.println(i + "-->");
            System.out.println("ID = " + users.get(i).getId());
            System.out.println("Name = " + users.get(i).getName() + " " + users.get(i).getSurname());
            System.out.println("Group = " + users.get(i).getGroup());

        }
    }
    //this method allows to show info about borrowed books for a certain student
    public void printStudentsBooks () {
        for (int i = 0; i < users.size(); i++) {

            System.out.println("\n"+ "ID = " + users.get(i).getId());
            System.out.print("Books : ");
            for (int k = 0; k < users.get(i).getBorrowedBooks().size(); k++) {
                System.out.print(users.get(i).getBorrowedBooks().get(k).getTitle() + ",");
            }
        }

    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<User> getStudents() {
        return users;
    }
}
