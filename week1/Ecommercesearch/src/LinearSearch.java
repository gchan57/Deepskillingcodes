public class LinearSearch
{
    public static Product search(Product[] products,int find){
        for(Product product:products){
            if(product.productId==find){
                return product;
            }
        }
        return null;

    }
}
