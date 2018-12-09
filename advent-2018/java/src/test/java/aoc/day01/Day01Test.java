package aoc.day01;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Day01Test {

    @Test
    public void testPart1(){
        // Given
        List<String> input = Arrays.asList("+1","-1","+2");

        // When
        String result = new Day01().part1(input);

        // Then
        assertEquals("2", result);
    }

    @Test
    public void testPart2(){
        // Given
        List<String> input = Arrays.asList("+3", "+3", "+4", "-2", "-4");

        // When
        String result = new Day01().part2(input);

        // Then
        assertEquals("10", result);
    }
}
