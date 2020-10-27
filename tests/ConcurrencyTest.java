package tests;

import concurrency.AddNumbers;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ConcurrencyTest {
    static final int[] testArray = {10, 9, 4, 3, 9, 8, 4, 7, 10, 4};
    static final int testArraySum = 68;

    @Test
    @Order(1)
    @DisplayName("Sum of an array of integers using a single thread.")
    public void testSingleThreadSum() {
        assertEquals(testArraySum, AddNumbers.singleThreadSum(testArray, 0, 10));
    }

    @Test
    @Order(2)
    @DisplayName("Sum of an array of integers using multiple (2-20) threads.")
    public void testAllMultipleThreadsSum() throws InterruptedException {
        int maximumNumberOfThreads = 20;

        for (int i = 2; i <= maximumNumberOfThreads; i++) {
            assertEquals(testArraySum, AddNumbers.multiThreadSum(testArray, i));
        }
    }

    @Test
    @Order(3)
    @DisplayName("Sum of an array of integers using multiple (5) threads.")
    public void testFiveThreadSum() throws InterruptedException {
        assertEquals(testArraySum, AddNumbers.multiThreadSum(testArray, 5));
    }


    @Test
    @Order(4)
    @DisplayName("Sum of an array of integers using multiple (10) threads.")
    public void testTenThreadSum() throws InterruptedException {
        assertEquals(testArraySum, AddNumbers.multiThreadSum(testArray, 10));
    }

    @Test
    @Order(5)
    @DisplayName("Sum of an array of integers using multiple (15) threads.")
    public void testFifteenThreadSum() throws InterruptedException {
        assertEquals(testArraySum, AddNumbers.multiThreadSum(testArray, 15));
    }

    @Test
    @Order(6)
    @DisplayName("Sum of an array of integers using multiple (20) threads.")
    public void testTwentyThreadSum() throws InterruptedException {
        assertEquals(testArraySum, AddNumbers.multiThreadSum(testArray, 20));
    }

    @Test
    @Order(7)
    @DisplayName("Sum of an array of integers using multiple (50) threads.")
    public void testFiftyThreadSum() throws InterruptedException {
        assertEquals(testArraySum, AddNumbers.multiThreadSum(testArray, 50));
    }

    @Test
    @Order(8)
    @DisplayName("Sum of an array of integers using multiple (100) threads.")
    public void testOneHundredThreadSum() throws InterruptedException {
        assertEquals(testArraySum, AddNumbers.multiThreadSum(testArray, 100));
    }

    @Test
    @Order(9)
    @DisplayName("Sum of an array of integers using multiple (200) threads.")
    public void testTwoHundredThreadSum() throws InterruptedException {
        assertEquals(testArraySum, AddNumbers.multiThreadSum(testArray, 200));
    }
}
