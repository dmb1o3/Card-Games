public class Deck {
    int numberOfCards = 52;
    private Card[] cards = new Card[numberOfCards]; // The number of complete decks in deck of cards. Complete deck is a typical 52-card deck


    public Deck(){
        makeDeck();
    }

    public void makeDeck(){
        String[] suits = {"Clubs", "Hearts", "Diamonds", "Spades"};
        int card = 0;
        for(int i = 2; i < 15; i++){
            for(int j = 0; j < 4; j++){
                cards[card] = new Card(i, suits[j]);
                card++;
            }
        }
    }

    @Override
    public String toString(){
        for(int i = 0; i < numberOfCards; i++){
            System.out.println(cards[i]);
        }
        return "";
    }
}
