public class DeckManager {
    private int numberOfDecks; // The number of complete decks in deck of cards. Complete deck is a typical 52-card deck

    public DeckManager(int numberOfDecks){
            this.numberOfDecks = numberOfDecks;
    }

    public void setNumberOfDecks(int numberOfDecks){
        this.numberOfDecks = numberOfDecks;
    }

    public int getNumberOfDecks() {
        return numberOfDecks;
    }


}
