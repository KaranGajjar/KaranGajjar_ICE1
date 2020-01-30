public class Card {
    
        public enum Suit {HEARTS, CLUBS,SPADES,DIAMONDS};
        public enum Value{ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};
        public enum Joker{JOKER1, JOKER2, JOKER3}
        private final Suit suit;
        private final Value value;
        private final Joker joker;
        
        public Card(Suit s, Value gVal, Joker j)
        {
           suit =s;
           value= gVal;
           joker = j;
        }
	public Value getValue() {
		return this.value;
	}

	
	public Suit getSuit() {
		return this.suit;
        }
	
	public Joker getJoker() {
		return this.joker;
	}
}