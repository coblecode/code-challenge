package com.challange

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CodingChallengesKotlinTest {

  private val codingChallengesKotlin = CodingChallengesKotlin()

  @Test
  fun `should return the longest word for a given string`() {
    val longestWordCount1 = codingChallengesKotlin.longestWord("Hi my name is John Doe")
    val longestWordCount2 = codingChallengesKotlin.longestWord("How is a hashmap implemented")
    val longestWordCount3 = codingChallengesKotlin.longestWord("What does clean code mean to you")
    val longestWordCount4 = codingChallengesKotlin.longestWord("Hello world")

    assertEquals("name : 4", longestWordCount1)
    assertEquals("implemented : 11", longestWordCount2)
    assertEquals("clean : 5", longestWordCount3)
    assertEquals("Hello : 5", longestWordCount4)
  }

  @Test
  fun `should check if is or not Tidy Number`() {
    val isTidy1 = codingChallengesKotlin.isTidy(123456)
    val isTidy2 = codingChallengesKotlin.isTidy(3889)
    val isTidy3 = codingChallengesKotlin.isTidy(32849605)
    val isTidy4 = codingChallengesKotlin.isTidy(123123058)
    val isTidy5 = codingChallengesKotlin.isTidy(456567)

    assertTrue(isTidy1)
    assertTrue(isTidy2)
    assertFalse(isTidy3)
    assertFalse(isTidy4)
    assertFalse(isTidy5)
  }

  @Test
  fun `should return the missing letter`() {
    val missingLetter1 = codingChallengesKotlin.findMissingLetter(charArrayOf('a', 'b', 'c', 'e'))
    val missingLetter2 = codingChallengesKotlin.findMissingLetter(charArrayOf('o', 'q', 'r', 's'))
    val missingLetter3 = codingChallengesKotlin.findMissingLetter(charArrayOf('x', 'z'))

    assertEquals('d', missingLetter1)
    assertEquals('p', missingLetter2)
    assertEquals('y', missingLetter3)
  }

}