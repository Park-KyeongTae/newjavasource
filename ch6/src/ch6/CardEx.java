package ch6;

public class CardEx {

	public static void main(String[] args) {
		//공통 속성 지정
		Card.width=50;
		Card.height=70;
		System.out.println("Card.width = "+Card.width);
		System.out.println("Card.height = "+Card.height);
		System.out.println();
		
		Card card = new Card();
		card.kind = "Heart";
		card.number = 7;
		
		
		Card card2 = new Card();
		card2.kind = "Spade";
		card2.number = 4;
		
		Card card3 = new Card();
		card3.kind = "Diamond";
		card3.number = 10;
		
		System.out.printf("card3 %s, number3 %d 크기는 (%d,%d)\n",card3.kind,card3.number,card3.width,card3.height);
		System.out.printf("card2 %s, number2 %d 크기는 (%d,%d)\n",card2.kind,card2.number,card2.width,card2.height);
		System.out.printf("card1 %s, number1 %d 크기는 (%d,%d)\n",card.kind,card.number,card.width,card.height);
	}

}
