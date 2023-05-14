import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void minPathSumTest1() {
        int[][] grid = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 11}
        };
        Assert.assertEquals(7, new Solution().minPathSum(grid));
    }
    @Test
    public void minPathSumTest2() {
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6}
        };
        Assert.assertEquals(12, new Solution().minPathSum(grid));
    }
}
