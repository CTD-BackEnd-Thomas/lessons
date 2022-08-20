import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountFacadeTest {

    Card card1, card2;
    Product product,product2;

    DiscountFacade facade;

    @BeforeEach
    public void init(){

        card1 = new Card("4464664464646","Star Bank");
        card2 = new Card("4464664464646","Moon Bank");
        product = new Product("Vegetables","Can");
        product2 = new Product("Fruits","Fresh");

        facade = new DiscountFacade();

    }

    @Test
    @DisplayName("Maximum discount - all right")
    public void test(){

        assertEquals("Total discount was: 45",facade.calculateDiscount(card1,product,15));

    }

    @Test
    @DisplayName("Wrong card, right product, right quantity")
    void test2 ( ){

        assertEquals("Total discount was: 25",facade.calculateDiscount(card2,product,15));

    }

    @Test
    @DisplayName("Wrong card, right product, wrong quantity")
    void test3 (){

        assertEquals("Total discount was: 10",facade.calculateDiscount(card2,product,2));

    }

    @Test
    @DisplayName("Right card, wrong product, right quantity")
    void test4(){

        assertEquals("Total discount was: 35",facade.calculateDiscount(card1,product2,15));

    }


    @Test
    @DisplayName("Right card, right product, wrong quantity")
    void test5(){

        assertEquals("Total discount was: 30",facade.calculateDiscount(card1,product,8));

    }

    @Test
    @DisplayName("Everything wrong")
    void test6(){

        assertEquals("Total discount was: 0",facade.calculateDiscount(card2,product2,11));

    }


}