package Rest;

import java.util.ArrayList;

public class PrimeClient extends Client{
    private double discount = 0.95;
    private int id;
    private String name;
    private String surname;
    private ArrayList<Order> orderHistory;

    PrimeClient(int i, String  n, String s ) {
        id = i;
        name = n;
        surname = s;

    }
    PrimeClient(){

    }

    public double getDiscount() {
        return discount;
    }
}
