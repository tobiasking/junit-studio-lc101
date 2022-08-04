package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    BalancedBrackets bracket_ex = new BalancedBrackets();
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(bracket_ex.hasBalancedBrackets("[]"));
    }

    @Test
    public void leftBracketFalse() {
        assertFalse(bracket_ex.hasBalancedBrackets("["));
    }
    @Test
    public void rightBracketFalse() {
        assertFalse(bracket_ex.hasBalancedBrackets("]"));
    }

    @Test
    public void endofStringBrackets() {
        assertTrue(bracket_ex.hasBalancedBrackets("Needs more Lechonk.[]"));
    }
    @Test
    public void startofStringBrackets() {
        assertTrue(bracket_ex.hasBalancedBrackets("[]Needs more Lechonk."));
    }
    @Test
    public void nestedBrackets() {
        assertTrue(bracket_ex.hasBalancedBrackets("Needs more [Lechonk]."));
    }
    @Test
    public void multipleNestedBrackets() {
        assertTrue(bracket_ex.hasBalancedBrackets("[Needs] more [Lechonk]."));
    }
    @Test
    public void backwardsBrackets() {
        assertFalse(bracket_ex.hasBalancedBrackets("]Needs[ more Lechonk."));
    }
    @Test
    public void multipleBackwardsBrackets() {
        assertFalse(bracket_ex.hasBalancedBrackets("]Needs[ more ]Lechonk[."));
    }
    @Test
    public void backToBackBrackets() {
        assertFalse(bracket_ex.hasBalancedBrackets("Needs][][ more Lechonk."));
    }
    @Test
    public void bothBrackets(){
        assertFalse(bracket_ex.hasBalancedBrackets("[Needs] more ][ Lechonk"));
    }
}
