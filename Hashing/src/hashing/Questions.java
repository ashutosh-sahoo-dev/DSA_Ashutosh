package hashing;

public class Questions {

}
/*     The students are to be explained these theories before the programming activities.
(Chapter-11 Page:396-404)
What is Hashing and a Hash-Table? What are the operations on Hash-Table ADT?
What is Collision? What are Collision Resolution techniques?
1
Write a program to store this list of 10 numbers [23, 4, 57, 82, 95, 13, 113, 224, 72, 18]
in a hash table of size 10. Design a division-based hash function (modulo method) to
store the elements and find the number of collisions that occurred.
L3
2
Design a method to use Linear Probing to resolve collisions while storing the list of
numbers in Q-1 in the hash table. L3
3
Design a method to use Quadratic Probing to resolve collisions while storing the list of
numbers in Q-1 in the hash table. L3
4
Design a method to use separate chaining to resolve collisions while storing the list of
numbers in Q-1 in the hash table. L3
5
# HashSet implementation of JAVA Collections
import java.util.HashSet;
public class HashSetDemo {
 public static void main(String[] args) {
 // Create a hash set.
 HashSet<String> hs = new HashSet<String>();
 // Add elements to the hash set.
 hs.add("India");
 hs.add("USA");
 hs.add("Brazil");
 System.out.println(hs);
 System.out.println("Hash Table contains USA : " +
hs.contains("USA"));
 System.out.println("Hash Table contains UK : " +
hs.contains("UK"));
 hs.remove("USA");
 System.out.println(hs);
 System.out.println("Hash Table contains USA : " +
hs.contains("USA"));
 }
}
L3
Output
[USA, Brazil, India]
Hash Table contains USA : true
Hash Table contains UK : false
[Brazil, India]
Hash Table contains USA : false
6 Use HashSet to remove duplicate characters in a given string. L3
7
#HashMap implementation in JAVA Collection
import java.util.HashMap;
public class HashMapDemo {
 public static void main(String[] args) {
 // Create a hash map.
 HashMap<String, Integer> hm = new HashMap<String, Integer>
();

 // Put elements into the map
 hm.put("Mason", new Integer(55));
 hm.put("Jacob", new Integer(77));
 hm.put("William", new Integer(99));
 hm.put("Emma", new Integer(65));
 System.out.println("Students count :: " + hm.size());
 for(String key : hm.keySet()){
 System.out.println(key + " score marks :" + hm.get(key));
 }
 System.out.println("Emma score available ::" +
hm.containsKey("Emma"));
 System.out.println("John score available:: " +
hm.containsKey("John"));
 }
}
Output
Mason score marks :55
William score marks :99
Emma score marks :65
Jacob score marks :77
Emma score available ::true
John score available :: false
L3
8
Write a program using a HashMap to determine whether two given strings are
anagrams. An anagram is a word or phrase formed by reordering the letters of another
word.
 */