import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person p1, p2;

    @BeforeEach
    public void init(){

        p1 = new Person("Juan","Smith","jusmith@mail.com", new Birthday(22,1998,7));
        p2 = new Person("Maria","Lobatto","marilob@mail.com", new Birthday(1,2018,6));

    }

    @Test
    public void verifyName(){

        assertEquals("Smith,Juan", p1.showFullName());
        assertEquals("Lobatto,Maria",p2.showFullName());

    }

    @Test
    public void verifyAge(){

        assertTrue(p1.haveMore18years());
        assertFalse(p2.haveMore18years());

    }

}