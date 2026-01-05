package LLDProblems.ATM.entities;

public class Card {
    public String cardNo;
    public String cvv;
    public Account account;

    public Card(String cardNo, String cvv){
        this.cardNo = cardNo;
        this.cvv = cvv;
    }


}
