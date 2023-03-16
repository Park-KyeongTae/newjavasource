package ch6;

public class GoodsStockEx {

	public static void main(String[] args) {
		// 티셔츠 상품관리
		// 객체 생성 ==> 생성자가 자동 호출(무조건)
		
		// 초기화
		GoodsStock goods = new GoodsStock("p123456",150);//매개변수를 가진 생성자 호출
		
		System.out.println("현재재고수량"+ goods.Stocknum);
		
		//상품 판매
		
		goods.subtractStock();
		 
		
		
	}

}
