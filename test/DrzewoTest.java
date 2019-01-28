import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrzewoTest {
    Drzewo tree;
    @BeforeEach
    void setUp(){
        tree = new Drzewo(true,4,"twarda");
    }
    @Test
    void getWysokosc(){
        assertEquals(4,tree.getWysokosc());
    }
    @Test
    void getPrzekrojDrzewa(){
        assertEquals("twarda",tree.getPrzekrojDrzewa());
    }

    @Test
    void isWiecznieZielone(){
        boolean test = tree.isWiecznieZielone();
        assertTrue(test);
    }
}