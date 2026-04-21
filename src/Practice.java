import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;


public class Practice {

  // Time Complexity: o(n)
  // Space Complexity: o(n)
  // Remember to define your variables! n = length of array
  public static List<Integer> findEvens(int[] array) {
    List<Integer> evens = new ArrayList<>();
    for (int num : array) {
      if (num % 2 == 0) {
        evens.add(num);
      }
    }
    return evens;
  }

  // Assume a rectangular array where #rows <= #cols
  // Time Complexity: o(n) where n = number of rows * columns
  // Space Complexity: o(1)
  // Remember to define your variables!
  public static int sumDiagonal(int[][] matrix) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      sum += matrix[i][i];
    }
    return sum;
  }
  

  // Time Complexity: o(n)
  // Space Complexity: o(n)
  // Remember to define your variables! n = length of array
  public static <T> Map<T, Integer> countFrequencies(T[] array) {
    Map<T, Integer> frequencies = new HashMap<>();
    for (T val : array) {
      frequencies.put(val, frequencies.getOrDefault(val, 0) + 1);
    }
    return frequencies;
  }

  // Time Complexity: o(n^2)
  // Space Complexity: o(n^2)
  // Remember to define your variables! n = n 
  public static List<Integer> evensToSquare(int n) {
    List<Integer> evens = new ArrayList<>();
    for(int i = 0; i <= n*n; i+=2) {
      evens.add(i);
    }
    return evens;
  }

  // Time Complexity: O(n) where n = number of entries in the map
  // Space Complexity: O(n) where n = total number of integers in all the lists in the map
  // Remember to define your variables!
  public static List<Integer> concatVals(Map<Integer, List<Integer>> map) {
    List<Integer> result = new ArrayList<>();

    for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
      for(int num : entry.getValue()) {
        result.add(num);
      }
    }
    return result;
  }

  // Time Complexity: o(1)
  // Space Complexity: o(1)
  // Remember to define your variables!
  public static List<Character> septuple(char c) {
    List<Character> result = new ArrayList<>();
    for(int i = 0; i < 7; i++) {
      result.add(c);
    }
    return result;
  }

  // Time Complexity: o(r*c) where r = number of rows and c = number of columns
  // Space Complexity: o(r*C)
  // Remember to define your variables! rows  * columns
  public static char[][] initCharRect(int rows, int cols) {
    return new char[rows][cols];
  }

  // Assume all strings in strs are of length s
  // Hint: charAt is an O(1) operation in both time and space
  // Time Complexity: O(n) growing linearly, n being the total number of characters across all strings in the list
  // Space Complexity: O(n) where n is the total number of characters across all strings in the list
  // Remember to define your variables!
  public static List<Character> concatStrings(List<String> strs) {
    List<Character> concat = new ArrayList<>();
    for(String str : strs) {
      for(int i = 0; i < str.length(); i++) {
        concat.add(str.charAt(i));
      }
    }
    return concat;
  }

  // Time Complexity: O(1)
  // Space Complexity: O(1)
  // Remember to define your variables!
  public static int cubic(int n, int a, int b, int c, int d) {
    int result = d;
    result += c * n;
    result += b * n * n;
    result += a * n * n * n;
    return result;
  }


  /**
   * Returns the integer that shows up most frequently in an array.
   * If there is a tie, tiebreak by returning the one that shows up first
   * in the array.
   * 
   * THIS METHOD MUST RUN IN O(n) TIME. n = nums.length
   * 
   * Once you finish, WRITE TESTS FOR IT in PracticeTest.java
   * 
   * Time Complexity: o(n)
   * Space Complexity: o(n)
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonTimeEfficient(int[] nums) {
    Map<Integer, Integer> Count = new HashMap<>();
    int countNums = 0;
     for(int count : nums){
      if( !Count.containsKey(count)){
       Count.put(count, 1);
      } else{ 
        Count.put(count,Count.get(count)+1);
      }
     } 
      for( int key : Count.keySet()){
        if(Count.get(key) > countNums){
          countNums = key;
      }
     }
    
    return countNums;
  }

  /**
   * Returns the integer that shows up most frequently in an array.
   * If there is a tie, tiebreak by returning the one that shows up first
   * in the array.
   * 
   * THIS METHOD MUST USE ONLY O(1) SPACE.
   * 
   * Once you finish, WRITE TESTS FOR IT in PracticeTest.java
   * 
   * Time Complexity: 
   * Space Complexity: 
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonSpaceEfficient(int[] nums) {
    // in O(1) space.
    int mostCommon = 0;
    int mostCommonCount = 0;
    int currentCount = 0;

    for (int i = 0; i<nums.length; i++){
      currentCount = 0;
      for (int j = 0; j<nums.length; j++) {
        currentCount++;
        }
      }
      if (mostCommonCount < currentCount) {
          mostCommonCount = currentCount;
          mostCommon = nums[i];
    }

    return mostCommon;
  }
}