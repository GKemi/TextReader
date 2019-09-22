package com.example.gilhakemi.textreader

import com.example.gilhakemi.textreader.core.PrimeNumberDetector
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

/**
 * Created by work on 22/09/2019.
 */
class PrimeNumberDetectorTest {
    lateinit var primeNumberDetector: PrimeNumberDetector

    @Before
    fun setup() {
        primeNumberDetector = PrimeNumberDetector()
    }

    @Test
    fun zeroOrOneAreNotPrimes() {
        assertFalse(primeNumberDetector.isPrime(0))
        assertFalse(primeNumberDetector.isPrime(1))
    }

    @Test
    fun twoIsDetectedAsPrime() {
        assertTrue(primeNumberDetector.isPrime(2))
    }

    @Test
    fun threeIsDetectedAsPrime() {
        assertTrue(primeNumberDetector.isPrime(3))
    }

    @Test
    fun fourIsNotDetectedAsPrime() {
        assertFalse(primeNumberDetector.isPrime(4))
    }

    @Test
    fun fiveIsDetectedAsPrime() {
        assertTrue(primeNumberDetector.isPrime(5))
    }

    @Test
    fun eightIsNotDetectedAsPrime() {
        assertFalse(primeNumberDetector.isPrime(8))
    }

    @Test
    fun twentyThreeIsDetectedAsPrime() {
        assertTrue(primeNumberDetector.isPrime(23))
    }

    @Test
    fun sevenThousandAndOneIsDetectedAsPrime() {
        assertTrue(primeNumberDetector.isPrime(7001))
    }
}