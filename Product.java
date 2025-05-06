public class Product
{
	public static String category = "Electronics";
	String productName;

	public static void main(String args[])
	{
		System.out.println("Category:"+Product.category);
		Product product=new Product();
		product.productName="Laptop";
		System.out.println("Product 1:"+product.productName);
		Product product1=new Product();
		product1.productName="Smartphone";
		System.out.println("Product 2:"+product1.productName);
	}
}
		