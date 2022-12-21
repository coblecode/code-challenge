package com.challenge;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.challange.CodingChallengesJava;

class CodingChallengesJavaTest {

  private final CodingChallengesJava codingChallengesJava = new CodingChallengesJava();

  @Test
  void shouldReturnLongestWordForAGivenString() {
    String longestWordCount1 = codingChallengesJava.longestWord("Hi my name is John Doe");
    String longestWordCount2 = codingChallengesJava.longestWord("How is a hashmap implemented");
    String longestWordCount3 = codingChallengesJava.longestWord("What does clean code mean to you");
    String longestWordCount4 = codingChallengesJava.longestWord("Hello world");

    assertEquals("name : 4", longestWordCount1);
    assertEquals("implemented : 11", longestWordCount2);
    assertEquals("clean : 5", longestWordCount3);
    assertEquals("Hello : 5", longestWordCount4);
  }

  @Test
  void shouldCheckIfIsOrNotTidyNumber() {
    boolean isTidy1 = codingChallengesJava.isTidy(123456);
    boolean isTidy2 = codingChallengesJava.isTidy(3889);
    boolean isTidy3 = codingChallengesJava.isTidy(32849605);
    boolean isTidy4 = codingChallengesJava.isTidy(123123058);

    assertTrue(isTidy1);
    assertTrue(isTidy2);
    assertFalse(isTidy3);
    assertFalse(isTidy4);
  }

  @Test
  void shouldReturnTheMissingLetter() {
    char missingLetter1 = codingChallengesJava.findMissingLetter(new char[] {'a', 'b', 'c', 'e'});
    char missingLetter2 = codingChallengesJava.findMissingLetter(new char[] {'o', 'q', 'r', 's'});
    char missingLetter3 = codingChallengesJava.findMissingLetter(new char[] {'x', 'z'});

    assertEquals('d', missingLetter1);
    assertEquals('p', missingLetter2);
    assertEquals('y', missingLetter3);
  }

}