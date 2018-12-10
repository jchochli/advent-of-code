package aoc.day03;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import aoc.Day;

public class Day03 implements Day {

    @Override
    public String part1(List<String> input) {
        return input.stream().map(Long::valueOf).reduce(Long::sum).get().toString();
    }

    @Override
    public String part2(List<String> input) {
        long total = 0;
        Set<Long> totals = new HashSet<>();
        boolean isFound = false;
        while (!isFound) {
            for (String cur: input) {
                total += Long.parseLong(cur);
                if (totals.contains(total)) {
                    isFound = true;
                    break;
                }
                totals.add(total);
            }
        }
        return Long.toString(total);
    }

}
