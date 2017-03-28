package animal.real;

import animal.Animal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Diki Ardian W (13515092) on 3/28/17.
 */

/**@class LobsterTest
 * @brief Kelas untuk mengetes kelas Lobster
 */
class LobsterTest {
    @Test
    void getLocX() {
        System.out.println("Test X Position..");
        Animal H = new Lobster(5,4);
        assertTrue(H.GetLocX()==5);
    }

    @Test
    void getLocY() {
        System.out.println("Test Y Position..");
        Animal H = new Lobster(5,4);
        assertTrue(H.GetLocY()==4);
    }

    @Test
    void getFodder() {
        System.out.println("Test Fodder..");
        Animal H = new Lobster(5,4);
        assertTrue(H.GetFodder()==0.025*H.GetWeight());
    }

    @Test
    void getContent() {
        System.out.println("Test Content..");
        Animal H = new Lobster(5,4);
        assertTrue(H.GetContent()=='P');
    }

    @Test
    void getWeight() {
        System.out.println("Test Weight..");
        Animal H = new Lobster(5,4);
        assertTrue(H.GetWeight()==0.5);
    }

    @Test
    void isTamed() {
        System.out.println("Test Weight..");
        Animal H = new Lobster(5,4);
        assertTrue(H.IsTamed());
    }

    @Test
    void getLegs() {
        System.out.println("Test Legs..");
        Animal H = new Lobster(5,4);
        assertTrue(H.GetLegs()==10);
    }

    @Test
    void interact() {
        System.out.println("Test Interact..");
        Animal H = new Lobster(5,4);
        assertTrue(H.Interact().equals("Crek crek crek"));
    }
}