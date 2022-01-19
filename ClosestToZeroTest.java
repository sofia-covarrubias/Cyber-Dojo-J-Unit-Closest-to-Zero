// A simple example to get you started
// JUnit assertion - the default Java assertion library
// https://junit.org/junit5/

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class ClosestToZeroTest {
    
    // first set

    @Test
    void posIncreaseOrder1() {
        int[] nums = {1, 2, 3};
        int expected = 1;
        int actual = ClosestToZero.answer(nums);
        assertEquals(expected, actual);
    }
    
    @Test
    void posDecreaseOrder1() {
        int[] nums = {3, 2, 1};
        int expected = 1;
        int actual = ClosestToZero.answer(nums);
        assertEquals(expected, actual);
    }
    
    @Test
    void negDecreaseOrder1() {
        int[] nums = {-1, -2, -3};
        int expected = -1;
        int actual = ClosestToZero.answer(nums);
        assertEquals(expected, actual);
    }
    
    @Test
    void negCloserThanPos1() {
        int[] nums = {-1, 2, -3};
        int expected = -1;
        int actual = ClosestToZero.answer(nums);
        assertEquals(expected, actual);
    }
    
    @Test
    void negPosSameAbsVal1() {
        int[] nums = {-1, 1, 5, 6, -8};
        int expected = 1;
        int actual = ClosestToZero.answer(nums);
        assertEquals(expected, actual);
    }
    
    // 2nd set
    
    @Test
    void posIncreaseOrder2() {
        int[] nums = {100, 200, 300};
        int expected = 100;
        int actual = ClosestToZero.answer(nums);
        assertEquals(expected, actual);
    }
    
    @Test
    void posDecreaseOrder2() {
        int[] nums = {300, 200, 100};
        int expected = 100;
        int actual = ClosestToZero.answer(nums);
        assertEquals(expected, actual);
    }
    
    @Test
    void negDecreaseOrder2() {
        int[] nums = {-100, -200, -300};
        int expected = -100;
        int actual = ClosestToZero.answer(nums);
        assertEquals(expected, actual);
    }
    
    @Test
    void negCloserThanPos2() {
        int[] nums = {-100, 200, -300};
        int expected = -100;
        int actual = ClosestToZero.answer(nums);
        assertEquals(expected, actual);
    }
    
    @Test
    void negPosSameAbsVal2() {
        int[] nums = {-100, 100, 500, 600, -800};
        int expected = 100;
        int actual = ClosestToZero.answer(nums);
        assertEquals(expected, actual);
    }
    
    // 3rd set that tests repeating numbers
    @Test 
    void repeatingBothAbsVal1() {
        int[] nums = {9384, 858, -9384, -858, -9384, -858};
        int expected = 858;
        int actual = ClosestToZero.answer(nums);
        assertEquals(expected, actual);
    }
    
    @Test 
    void repeatingPosAbsVal1() {
        int[] nums = {9384, 858, 9384, 858, 9384, 858};
        int expected = 858;
        int actual = ClosestToZero.answer(nums);
        assertEquals(expected, actual);
    }
    
    @Test 
    void repeatingNegAbsVal1() {
        int[] nums = {-9384, -858, -9384, -858, -9384, -858};
        int expected = -858;
        int actual = ClosestToZero.answer(nums);
        assertEquals(expected, actual);
    }
    
    @Test
    void includeZero1 () {
        int[] nums = {0, 0, -1, 1, 2, -2};
        int expected = 0;
        int actual = ClosestToZero.answer(nums);
        assertEquals(expected, actual);
    }
    
    @Test
    void repeatingBothAbsVal2 () {
        int[] nums = {123456, -123456, 123456};
        int expected = 123456;
        int actual = ClosestToZero.answer(nums);
        assertEquals(expected, actual);
    }
    
    // 4th set of cases
    @Test
    void twoNumsBoth () {
        int[] nums = {-1, 1};
        int expected = 1;
        int actual = ClosestToZero.answer(nums);
        assertEquals(expected, actual);
    }
    
    @Test
    void oneNegNum () {
        int[] nums = {-100};
        int expected = -100;
        int actual = ClosestToZero.answer(nums);
        assertEquals(expected, actual);
    }
    
    @Test
    void onePosNum () {
        int[] nums = {100};
        int expected = 100;
        int actual = ClosestToZero.answer(nums);
        assertEquals(expected, actual);
    }
    
    @Test 
    void noNum () {
        int[] nums = {};
        int expected = 0;
        int actual = ClosestToZero.answer(nums);
        assertEquals(expected, actual);
    }
}






