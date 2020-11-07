package TenPointThree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyIntegerTest {

    @Test
    public void testValueField() {
        MyInteger integer = new MyInteger(5);
        Assertions.assertEquals(5, integer.getValue());
    }

    @Test
    public void testIsEven() {
        MyInteger oddInteger = new MyInteger(5);
        Assertions.assertFalse(oddInteger.isEven());
        MyInteger evenInteger = new MyInteger(100);
        Assertions.assertTrue(evenInteger.isEven());
    }

    @Test
    public void testIsOdd() {
        MyInteger oddInteger = new MyInteger(5);
        Assertions.assertTrue(oddInteger.isOdd());
        MyInteger evenInteger = new MyInteger(100);
        Assertions.assertFalse(evenInteger.isOdd());
    }

    @Test
    public void testIsPrime(){
        MyInteger primeInteger = new MyInteger(3);
        Assertions.assertTrue(primeInteger.isPrime());
        MyInteger notPrimeInteger = new MyInteger(4);
        Assertions.assertFalse(notPrimeInteger.isPrime());
    }

    @Test
    public void testIEvenStatic() {
        Assertions.assertTrue(MyInteger.isEven(4));
        Assertions.assertFalse(MyInteger.isEven(7));
    }

    @Test
    public void testIsOddStatic() {
        Assertions.assertFalse(MyInteger.isOdd(4));
        Assertions.assertTrue(MyInteger.isOdd(7));
    }

    @Test
    public void testIsPrimeStatic() {
        Assertions.assertFalse(MyInteger.isPrime(4));
        Assertions.assertTrue(MyInteger.isPrime(7));
    }

    @Test
    public void testIsEvenMyInteger(){
        Assertions.assertTrue(MyInteger.isEven(new MyInteger(4)));
        Assertions.assertFalse(MyInteger.isEven(new MyInteger(3)));
    }

    @Test
    public void testIsOddMyInteger(){
        Assertions.assertTrue(MyInteger.isOdd(new MyInteger(3)));
        Assertions.assertFalse(MyInteger.isOdd(new MyInteger(4)));
    }

    @Test
    public void testIsPrimeMyInteger(){
        Assertions.assertFalse(MyInteger.isPrime(new MyInteger(4)));
        Assertions.assertTrue(MyInteger.isPrime(new MyInteger(7)));
    }

    @Test
    public void testEquals() {
        Assertions.assertTrue(new MyInteger(5).equals(5));
        Assertions.assertFalse(new MyInteger(5).equals(4));
    }

    @Test
    public void testEqualsMyInteger() {
        Assertions.assertTrue(new MyInteger(5).equals(new MyInteger(5)));
        Assertions.assertFalse(new MyInteger(4).equals(new MyInteger(5)));
    }

    @Test
    public void testParseIntCharArray() {
        Assertions.assertEquals(10, MyInteger.parseInt(new char[] {'1', '0'}));
    }

    @Test
    public void testParseintString() {
        Assertions.assertEquals(11, MyInteger.parseInt( "11") );
    }
}