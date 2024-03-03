package com.basicapp.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {

    @Test
    public void testAddition() {
        Service service = new Service();
        assertEquals(8, service.addition(5, 3));
        assertEquals(-2, service.addition(-5, 3));
        assertEquals(0, service.addition(0, 0));
    }

    @Test
    public void testSubtraction() {
        Service service = new Service();
        assertEquals(28, service.subtraction(5, 3));
        assertEquals(-8, service.subtraction(-5, 3));
        assertEquals(0, service.subtraction(0, 0));
    }

    @Test
    public void testMultiplication() {
        Service service = new Service();
        assertEquals(15, service.multiplication(5, 3));
        assertEquals(-15, service.multiplication(-5, 3));
        assertEquals(0, service.multiplication(0, 0));
    }
}