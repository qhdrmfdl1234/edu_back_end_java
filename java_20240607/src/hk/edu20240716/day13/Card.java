package hk.edu20240716.day13;

public class Card {
	
	//카드를 만들기 위한 필드를 선언하자
	public static final String[] DECK={"♥","♣","♠","◈"};
	public static final String[] STECK = {"A","2","3","4","5","6","7","8","9","T","J","Q","k"};
	
	//카드 한장의 대한 정보[그림+숫자]
	private String Card; //◈9 이런 형식으로 값이 저장될 것임
	
	
	public Card() {
		init();//Card 객체가 생성되면 init()메서드 실행
		
	}
	
	
	
	//은닉화 : 메서드를 통해 접근 
	public String getCard() {
		return this.Card;
	}
	
	//카드 한장 만드는 기능
	public  void init() {
		int a=0; //0~3까지의 숫자를 랜덤하게 생성 저장 :DECK의 인덱스
		int b=0;//0~12까지의 숫자를 랜덤하게 생성 저장 : STECK의 인덱스
		
		a=(int)(Math.random()*DECK.length);
		b=(int)(Math.random()*STECK.length);
		
		Card =DECK[a]+" "+STECK[b];
		
	}

	
	//Object클래스의 메서드를 오버라이딩함
	//Card객체를 출력하면 아래 메서드가 실행
	@Override
	public String toString() {
		return "["+Card+"]";
	}
	
	}
	


