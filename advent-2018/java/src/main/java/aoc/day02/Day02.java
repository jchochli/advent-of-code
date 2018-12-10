package aoc.day02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import aoc.Day;

public class Day02 implements Day {

    @Override
    public String part1(List<String> input) {
        int twosCount = 0;
        int threesCount = 0;

        for (String boxId: input) {
            Map<Character, Integer> letterFreq = new HashMap<>();
            for (int i = 0; i < boxId.length(); i++) {
                Character ch = boxId.charAt(i);
                if (letterFreq.containsKey(ch)) {
                    Integer count = letterFreq.get(ch);
                    count++;
                    letterFreq.put(ch, count);
                } else {
                    letterFreq.put(ch, 1);
                }
            }
            boolean found2 = false;
            boolean found3 = false;
            // count the letters that have freq of 2 and 3;
            for (Map.Entry<Character, Integer> letterEntry: letterFreq.entrySet()) {
                if (!found2 && letterEntry.getValue() == 2) {
                    found2 = true;
                }
                if (!found3 && letterEntry.getValue() == 3) {
                    found3 = true;
                }
                if (found2 && found3) {
                    break;
                }

            }
            if (found2) {
                twosCount++;
            }
            if (found3 ) {
                threesCount++;
            }
        }

        return Integer.toString(twosCount * threesCount);
    }

    @Override
    public String part2(List<String> input) {
        for (int i=0; i<input.size(); i++) {
            Set<String> boxIds = new HashSet<>();
            for (String boxId: input) {
                char[] chars = boxId.toCharArray();
                chars[i] = '_';
                String modifiedBoxId = String.valueOf(chars);
                if (boxIds.contains(modifiedBoxId)) {
                    return modifiedBoxId.replace("_", "");
                } else {
                    boxIds.add(modifiedBoxId);
                }
            }
        }
        return "not found";
    }

}
