public class Main {
    public static void main(String[] args){
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Electronics"),
                new Product(103, "Keyboard", "Electronics"),
                new Product(104, "Shoes", "Fashion"),
                new Product(105, "Watch", "Accessories")
        };

        long linearStart = System.nanoTime();
        Product linearResult = LinearSearch.search(products, 104);
        long linearEnd = System.nanoTime();

        System.out.println("Linear " + linearResult.productName);
        System.out.println("LinearTime" +
                (linearEnd - linearStart));

// Binary Search
        long binaryStart = System.nanoTime();
        Product binaryResult = BinarySearch.search(products, 104);
        long binaryEnd = System.nanoTime();

        System.out.println("Binary " + binaryResult.productName);
        System.out.println("Binary Time" +
                (binaryEnd - binaryStart) );
    }
}
