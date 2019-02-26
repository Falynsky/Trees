import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {
    Tree tree;
    @BeforeEach
    void setUp(){
        tree = new Tree(true,4,"twarda");
    }
    @Test
    void getWysokosc(){
        assertEquals(4,tree.getHeight());
    }
    @Test
    void getPrzekrojDrzewa(){
        assertEquals("twarda",tree.getSectionOfATree());
    }

    @Test
    void isWiecznieZielone(){
        boolean test = tree.isEvergreen();
        assertTrue(test);
    }
}