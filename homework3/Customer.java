package homework3;

public class Customer {
    String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void customer(String name) {
        System.out.println("Имя: " + this.getName());
    }



    public void checkShop(Shop shop) {

        if ((shop.isClearFloor() == true && shop.isWorkersHasBadge() == true) || (shop.getCountWorkers()
        >= 2 && shop.isClearFloor() == true) || (shop.getCountWorkers() >= 2 && shop.isWorkersHasBadge() == true)) {
            System.out.println(name + ": Магазин прошел проверку");
        } else {
            System.out.println(name + ": Магазин не прошел проверку!");
        }
    }

}