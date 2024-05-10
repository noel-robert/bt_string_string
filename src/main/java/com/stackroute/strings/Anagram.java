package com.stackroute.strings;

import java.util.Arrays;

public class Anagram {
    // sorting the array using Bubble Sort
    char[] sortCharArray(char[] arr) {
        int n = arr.length;

        for (int i=0; i<n-1; i++) {
            for (int j=0; j<n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    char ch = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = ch;
                }
            }
        }
        return arr;
    }

    // convert input str of type String to type char[]
    char[] convertToCharArray(String str) {
        int len = str.length();
        char arr[] = new char[len];

        for (int i=0; i<len; i++) {
            arr[i] = str.charAt(i);
        }

        return arr;
    }

    //write logic to check given two phrases are anagrams or not and return result
    public String checkAnagrams(String phraseOne, String phraseTwo) {
        // if any one is empty, return appropriate message
        if (phraseOne.isEmpty() || phraseTwo.isEmpty()) return "Give proper input not empty phrases";
        
        // if length of both are different, they cannot be Anagram
        if (phraseOne.length() != phraseTwo.length()) return "Given phrases are not anagrams";
        

        // convert strings to character arrays and then sort
        // char[] phraseOneArray = phraseOne.toCharArray();
        // Arrays.sort(phraseOneArray);
        // char[] phraseTwoArray = phraseTwo.toCharArray();
        // Arrays.sort(phraseTwoArray);
        
        char[] phraseOneArray = convertToCharArray(phraseOne);
        phraseOneArray = sortCharArray(phraseOneArray);
        char[] phraseTwoArray = convertToCharArray(phraseTwo);
        phraseTwoArray = sortCharArray(phraseTwoArray);


        // create new String objects 
        String phraseOneSorted = new String(phraseOneArray);
        String phraseTwoSorted = new String(phraseTwoArray);

        // compare and return appropriate error message
        if (phraseOneSorted.equals(phraseTwoSorted)) return "Given phrases are anagrams";
        return "Given phrases are not anagrams";
    }
}
