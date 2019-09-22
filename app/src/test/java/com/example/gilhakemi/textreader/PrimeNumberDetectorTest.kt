package com.example.gilhakemi.textreader

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
    fun twoIsDetectedAsPrime() {
        assertTrue(primeNumberDetector.isPrime(2))
    }
}