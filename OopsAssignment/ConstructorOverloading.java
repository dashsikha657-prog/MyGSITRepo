//Constructor Overloading
//
//Create a class Product having instance variables productId, productName, and price.
//Implement:
//
//A default constructor that prints "Product Created".
//
//A parameterized constructor that initializes the product details.
//Write a method displayProduct() to print product details.
//Create both types of objects in the main method.

package OopsAssignment;

class Product
{
	int productId;
	String productName;
	int productPrice;
	
	Product()
	{
		System.out.println("Product Created");
	}
	
	Product(int i, String n, int p)
	{
		productId=i;
		productName=n;
		productPrice=p;
		
    }
	
	public void displayProduct()
	{
		System.out.println(productId+"  "+productName+"  "+productPrice);
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
	
		Product pd = new Product(112,"Laptop",77000);
		pd.displayProduct();

	}

}
