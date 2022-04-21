package Rest;

import java.util.ArrayList;

public class Order {
    private int clientid;
    private ArrayList<Product> productids = new ArrayList<>();
    private double totalprice;


    Order(int c, ArrayList<Product> p, double t) {
        clientid = c;
        productids = p;
        totalprice = t;
    }
    Order() {

    }
    public void setClientid(int clientid) {
        this.clientid = clientid;
    }

    public void setProductids(ArrayList<Product> productids) {
        this.productids = productids;
    }

    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }

    public ArrayList<Product> getProductids() {
        return productids;
    }

    public double getTotalprice() {
        return totalprice;
    }

    public int getClientid() {
        return clientid;
    }

    public void getProducts6() {
        for (int i = 0; i < productids.size(); i++) {
            System.out.println(productids.get(i).getName());
        }

    }

    public void getDescription () {
        System.out.println("Client ID = " + clientid + "\nTotal price = " + getTotalprice());
    }
}
