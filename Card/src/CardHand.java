public class CardHand {

        private int handSize = 52;
	public Card[] cards = new Card[handSize];

	
        /**
         * Add comments during class to explain what this method does.
         */
        public void generateHand()
        {
                int countCards = 0;
		for(Card.Suit s: Card.Suit.values())
                {
                    for(Card.Value v: Card.Value.values())
                    {
                    	for(Card.Joker j: Card.Joker.values())
                        {
                            cards[countCards] = (new Card(s,v,j));
                            countCards++;
                        }
                    }
                }//end outter for
        }//end method

}