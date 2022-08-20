public class CardAPI {


    public int getDiscount (Card card){

        if(card.getBank().equals("Star Bank")){

            return 20;
        }

        return 0;

    }

}
