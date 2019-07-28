package com.RezaAk.meritamerica.tries;

public class TrieTest {

	public static void main(String[] args) {

		//create a new object trieTest
		Trie trieTest = new Trie();
		
		//instanciations
		//inserting new words to the tire
        trieTest.addNewWord("car");
        trieTest.addNewWord("card");
        trieTest.addNewWord("chip");
        trieTest.addNewWord("trie");
        trieTest.addNewWord("try");
        trieTest.addNewWord("123");
        trieTest.addNewWord("Rezax");
        
       //Check for prefix 
       System.out.println("\n*****Check for Prefix*****");
       trieTest.isPrefixValid("cat");
       trieTest.isPrefixValid("car");
       trieTest.isPrefixValid("tr");
       trieTest.isPrefixValid("chi");
       trieTest.isPrefixValid("Reza");
       
       
        //Check for word
        System.out.println("\n*****Check for Word*****");
		trieTest.isWordValid("car");
		trieTest.isWordValid("t");
		trieTest.isWordValid("elp");
		trieTest.isWordValid("ch");
		trieTest.isWordValid("try");
		trieTest.isWordValid("mix");
		trieTest.isWordValid("card");
		
       
       
       
       trieTest.printAllKeys();
       trieTest.size();
       
		
		
		
	}

}
