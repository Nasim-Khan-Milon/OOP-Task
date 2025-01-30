public class Product_Filter {
    
    public void filterProducts(String category){
        System.out.println("Filtering products in category : "+category);
    }

    public void filterProducts(int minPrice, int maxPrice){
        System.out.println("Filtering products with price range : $"+minPrice+" to $"+maxPrice);
    }

    public void filterProductsByBrand(String brand) {
        System.out.println("Filtering products of brand: " + brand);
    }

    public void filterProducts(String category, int minPrice, int maxPrice) {
        System.out.println("Filtering products in category : " + category + " with price range: $" + minPrice + " to $" + maxPrice);
    }

    public void filterProducts(String category, int minPrice, int maxPrice, String brand) {
        System.out.println("Filtering products in category: " + category + ", with price range: $" + minPrice + " to $" + maxPrice + ", and brand: " + brand);
    }




    public static void main(String[] args) {
        Product_Filter filter = new Product_Filter();

        filter.filterProducts("Electronics");
        filter.filterProducts(100, 500);
        filter.filterProductsByBrand("Nike");
        filter.filterProducts("Fashion", 50, 200);
        filter.filterProducts("Electronics", 200, 1000, "Apple");
    }
}
