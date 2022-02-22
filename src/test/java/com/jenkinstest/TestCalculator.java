package com.jenkinstest;

import com.jenkinstest.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
public class TestCalculator {
    @Test
    public void GivenTwoIntegersAddReturnsAddition() {
        System.out.println("TEST CLASS");
        assertEquals(5, Calculator.add(2,2));
    }
}
