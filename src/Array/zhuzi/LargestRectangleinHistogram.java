package Array.zhuzi;

/**
 * 问题：给定不同高度的柱子，可以构成矩形的最大面积
 * 思路1；依次计算出不同柱子为首尾的矩形的面积，计算的时候用最小高度乘以宽度
 * 思路2：对每个柱子左右遍历到所有大于等于该柱子的首位，计算面积
 *
 */
public class LargestRectangleinHistogram {
    /**
     * @param heights 柱子的高度
     * @return 面积
     *思路1的实现
     */
    public int largestRectangleArea1(int[] heights) {
        int len=heights.length;
        int max_size=0;
        for(int i=0;i<len;i++)
        {
            int min_height=heights[i];//最小高度
            int current_size=min_height;//当前最大面积
            for(int j=i;j<len;j++)
            {
                if(heights[j]<min_height) min_height=heights[j];
                current_size=min_height*(j-i+1);
                if(current_size>max_size) max_size=current_size;
            }
        }

        return max_size;
    }
}
