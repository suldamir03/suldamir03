package Rest;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        RestaurantManagement manager = new RestaurantManagement();
        ArrayList<Client> Clients = new ArrayList<>();
        Product fish = new Product(1, "Fish", 5035);
        Product apple = new Product(2, "apple", 1000);
        Product crips = new Product(3, "crips", 1000);
        Product pizza = new Product(4, "pizza", 5000);
        Product burger = new Product(5, "burger", 5000);
        ArrayList<Product> products = new ArrayList<>();
        products.add(fish);
        products.add(apple);
        products.add(crips);
        products.add(pizza);
        products.add(burger);


        Client Ordinary = new OrdinaryClient();
        Ordinary.setName("Сергей");
        Ordinary.setSurname("Соболев");
        Ordinary.setId(1105);
        PrimeClient Prime = new PrimeClient();
        Prime.setId(1106);
        Prime.setName("Человек");
        Prime.setSurname("Прямоходящий");
        LoyalClient Loyal = new LoyalClient();
        Loyal.setId(1107);
        Loyal.setName("Черный");
        Loyal.setSurname("Африканец");
        Client admin = new OrdinaryClient();
        admin.setName("Админ");
        admin.setSurname("Админский");
        admin.setId(666);



        Clients.add(Ordinary);
        Clients.add(Prime);
        Clients.add(Loyal);
        Clients.add(admin);

        manager.setProducts(products);
        manager.setClients(Clients);
        ArrayList<Order> orders = new ArrayList<>();


        int ordNum = -1;
        while (ordNum != 0) {
            System.out.println("Вы новый клиент или уже зарегистрированный?\n1 - new\n2 - zareg\n0 - чтобы выйти");
            ordNum = in.nextInt();
            if (ordNum == 1){
                System.out.println("Введите ваше имя");
                String name = in.next();
                System.out.println("Введите вашу фамилию");
                String surname = in.next();

                Client Client = new Client();
                Client.setName(name);
                Client.setSurname(surname);
                Client.setId(1105 + Clients.size());
                Clients.add(Client);

                for (int i = 0; i < Clients.size(); i++) {
                    if (name.equals(Clients.get(i).getName())){

                        System.out.println("Приветсвуем клиент");
                        int num = -1;


                        while (num != 0) {
                            System.out.println("[ Что вы хотите сделать ] \n1 - заказать блюда\n2 - Узнать информацию о себе \n0 - выход");
                            num = in.nextInt();
                            if (num == 1) {
                                manager.makeOrder(manager.getProducts(),manager.getClients().get(i),manager.getOrders());

                            }else if (num == 2) {
                                Clients.get(i).getDescription();
                            }
                        }


                    }
                }
            }else if (ordNum == 2) {
                System.out.println("Введите ваш ID");
                int id = in.nextInt();


        /*for (int i = 0; i < Clients.size(); i++) {
            System.out.println(Clients.get(i).getName());
        }*/
                for (int i = 0; i < Clients.size(); i++) {
                    if (id == Clients.get(i).getId()){
                        if (Clients.get(i).getClass() == Prime.getClass()) {
                            System.out.println("[ Приветсвуем 'Prime client' ]");
                        }else if (Clients.get(i).getClass() == Loyal.getClass()) {
                            System.out.println("[ Приветсвуем 'Loyal client' ]");
                        } else if (Clients.get(i).getId() == 666) {
                            System.out.println("Добрейший вечерок админ");
                        } else System.out.println("Приветсвуем клиент");


                        if (Clients.get(i).getId() == 666) {
                            int num = -1;

                            while (num != 0) {
                                System.out.println("[ Что будем делать администратор? ]\n1 - Добавить блюдо\n2 - Просмотреть клиентов\n3 - Посмотреть все продукты\n4 - Посмотреть заказы\n0 - выйти");
                                num = in.nextInt();
                                if (num == 1) {
                                    System.out.println("Имя продукта");
                                    String name1 = in.next();
                                    System.out.println("Введите цену");
                                    double price = in.nextDouble();
                                    Product newProduct = new Product(products.size()+1,name1,price);
                                    products.add(newProduct);

                                }else if (num == 2) {
                                    System.out.println("Имена Клиентов и их информация");
                                    for (int k = 0; k <Clients.size(); k++ ) {
                                        Clients.get(k).getDescription();
                                    }
                                }else if (num == 3) {
                                    System.out.println("Все имеющиеся у нас блюда");
                                    for ( int j = 0; j < products.size(); j++) {
                                        products.get(j).getDescription();
                                    }
                                } else if (num == 4) {
                                    System.out.println("Все заказы");
                                    manager.getOrderInfo();
                                }
                            }
                        }else {
                            int num = -1;
                            while (num != 0) {
                                System.out.println("Что вы хотите сделать\n1 - заказать блюда\n2 - Узнать информацию о себе\n0 - выход");
                                num = in.nextInt();
                                if (num == 1) {
                                    manager.makeOrder(manager.getProducts(),manager.getClients().get(i),manager.getOrders());

                                }else if (num == 2) {
                                    Clients.get(i).getDescription();
                                }
                            }

                        }




                    }
                }
            }
        }





    }
}
