package com.yl.leetcode.easy.sep22;

/**
 * @author Lei
 * @version 1.0
 * @date 2022/9/6 - 09 - 06 - 0:20
 * @Description Check If a Word Occurs As a Prefix of Any Word in a Sentence
 * <p>
 * Given a sentence that consists of some words separated by a single space, and a searchWord, check if searchWord is a prefix of any word in sentence.
 * <p>
 * Return the index of the word in sentence (1-indexed) where searchWord is a prefix of this word. If searchWord is a prefix of more than one word,
 * return the index of the first word (minimum index). If there is no such word return -1.
 * <p>
 * A prefix of a string s is any leading contiguous substring of s.
 */
public class LC1455 {

    public static void main(String[] args) {
        LC1455 lc1455 = new LC1455();
        System.out.println(lc1455.isPrefixOfWord("i love eating burger", "burg"));
        System.out.println(lc1455.isPrefixOfWord("hellohello hellohellohello",
                "ell"));
    }

    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] sen = sentence.split((" "));
        for (int i = 1; i <= sen.length; i++) {
            if (sen[i - 1].startsWith(searchWord)) {
                return i ;
            }
        }
        return -1;
    }


    /*public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for (int i = 1; i <= words.length; ++i) {
            if (words[i - 1].startsWith(searchWord)) {
                return i;
            }
        }
        return -1;
    }*/
}
