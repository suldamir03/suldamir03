package lab6Umarov;

public class Book {
	//fill this class with all necessary fields
	//as well as do not forget to add constructor, which will allow to create an instance of that class later on
    private String title;
    private String author;
    private String isbn;
    private int year;
    private int quantity;
    private User user; // true - Student, false - pupil
    Book(String title, String author, String isbn, int year, int quantity,User user){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
        this.quantity = quantity;
        this.user = user;
    }
    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public User getForwho() {
        return user;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int num) {
         this.quantity = quantity + num;
    }
    public void decreaseQuantity(int num) {
        if (num < this.quantity) {
            this.quantity = quantity - num;
        }else System.out.println("Вы ввели слишком большое число");

    }
    public void changeQuanity(int num) {
        this.quantity = num;
    }

    public int getYear() {
        return year;
    }

    public void getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Title name = ");
        sb.append(getTitle());
        sb.append("\n");
        sb.append("Author = ");
        sb.append(getAuthor());
        sb.append("\n");
        sb.append("Allowed to read to ");
        sb.append(getForwho().getClass().getSimpleName());
        sb.append("\n");
        sb.append("ISBN = ");
        sb.append(getIsbn());
        sb.append("\n");
        sb.append("Year = ");
        sb.append(getYear());
        sb.append("\n");
        sb.append("Quantity= ");
        sb.append(getQuantity());
        sb.append("\n");


        System.out.println(sb);
    }
}
