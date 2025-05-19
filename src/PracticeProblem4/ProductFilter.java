public class ProductFilter {

    public void filterProducts(String category) {
        System.out.println("Filtering products by category: " + category);
    }

    public void filterProducts(double minPrice, double maxPrice) {
        System.out.println("Filtering products by price range: $" + minPrice + " to $" + maxPrice);
    }

    public void filterProducts(String brand, boolean isBrand) {
        System.out.println("Filtering products by brand: " + brand);
    }

    public void filterProducts(String category, double minPrice, double maxPrice) {
        System.out.println("Filtering products by category: " + category + " and price range: $" + minPrice + " to $" + maxPrice);
    }

    public void filterProducts(String category, double minPrice, double maxPrice, String brand) {
        System.out.println("Filtering products by category: " + category + ", price range: $" + minPrice + " to $" + maxPrice + ", and brand: " + brand);
    }

    public static void main(String[] args) {
        ProductFilter pf = new ProductFilter();

        pf.filterProducts("electronics");
        pf.filterProducts(100, 500);
        pf.filterProducts("Nike", true);
        pf.filterProducts("fashion", 50, 200);
        pf.filterProducts("electronics", 100, 1000, "Apple");
    }
}
