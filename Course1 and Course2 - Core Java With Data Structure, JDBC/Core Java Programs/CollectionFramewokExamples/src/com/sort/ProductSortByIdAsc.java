package com.sort;

import java.util.Comparator;

import com.bean.Product;

public class ProductSortByIdAsc implements Comparator<Product>{
	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.getPid()-o2.getPid();
	}
}
