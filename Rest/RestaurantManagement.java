package Rest;

import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantManagement {
    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Client> clients = new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void getOrderInfo() {
        for(int i = 0; i< orders.size(); i++) {
            orders.get(i).getDescription();
            orders.get(i).getProducts6();
        }
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void makeOrder(ArrayList<Product> products,Client Clients,ArrayList<Order> orders) {
        double total = 0;
        Scanner in = new Scanner(System.in);
        PrimeClient exprime = new PrimeClient();
        LoyalClient exloyal = new LoyalClient();
        ArrayList<Integer> productid = new ArrayList<>();
        ArrayList<Product> productid1 = new ArrayList<>();

        for (int i = 0; i < products.size(); i++) {
            System.out.println(i + " - " + products.get(i).getName() + " " + products.get(i).getPrice());
        }
        System.out.println("Сколко блюд вы хотите заказать ");
        int cum = in.nextInt();
        System.out.println("Какие блюда вы возьмете");
        for ( int i = 0; i < cum; i++) {
            int orderNum = in.nextInt();
            productid1.add(products.get(orderNum));


        }


        for (Product product : productid1) {
            total = total + product.getPrice();
        }
        Order order = new Order();

        order.setClientid(Clients.getId());
        order.setProductids(productid1);
        order.setTotalprice(total);
        System.out.println("Итоговый заказ");
        System.out.print("Еда которыую вы зказали = ");
        for(int i = 0; i <order.getProductids().size(); i++) {
            System.out.print(order.getProductids().get(i).getName() + ",");
        }
        System.out.println();
        if (Clients.getClass() == exloyal.getClass()) {
            System.out.println("К оплате = " + order.getTotalprice());
            System.out.println("Ваш кэшбек = " + exloyal.getCashback()*order.getTotalprice());
        }else if (Clients.getClass() == exprime.getClass()) {
            System.out.println("К оплате = " + order.getTotalprice()*exprime.getDiscount());
        }else System.out.println("К оплате = " + order.getTotalprice());


        orders.add(order);
        Clients.setOrderHistory(orders);

    }
}
