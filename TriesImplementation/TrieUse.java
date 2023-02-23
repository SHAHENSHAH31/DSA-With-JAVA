package TriesImplementation;

public class TrieUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Trie t=new Trie();
t.add("NOTE");
t.add("AND");
System.out.println(t.search("AND"));
t.remove("AND");
System.out.println(t.search("AND"));
	}

}
