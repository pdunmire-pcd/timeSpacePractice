import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient

  @Test 
  void testMostCommonTimeEfficient() {
    int[] nums1 = {1, 2, 3, 2, 4};
    assertEquals(2, Practice.mostCommonTimeEfficient(nums1));

    int[] nums2 = {5, 5, 5, 6, 6};
    assertEquals(5, Practice.mostCommonTimeEfficient(nums2));

    int[] nums3 = {7, 8, 9};
    assertEquals(7, Practice.mostCommonTimeEfficient(nums3));
  }

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls
}
