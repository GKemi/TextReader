package com.example.gilhakemi.textreader.core

/**
 * Created by work on 22/09/2019.
 */
class PrimeNumberDetector {

    fun isPrime(number: Int): Boolean {
        if (number < 2) return false
        var counter = 2
        while (counter*counter <= number) {
            if (number % counter == 0) return false
            counter++
        }
        return true
    }
}