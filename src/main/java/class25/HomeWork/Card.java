package class25.HomeWork;

import java.util.Iterator;
import java.util.LinkedList;

public class Card {
  //  Create a Card class that will have interest rate field and card type
    //        and a constructor that will initialize the fields.
   // Create 3 objects of different card and store them into LinkedList.
      //      Using for loop/advanced for loop/ iterator access all methods of the class.

    String cardType;
    double rateField;
    public Card(String cardType, double rateField){
        this.cardType=cardType;
        this.rateField=rateField;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardType='" + cardType + '\'' +
                ", rateField=" + rateField +
                '}';
    }

    public static void main(String[] args) {
        Card card1=new Card("Visa", 3.5);
        Card card2=new Card("Europe", 5.0);
        Card card3=new Card("Premium", 7.9);

        LinkedList<Card> cards=new LinkedList<>();
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);

        for(Card c:cards){
            System.out.println(c.toString());
        }

        for (int i = 0; i < cards.size(); i++) {
            System.out.println(cards.get(i).toString());

        }

        Iterator<Card> car=cards.iterator();
        while (car.hasNext()){
            Card c= car.next();
            System.out.println(c.toString());
        }



    }

}


