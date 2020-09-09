import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedParenthesisTest {
    @Test
    public void test_simple_pair() {
        assertTrue(BalancedParenthesis.isBalanced("()"));
        assertTrue(BalancedParenthesis.isBalanced("()()"));
        assertFalse(BalancedParenthesis.isBalanced(")("));
    }

    @Test
    public void test_nested_pair() {
        assertTrue(BalancedParenthesis.isBalanced("(())"));
        assertTrue(BalancedParenthesis.isBalanced("({})"));
        assertTrue(BalancedParenthesis.isBalanced("[({})]"));
        assertFalse(BalancedParenthesis.isBalanced("(()("));
    }

}