package hk.edu20240716.day13;
import java.util.*;
public class CardMain {

	public static void main(String[] args) {
		Card card=new Card();
		System.out.println(card.toString());
		
		Cardcase cardCase=new Cardcase();
		cardCase.shuffle();
		List<Card> cards=cardCase.getCards();//
		
		for(int i=0;i<cards.size();i++) {
			System.out.println(
					cards.get(i)+"\t");
			
			
			//10장씩 줄바꿔서 출력해보자
			if(i+1%10==0) {
				System.out.println();
			}
			
		}
	}

	
}

