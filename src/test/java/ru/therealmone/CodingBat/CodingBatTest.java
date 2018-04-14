package ru.therealmone.CodingBat;

import ru.therealmone.CodingBat.Warmup1.*;
import ru.therealmone.CodingBat.Warmup2.*;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CodingBatTest {

    @Test
    public void warmup1Tests() {
        //sleepIn
        assertTrue(sleepIn.sleepInSolution(true, true));
        assertFalse(sleepIn.sleepInSolution(true, false));
        assertTrue(sleepIn.sleepInSolution(false, true));
        //diff21
        assertEquals(2, diff21.diff21Solution(19));
        assertEquals(11, diff21.diff21Solution(10));
        assertEquals(0, diff21.diff21Solution(21));
        //nearHundred
        assertTrue(nearHundred.nearHundredSolution(93));
        assertTrue(nearHundred.nearHundredSolution(90));
        assertFalse(nearHundred.nearHundredSolution(89));
        //missingChar
        assertEquals("ktten", missingChar.missingCharSolution("kitten", 1));
        assertEquals("itten", missingChar.missingCharSolution("kitten", 0));
        assertEquals("kittn", missingChar.missingCharSolution("kitten", 4));
        //backAround
        assertEquals("tcatt", backAround.backAroundSolution("cat"));
        assertEquals("oHelloo", backAround.backAroundSolution("Hello"));
        assertEquals("aaa", backAround.backAroundSolution("a"));
        //startHi
        assertTrue(startHi.startHiSolution("hi there"));
        assertTrue(startHi.startHiSolution("hi"));
        assertFalse(startHi.startHiSolution("hello hi"));
        //hasTeen
        assertTrue(hasTeen.hasTeenSolution(13, 20, 10));
        assertTrue(hasTeen.hasTeenSolution(20, 19, 10));
        assertTrue(hasTeen.hasTeenSolution(20, 10, 13));
        //mixStart
        assertTrue(mixStart.mixStartSolution("mix snacks"));
        assertTrue(mixStart.mixStartSolution("pix snacks"));
        assertFalse(mixStart.mixStartSolution("piz snacks"));
        //close10
        assertEquals(8, close10.close10Solution(8, 13));
        assertEquals(8, close10.close10Solution(13, 8));
        assertEquals(0, close10.close10Solution(13, 7));
        //stringE
        assertTrue(stringE.stringESolution("Hello"));
        assertTrue(stringE.stringESolution("Heelle"));
        assertFalse(stringE.stringESolution("Heelele"));
        //everyNth
        assertEquals("Mrce", everyNth.everyNthSolution("Miracle", 2));
        assertEquals("aceg", everyNth.everyNthSolution("abcdefg", 2));
        assertEquals("adg", everyNth.everyNthSolution("abcdefg", 3));
        //monkeyTrouble
        assertTrue(monkeyTrouble.monkeyTroubleSolution(true, true));
        assertTrue(monkeyTrouble.monkeyTroubleSolution(false, false));
        assertFalse(monkeyTrouble.monkeyTroubleSolution(true, false));
        //parrotTrouble
        assertTrue(parrotTrouble.parrotTroubleSolution(true, 6));
        assertFalse(parrotTrouble.parrotTroubleSolution(true, 7));
        assertFalse(parrotTrouble.parrotTroubleSolution(false, 6));
        //posNeg
        assertTrue(posNeg.posNegSolution(1, -1, false));
        assertTrue(posNeg.posNegSolution(-1, 1, false));
        assertTrue(posNeg.posNegSolution(-4, -5, true));
        //frontBack
        assertEquals("eodc", frontBack.frontBackSolution("code"));
        assertEquals("a", frontBack.frontBackSolution("a"));
        assertEquals("ab", frontBack.frontBackSolution("ba"));
        //or35
        assertTrue(or35.or35Solution(3));
        assertTrue(or35.or35Solution(10));
        assertFalse(or35.or35Solution(8));
        //icyHot
        assertTrue(icyHot.icyHotSolution(120, -1));
        assertTrue(icyHot.icyHotSolution(-1, 120));
        assertFalse(icyHot.icyHotSolution(2, 120));
        //loneTeen
        assertTrue(loneTeen.loneTeenSolution(13, 99));
        assertTrue(loneTeen.loneTeenSolution(21, 19));
        assertFalse(loneTeen.loneTeenSolution(13, 13));
        //startOz
        assertEquals("oz", startOz.startOzSolution("ozymandias"));
        assertEquals("z", startOz.startOzSolution("bzoo"));
        assertEquals("o", startOz.startOzSolution("oxx"));
        //in3050
        assertTrue(in3050.in3050Solution(30, 31));
        assertFalse(in3050.in3050Solution(30, 41));
        assertTrue(in3050.in3050Solution(40, 50));
        //lastDigit
        assertTrue(lastDigit.lastDigitSolution(7, 17));
        assertFalse(lastDigit.lastDigitSolution(6, 17));
        assertTrue(lastDigit.lastDigitSolution(3, 113));
        //sumDouble
        assertEquals(3, sumDouble.sumDoubleSolution(1, 2));
        assertEquals(5, sumDouble.sumDoubleSolution(3, 2));
        assertEquals(8, sumDouble.sumDoubleSolution(2, 2));
        //makes10
        assertTrue(makes10.makes10Solution(9, 10));
        assertFalse(makes10.makes10Solution(9, 9));
        assertTrue(makes10.makes10Solution(1, 9));
        //notString
        assertEquals("not candy", notString.notStringSolution("candy"));
        assertEquals("not x", notString.notStringSolution("x"));
        assertEquals("not bad", notString.notStringSolution("not bad"));
        //front3
        assertEquals("JavJavJav", front3.front3Solution("Java"));
        assertEquals("ChoChoCho", front3.front3Solution("Chocolate"));
        assertEquals("abcabcabc", front3.front3Solution("abc"));
        //front22
        assertEquals("kikittenki", front22.front22Solution("kitten"));
        assertEquals("HaHaHa", front22.front22Solution("Ha"));
        assertEquals("ababcab", front22.front22Solution("abc"));
        //in1020
        assertTrue(in1020.in1020Solution(12, 99));
        assertTrue(in1020.in1020Solution(21, 12));
        assertFalse(in1020.in1020Solution(8, 99));
        //delDel
        assertEquals("abc", delDel.delDelSolution("adelbc"));
        assertEquals("aHello", delDel.delDelSolution("adelHello"));
        assertEquals("adedbc", delDel.delDelSolution("adedbc"));
        //intMax
        assertEquals(3, intMax.intMaxSolution(1, 2 ,3));
        assertEquals(3, intMax.intMaxSolution(1, 3 ,2));
        assertEquals(3, intMax.intMaxSolution(3, 2 ,1));
        //max1020
        assertEquals(19, max1020.max1020Solution(11, 19));
        assertEquals(19, max1020.max1020Solution(19, 11));
        assertEquals(11, max1020.max1020Solution(11, 9));
        //endUp
        assertEquals("HeLLO", endUp.endUpSolution("Hello"));
        assertEquals("hi thERE", endUp.endUpSolution("hi there"));
        assertEquals("HI", endUp.endUpSolution("hi"));
    }

    @Test
    public void warmup2Tests() {
        //frontTimes
        assertEquals("HiHi", stringTimes.stringTimesSolution("Hi",2));
        assertEquals("HiHiHi", stringTimes.stringTimesSolution("Hi",3));
        assertEquals("Hi", stringTimes.stringTimesSolution("Hi",1));
        //doubleX
        assertTrue(doubleX.doubleXSolution("axxbb"));
        assertFalse(doubleX.doubleXSolution("axaxax"));
        assertTrue(doubleX.doubleXSolution("xxxxx"));
        //last2
        assertEquals(1, last2.last2Solution("hixxhi"));
        assertEquals(1, last2.last2Solution("xaxxaxaxx"));
        assertEquals(2, last2.last2Solution("axxxaaxx"));
        //array123
        assertTrue(array123.array123Solution(new int[] {1, 1, 2, 3, 1}));
        assertFalse(array123.array123Solution(new int[] {1, 1, 2, 4, 1}));
        assertTrue(array123.array123Solution(new int[] {1, 1, 2, 1, 2, 3}));
        //altPairs
        assertEquals("kien", altPairs.altPairsSolution("kitten"));
        assertEquals("Chole", altPairs.altPairsSolution("Chocolate"));
        assertEquals("Congrr", altPairs.altPairsSolution("CodingHorror"));
        //noTriples
        assertTrue(noTriples.noTriplesSolution(new int[] {1, 1, 2, 2, 1}));
        assertFalse(noTriples.noTriplesSolution(new int[] {1, 1, 2, 2, 2, 1}));
        assertFalse(noTriples.noTriplesSolution(new int[] {1, 1, 1, 2, 2, 2, 1}));
        //frontTimes
        assertEquals("ChoCho", frontTimes.frontTimesSolution("Chocolate", 2));
        assertEquals("ChoChoCho", frontTimes.frontTimesSolution("Chocolate", 3));
        assertEquals("AbcAbcAbc", frontTimes.frontTimesSolution("Abc", 3));
        //stringBits
        assertEquals("Hlo", stringBits.stringBitsSolution("Hello"));
        assertEquals("H", stringBits.stringBitsSolution("Hi"));
        assertEquals("Hello", stringBits.stringBitsSolution("Heeololeo"));
        //arrayCount9
        assertEquals(1, arrayCount9.arrayCount9Solution(new int[] {1, 2, 9}));
        assertEquals(2, arrayCount9.arrayCount9Solution(new int[] {1, 9, 9}));
        assertEquals(3, arrayCount9.arrayCount9Solution(new int[] {1, 9, 9, 3, 9}));
        //stringMatch
        assertEquals(3, stringMatch.stringMatchSolution("xxcaazz", "xxbaaz"));
        assertEquals(2, stringMatch.stringMatchSolution("abc", "abc"));
        assertEquals(0, stringMatch.stringMatchSolution("abc", "axc"));
    }
}
