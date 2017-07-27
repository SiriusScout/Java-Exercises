package exercise.cards;

//This class represents an instance of a card
public class Card implements Cards{
	private Rank rank;
	private Suit suit;
	
	Card(){
		rank = Rank.JOKER;
		suit = Suit.JOKER;
	}
	
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	
	public void setRank(Rank rank) {
		this.rank = rank;
	}
	
	public Suit getSuit() {
		return suit;
	}
	
	public Rank getRank() {
		return rank;
	}

}
