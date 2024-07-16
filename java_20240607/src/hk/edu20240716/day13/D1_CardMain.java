package hk.edu20240716.day13;
import java.util.*;
public class D1_CardMain {

	public static void main(String[] args) {
		D1_Card card=new D1_Card();
		System.out.println(card.toString());
		
		D1_Cardcase cardCase=new D1_Cardcase();
		cardCase.shuffle();
		List<D1_Card> cards=cardCase.getCards();//
		
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

