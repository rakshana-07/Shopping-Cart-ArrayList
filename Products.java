package day5;


    import java.util.ArrayList;
	import java.util.Collections;
	

	class Products {
	    private ArrayList<String> productList;

	    public Products() {
	        productList = new ArrayList<>();
	    }

	    public void addProductToList(String product) {
	        productList.add(product);
	    }

	    public void sortProductList() {
	        Collections.sort(productList);
	    }

	    public ArrayList<String> getProductList() {
	        return productList;
	    }
	}


