package ru.therealmone.CodingBat;

import ru.therealmone.CodingBat.Warmup1.*;
import ru.therealmone.CodingBat.Warmup2.*;
import ru.therealmone.CodingBat.String1.*;
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
        //stringYak
        assertEquals("pak", stringYak.stringYakSolution("yakpak"));
        assertEquals("pak", stringYak.stringYakSolution("pakyak"));
        assertEquals("123ya", stringYak.stringYakSolution("yak123ya"));
        //has271
        assertTrue(has271.has271Solution(new int[] {1, 2, 7, 1}));
        assertFalse(has271.has271Solution(new int[] {1, 2, 8, 1}));
        assertTrue(has271.has271Solution(new int[] {2, 7, 1}));
        //countXX
        assertEquals(1, countXX.countXXSolution("abcxx"));
        assertEquals(2, countXX.countXXSolution("xxx"));
        assertEquals(3, countXX.countXXSolution("xxxx"));
        //stringSplosion
        assertEquals("CCoCodCode", stringSplosion.stringSplosionSolution("Code"));
        assertEquals("aababc", stringSplosion.stringSplosionSolution("abc"));
        assertEquals("aab", stringSplosion.stringSplosionSolution("ab"));
        //arrayFront9
        assertTrue(arrayFront9.arrayFront9Solution(new int[] {1, 2, 9, 3, 4}));
        assertFalse(arrayFront9.arrayFront9Solution(new int[] {1, 2, 3, 4, 9}));
        assertFalse(arrayFront9.arrayFront9Solution(new int[] {1, 2, 3, 4, 5}));
        //stringX
        assertEquals("xHix", stringX.stringXSolution("xxHxix"));
        assertEquals("abcd", stringX.stringXSolution("abxxxcd"));
        assertEquals("xabcdx", stringX.stringXSolution("xabxxxcdx"));
        //array667
        assertEquals(1, array667.array667Solution(new int[] {6, 6, 2}));
        assertEquals(1, array667.array667Solution(new int[] {6, 6, 2, 6}));
        assertEquals(1, array667.array667Solution(new int[] {6, 7, 2, 6}));
    }

    @Test
    public void string1Tests() {
        //helloName
        assertEquals("Hello Bob!", helloName.helloNameSolution("Bob"));
        assertEquals("Hello Alice!", helloName.helloNameSolution("Alice"));
        assertEquals("Hello X!", helloName.helloNameSolution("X"));
        //makeOutWord
        assertEquals("<<Yay>>", makeOutWord.makeOutWordSolution("<<>>", "Yay"));
        assertEquals("<<WooHoo>>", makeOutWord.makeOutWordSolution("<<>>", "WooHoo"));
        assertEquals("[[word]]", makeOutWord.makeOutWordSolution("[[]]", "word"));
        //firstHalf
        assertEquals("Woo", firstHalf.firstHalfSolution("WooHoo"));
        assertEquals("Hello", firstHalf.firstHalfSolution("HelloThere"));
        assertEquals("abc", firstHalf.firstHalfSolution("abcdef"));
        //nonStart
        assertEquals("ellohere", nonStart.nonStartSolution("Hello", "There"));
        assertEquals("avaode", nonStart.nonStartSolution("java", "code"));
        assertEquals("hotlava", nonStart.nonStartSolution("shotl", "java"));
        //theEnd
        assertEquals("H", theEnd.theEndSolution("Hello", true));
        assertEquals("o", theEnd.theEndSolution("Hello", false));
        assertEquals("o", theEnd.theEndSolution("oh", true));
        //endsLy
        assertTrue(endSly.endSlySolution("oddly"));
        assertFalse(endSly.endSlySolution("y"));
        assertFalse(endSly.endSlySolution("oddy"));
        //middleThree
        assertEquals("and", middleThree.middleThreeSolution("Candy"));
        assertEquals("and", middleThree.middleThreeSolution("and"));
        assertEquals("lvi", middleThree.middleThreeSolution("solving"));
        //lastChars
        assertEquals("ls", lastChars.lastCharsSolution("last", "chars"));
        assertEquals("ya", lastChars.lastCharsSolution("yo", "java"));
        assertEquals("h@", lastChars.lastCharsSolution("hi", ""));
        //extraFront
        assertEquals("HeHeHe", extraFront.extraFrontSolution("Hello"));
        assertEquals("ababab", extraFront.extraFrontSolution("ab"));
        assertEquals("HHH", extraFront.extraFrontSolution("H"));
        //startWord
        assertEquals("hi", startWord.startWordSolution("hippo", "hi"));
        assertEquals("hip", startWord.startWordSolution("hippo", "xip"));
        assertEquals("h", startWord.startWordSolution("hippo", "i"));
        //makeAbba
        assertEquals("HiByeByeHi", makeAbba.makeAbbaSolution("Hi", "Bye"));
        assertEquals("YoAliceAliceYo", makeAbba.makeAbbaSolution("Yo", "Alice"));
        assertEquals("WhatUpUpWhat", makeAbba.makeAbbaSolution("What", "Up"));
        //extraEnd
        assertEquals("lololo", extraEnd.extraEndSolution("Hello"));
        assertEquals("ababab", extraEnd.extraEndSolution("ab"));
        assertEquals("HiHiHi", extraEnd.extraEndSolution("Hi"));
        //withoutEnd
        assertEquals("ell", withoutEnd.withoutEndSolution("Hello"));
        assertEquals("av", withoutEnd.withoutEndSolution("Java"));
        assertEquals("odin", withoutEnd.withoutEndSolution("Coding"));
        //left2
        assertEquals("lloHe", left2.left2Solution("Hello"));
        assertEquals("vaja", left2.left2Solution("java"));
        assertEquals("Hi", left2.left2Solution("Hi"));
        //withoutEnd2
        assertEquals("ell", withoutEnd2.withoutEnd2Solution("Hello"));
        assertEquals("b", withoutEnd2.withoutEnd2Solution("abc"));
        assertEquals("", withoutEnd2.withoutEnd2Solution("ab"));
        //nTwice
        assertEquals("Helo", nTwice.nTwiceSolution("Hello", 2));
        assertEquals("Choate", nTwice.nTwiceSolution("Chocolate", 3));
        assertEquals("Ce", nTwice.nTwiceSolution("Chocolate", 1));
        //hasBad
        assertTrue(hasBad.hasBadSolution("badxx"));
        assertTrue(hasBad.hasBadSolution("xbadxx"));
        assertFalse(hasBad.hasBadSolution("xxbadxx"));
        //conCat
        assertEquals("abcat", conCat.conCatSolution("abc", "cat"));
        assertEquals("dogcat", conCat.conCatSolution("dog", "cat"));
        assertEquals("abc", conCat.conCatSolution("abc", ""));
        //frontAgain
        assertTrue(frontAgain.frontAgainSolution("edited"));
        assertFalse(frontAgain.frontAgainSolution("edit"));
        assertTrue(frontAgain.frontAgainSolution("ed"));
        //without2
        assertEquals("lloHe", without2.without2Solution("HelloHe"));
        assertEquals("HelloHi", without2.without2Solution("HelloHi"));
        assertEquals("", without2.without2Solution("Hi"));
        //withoutX
        assertEquals("Hi", withoutX.withoutXSolution("xHix"));
        assertEquals("Hi", withoutX.withoutXSolution("xHi"));
        assertEquals("Hxi", withoutX.withoutXSolution("Hxix"));
        //makeTags
        assertEquals("<i>Yay</i>", makeTags.makeTagsSolution("i", "Yay"));
        assertEquals("<i>Hello</i>", makeTags.makeTagsSolution("i", "Hello"));
        assertEquals("<cite>Yay</cite>", makeTags.makeTagsSolution("cite", "Yay"));
        //firstTwo
        assertEquals("He", firstTwo.firstTwoSolution("Hello"));
        assertEquals("ab", firstTwo.firstTwoSolution("abcdefg"));
        assertEquals("ab", firstTwo.firstTwoSolution("ab"));
        //comboString
        assertEquals("hiHellohi", comboString.comboStringSolution("Hello", "hi"));
        assertEquals("hiHellohi", comboString.comboStringSolution("hi", "Hello"));
        assertEquals("baaab", comboString.comboStringSolution("aaa", "b"));
        //right2
        assertEquals("loHel", right2.right2Solution("Hello"));
        assertEquals("vaja", right2.right2Solution("java"));
        assertEquals("Hi", right2.right2Solution("Hi"));
        //middleTwo
        assertEquals("ri", middleTwo.middleTwoSolution("string"));
        assertEquals("od", middleTwo.middleTwoSolution("code"));
        assertEquals("ct", middleTwo.middleTwoSolution("Practice"));
        //twoChar
        assertEquals("ja", twoChar.twoCharSolution("java", 0));
        assertEquals("va", twoChar.twoCharSolution("java", 2));
        assertEquals("ja", twoChar.twoCharSolution("java", 3));
        //atFirst
        assertEquals("he", atFirst.atFirstSolution("hello"));
        assertEquals("hi", atFirst.atFirstSolution("hi"));
        assertEquals("h@", atFirst.atFirstSolution("h"));
        //lastTwo
        assertEquals("codign", lastTwo.lastTwoSolution("coding"));
        assertEquals("cta", lastTwo.lastTwoSolution("cat"));
        assertEquals("ba", lastTwo.lastTwoSolution("ab"));
        //minCat
        assertEquals("loHi", minCat.minCatSolution("Hello", "Hi"));
        assertEquals("ellojava", minCat.minCatSolution("Hello", "java"));
        assertEquals("javaello", minCat.minCatSolution("java", "Hello"));
        //deFront
        assertEquals("llo", deFront.deFrontSolution("Hello"));
        assertEquals("va", deFront.deFrontSolution("java"));
        assertEquals("aay", deFront.deFrontSolution("away"));
        //withoutX2
        assertEquals("Hi", withoutX2.withoutX2Solution("xHi"));
        assertEquals("Hi", withoutX2.withoutX2Solution("Hxi"));
        assertEquals("Hi", withoutX2.withoutX2Solution("Hi"));
    }
}
