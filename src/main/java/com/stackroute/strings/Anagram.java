package com.stackroute.strings;

import java.util.Arrays;

public class Anagram {
    //write logic to check given two phrases are anagrams or not and return result
    public String checkAnagrams(String phraseOne, String phraseTwo) {
        // if any one is empty, return appropriate message
        if (phraseOne.isEmpty() || phraseTwo.isEmpty()) return "Give proper input not empty phrases";
        
        // if length of both are different, they cannot be Anagram
        if (phraseOne.length() != phraseTwo.length()) return "Given phrases are not anagrams";
        
        // convert strings to character arrays and then sort
        char[] phraseOneArray = phraseOne.toCharArray();
        Arrays.sort(phraseOneArray);
        
        char[] phraseTwoArray = phraseTwo.toCharArray();
        Arrays.sort(phraseTwoArray);

        // create new String objects 
        String phraseOneSorted = new String(phraseOneArray);
        String phraseTwoSorted = new String(phraseTwoArray);

        // compare and return appropriate error message
        if (phraseOneSorted.equals(phraseTwoSorted)) return "Given phrases are anagrams";
        return "Given phrases are not anagrams";
    }
}
