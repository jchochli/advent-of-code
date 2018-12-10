package aoc.day02;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Day02Test {

    @Test
    public void testPart1(){
        // Given
        List<String> input = Arrays.asList("abcdef", "bababc", "abbcde", "abcccd", "aabcdd", "abcdee", "ababab");

        // When
        String result = new Day02().part1(input);

        // Then
        assertEquals("12", result);
    }

    @Test
    public void testPart2(){
        // Given
        List<String> input = Arrays.asList("abcde", "fghij", "klmno", "pqrst", "fguij", "axcye", "wvxyz");

        // When
        String result = new Day02().part2(input);

        // Then
        assertEquals("fgij", result);
    }
}
