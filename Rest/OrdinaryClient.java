package Rest;

import java.util.ArrayList;

public class OrdinaryClient extends Client {

    private int id;
    private String name;
    private String surname;
    private ArrayList<Order> orderHistory;
    OrdinaryClient(int i, String  n, String s ) {
        id = i;
        this.name = n;
        this.surname = s;

    }
    OrdinaryClient() {

    }
}
