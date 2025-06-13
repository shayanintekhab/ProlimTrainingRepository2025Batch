package comparatorexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.bean.Product;
import com.sort.ProductSortByIdAsc;
import com.sort.ProductSortByIdDesc;

public class ProductSortMainClass {

	public static void main(String[] args) {
	List<Product> listOfProduct = new ArrayList<Product>();
	listOfProduct.add(new Product(101, "TV", 45000));
	listOfProduct.add(new Product(100, "Computer", 35000));
	listOfProduct.add(new Product(102, "Pen Drive", 2000));
	System.out.println("Before sort");
	for(Product p : listOfProduct) {
		System.out.println(p);
	}
	int choice = 2;
	if(choice==1) {
		Collections.sort(listOfProduct, new ProductSortByIdAsc());
	}
	if(choice==2) {
		Collections.sort(listOfProduct, new ProductSortByIdDesc());
	}
	System.out.println("After sort");
	for(Product p : listOfProduct) {
		System.out.println(p);
	}
	}

}
