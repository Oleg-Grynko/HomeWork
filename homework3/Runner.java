package homework3;

public class Runner {
    public static void main(String[] args) {

        Shop shop = new Shop(false, false, 3);
        Customer customer = new Customer("Ivan");
        customer.name = "Ivan";
        customer.checkShop(shop);
        customer.getName();


    }
}

