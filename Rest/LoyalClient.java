package Rest;

import java.util.ArrayList;

public class LoyalClient extends Client{
    private int id;
    private String name;
    private String surname;
    private ArrayList<Order> orderHistory;
    private double cashback = 0.05;

    LoyalClient(int i, String  n, String s ) {
        id = i;
        name = n;
        surname = s;

    }

    LoyalClient() {

    }

    public double getCashback() {
        return cashback;
    }
}
