package shop;

public class ShopMain {

	public static void main(String[] args) {
		IShop shop = new MyShop2();
		// shop 이름지정
		shop.setTitle("MyShop");
		// User 이름지정
		shop.genUser();
		// Product 이름지정
		shop.genProduct();
		// shop 이름지정
		shop.start();
	}
	

}
