import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JUnit5Examples {

    @BeforeAll
    static void beforeAAll(){
        System.out.println("### @BeforeAll  !");
    }

    @AfterAll
    static void afterAAll(){
        System.out.println("### @AfterAll  !");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("### @BeforeEach  !");
    }

    @AfterEach
    void afterEach(){
        System.out.println("### @AfterEach  !");
    }


    @Test
    void firstTest(){
        System.out.println("###     firstTest() !");
        assertTrue (3 > 2);
    }

    @Test
    void secondTest(){
        System.out.println("###     secondTest() !");
        assertFalse (3 < 2);
    }
}
