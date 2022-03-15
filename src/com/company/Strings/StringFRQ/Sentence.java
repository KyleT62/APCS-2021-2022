package com.company.Strings.StringFRQ;

public class Sentence {

    private String currSent;

    /** Constructs a new Sentence object. */
    public Sentence(String p) {
        currSent = p;
    }

    /** Returns a string containing the current sentence. */
    public String toString() {
        return currSent;
    }



    /** Returns the index of the nth occurrence of str in the current sencence;
     * returns -1 of the nth occurrence does not exist.
     * Precondition:  str.length() > 0 and n > 0
     * Postcondition: the current sentence if not modified.
     */
    public int findNthTime(String str, int n) {
        String sent = currSent;
        int inst = sent.indexOf(str);
        for(int i = 1; i < n; i++){
            inst = sent.indexOf(str,inst + 1);
            if(inst == -1){
                return -1;
            }
        }

        return inst;  //replace this
    }

    /** Modifies the current sentence by replacing the nth occurrence of str with repl
     * If the nth occurrence does not exist, the current sentence is unchanged.
     * Precondition: str.length() > 0 and n > 0
     *
     */
    public void replaceNthTime(String str, int n, String repl) {
        findNthTime(str,n);
        int num = findNthTime(str,n);

        if(num == -1){
            System.out.println(currSent);
        }
        else
            System.out.println(currSent.substring(0,num) + repl + currSent.substring(num + str.length()));
    }

    /** Returns the index of the last occurrence of str in the current sentence:
     * returns -1 if str is not found.
     * Precondition:  str.length() > 0
     * Postcondition: the current sentence is not modified.
     */
    public int findLastTime(String str) {
        int count = -1;

        for(int i = 0; i <= currSent.length(); i++){
            if(findNthTime(str, i) != -1){
                count = findNthTime(str,i);
            }
        }
        return count;  // replace this
    }

    public static void main(String[] args) {
        Sentence sentence1 = new Sentence("A cat ate late.");
        System.out.println(sentence1.findNthTime("at",1));
        sentence1.replaceNthTime("at", 1, "rane");
        System.out.println(sentence1);

        System.out.println();

        Sentence sentence2 = new Sentence("A cat ate late.");
        System.out.println(sentence2.findNthTime("at",6));
        sentence2.replaceNthTime("at", 6, "xx");
        System.out.println(sentence2);

        System.out.println();

        Sentence sentence7 = new Sentence("A cat ate late.");
        System.out.println(sentence7.findNthTime("at",3));
        sentence7.replaceNthTime("at", 3, "xx");
        System.out.println(sentence7);

        System.out.println();

        Sentence sentence3 = new Sentence("A cat ate late.");
        System.out.println(sentence3.findNthTime("bat",2));
        sentence3.replaceNthTime("bat", 2, "xx");
        System.out.println(sentence3);

        System.out.println();

        Sentence sentence4 = new Sentence("aaaa");
        sentence4.replaceNthTime("aa", 1, "xx");
        System.out.println(sentence4);

        System.out.println();

        Sentence sentence5 = new Sentence("aaaa");
        sentence5.replaceNthTime("aaa", 2, "bbb");
        System.out.println(sentence5);

        System.out.println();

        Sentence sentence6 = new Sentence("A cat ate late.");
        System.out.println(sentence6.findLastTime("at"));
        System.out.println(sentence6.findLastTime("cat"));
        System.out.println(sentence6.findLastTime("bat"));
    }

}

/*
OUTPUT
3
A crane ate late.
A cat ate late.
-1
A cat ate late.
A cat ate late.
11
A cat ate lxxe.
A cat ate late.
-1
A cat ate late.
A cat ate late.
xxaa
aaaa
abbb
aaaa
11
2
-1
 */