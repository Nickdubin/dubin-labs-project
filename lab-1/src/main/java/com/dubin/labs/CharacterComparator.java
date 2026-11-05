package com.dubin.labs;

import java.util.Comparator;

public class CharacterComparator implements Comparator<Character> {

    public int compare(Character c1, Character c2) {
        return Integer.compare(c2.getName().length(), c1.getName().length());
    }
}
