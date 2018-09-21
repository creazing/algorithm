package Dynamic;

import java.util.List;

/**
 * 题目：给定一个三角想数组，求出顶端到底层的最小路径和
 * 思路：动态规划
 * 设状态为 f(i, j) ，表示从从位置 (i,j) 出发，路径的最小和，则状态转移方程为
 * f(i, j) = min f(i + 1, j), f(i + 1, j + 1) + (i, j)
 */
public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        for (int i = triangle.size() - 2; i >= 0; --i)
            for (int j = 0; j < i + 1; ++j) {
                int old = triangle.get(i).get(j);
                triangle.get(i).set(j, old + Math.min(triangle.get(i + 1).get(j),
                        triangle.get(i + 1).get(j + 1)));
            }
        return triangle.get(0).get(0);
    }
}
