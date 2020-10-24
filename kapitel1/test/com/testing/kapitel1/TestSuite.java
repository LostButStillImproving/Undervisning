package com.testing.kapitel1;

import mUnit.Assertions;

class TestSuite {

    public String test(){
        return Assertions.assertEqual("1","a");
    }
    public String test2(){ return Assertions.assertEqual("a","a"); }
}
