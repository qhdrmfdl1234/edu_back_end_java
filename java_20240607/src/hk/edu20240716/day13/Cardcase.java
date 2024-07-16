package hk.edu20240716.day13;
import java.util.*;
public class Cardcase {
	
	private List<Card> cards;
	
	//카드의 총 장수를 구하자 
	private static final int NUMOFCARDS= Card.DECK.length*Card.STECK.length;//static으로 만들어서 클래스명.하고 물러오면 됌  인스턴스만 new 만들어서 
	
	public Cardcase() {
		cards=new ArrayList<Card>();
		
	}
	//카드 객체를 생성해서 cards에 담아줄 메서드
	
	public void shuffle() {
		int i=0;
		while(true) {
			Card cc=new Card();//카드한장 만들어짐
			if(!cards.equals(cc)) {
				cards.add(cc);//카드 한장 넣기
				i++;	
			}
			
			
			if(i==NUMOFCARDS) {
				break;
				
			}
		}
		
		}
	public List<Card> getCards(){
		return cards;
	}
}
