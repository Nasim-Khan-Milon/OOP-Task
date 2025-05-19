class Restaurant {
    protected String name;

    public Restaurant(String name) {
        this.name = name;
    }

    public double calculateTotalBill(double foodPrice) {
        double tax = foodPrice * 0.10;
        return foodPrice + tax;
    }

    public int estimateDeliveryTime() {
        return 40;
    }

    public void printDetails(double foodPrice) {
        System.out.println("Restaurant: " + name);
        System.out.println("Delivery Time: " + estimateDeliveryTime() + " mins");
        System.out.printf("Total Bill: $%.2f%n", calculateTotalBill(foodPrice));
        System.out.println("----------------------------------");
    }
}

class FastFoodRestaurant extends Restaurant {

    public FastFoodRestaurant(String name) {
        super(name);
    }

    @Override
    public double calculateTotalBill(double foodPrice) {
        double tax = foodPrice * 0.15;
        return foodPrice + tax;
    }

    @Override
    public int estimateDeliveryTime() {
        return 20;
    }
}

class FineDiningRestaurant extends Restaurant {

    public FineDiningRestaurant(String name) {
        super(name);
    }

    @Override
    public int estimateDeliveryTime() {
        return 60;
    }
}

public class OnlineFoodOrdering {
    public static void main(String[] args) {
        Restaurant regular = new Restaurant("Generic Restaurant");
        Restaurant fastFood = new FastFoodRestaurant("Burger Express");
        Restaurant fineDining = new FineDiningRestaurant("Le Gourmet");

        double foodPrice = 100.00;

        regular.printDetails(foodPrice);
        fastFood.printDetails(foodPrice);
        fineDining.printDetails(foodPrice);
    }
}
