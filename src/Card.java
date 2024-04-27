public class Card {
    private final int rank; //
    private final String suit;
    /**
     * Class representing a single card
     * @param rank The rank of a card. Ex: ..., 10 = 10, Jacks = 11, Queens = 12, Kings = 13, Ace = 14
     * @param suit The suit of a card. Ex: "Clubs", "Hearts", "Spades", "Diamonds"
     */
    public Card(int rank, String suit){
            this.rank = rank;
            this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    @Override
    public String toString(){
        // If rank is numeric
        if(rank < 11) {
            return "Rank: " + rank + " Suit: " + suit;
        }
        // If not numeric convert to what rank should be
        String[] rankTofAce = {"Jack", "Queen", "King", "Ace"}; // Array to convert from rank to name of face or ace
        return "Rank: " + rankTofAce[rank - 11] + " Suit: " + suit;
    }
}
