package lab6Umarov;


import java.util.ArrayList;


public class Student extends User{
	//fill this class with all necessary fields
	//as well as do not forget to add constructor, which will allow to create an instance of that class later on
	//note: create an arraylist of borrowed books within the constructor (why?).

	private int id;// Student ID > 20000
	private String name;
	private String surname;
	private String group;
	private ArrayList<Book> borrowedBooks = new ArrayList<>();

	Student(int id, String name, String surname, String group) {
		super(id, name, surname, group);
	}

	Student() {


	}








}
