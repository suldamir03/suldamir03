package Rest;

import java.util.ArrayList;

public class Client {
    private int id;
    private String name;
    private String surname;
    private ArrayList<Order> orderHistory;



    public String getSurname() {
        return surname;
    }

    public ArrayList<Order> getOrderHistory() {
        return orderHistory;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOrderHistory(ArrayList<Order> orderHistory) {
        this.orderHistory = orderHistory;
    }
    public void getDescription(){
        StringBuilder sb = new StringBuilder();
        sb.append("name = " + this.name);
        sb.append("\nsurname = " + this.surname);
        sb.append("\nID = " + this.id + "\n");
        System.out.println(sb);

    }

}
