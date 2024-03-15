package test;

import org.junit.Test;
import static org.junit.Assert.*;
import main.BalancedBrackets;

public class BalancedBracketsTest {
    // Test cases
    @Test
    public void test1() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("")); // esperat: true
    }

    @Test
    public void test2() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[test]")); // esperat: true
    }

    @Test
    public void test3() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]")); // esperat: true
    }

    @Test
    public void test4() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[test]]")); // esperat: true
    }

    @Test
    public void test5() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[test[")); // esperat: false
    }

    @Test
    public void test6() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[test")); // esperat: false
    }

    @Test
    public void test7() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("test]")); // esperat: false
    }

    @Test
    public void test8() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("a[test]b")); // esperat: true
    }

    @Test
    public void test9() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[a[b]c]d")); // esperat: true
    }

    @Test
    public void test10() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[a[b]c[d]")); // esperat: false
    }

    @Test
    public void test11() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("a[b]c[d]e")); // esperat: true
    }

    @Test
    public void test12() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[test]]]")); // esperat: true
    }
}
