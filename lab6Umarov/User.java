package lab6Umarov;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class User {
    private int id;
    private String name;
    private String surname;
    private String group;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();
    //this the method which allows to count book quantity and to add books into an arraylist

    User(int id, String name, String surname, String group) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.group = group;
    }
    User() {

    }
    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public String getGroup() {
        return group;
    }
    public void printUsersInformation(User user) {

        System.out.println("ID = " + getId());
        System.out.println("Name = " + getName() + " " + getSurname());
        System.out.println("Group = " + getGroup());
        System.out.println("It is = " + checkUser(user).getClass().getSimpleName());

    }

    public void borrowBook(Book book) {
        this.borrowedBooks.add(book);
    }
    //this method allows to return CERTAIN book from student to library by removing selected book from arraylist
    public void returnBook(Book book) {
        this.borrowedBooks.remove(book);
    }

    //this method allows to print borrowed books for a certain student
    public void printBooks() {
        for (int i = 0; i < this.borrowedBooks.size(); i++) {
            //borrowedBooks.get(i).
        }
    }

    public User checkUser(User user) {
        if (user.getId() >= 20000){
            Student student = new Student();
            return student;

        }else {
            Pupil pupil = new Pupil();
            return pupil;
        }
    }
}
