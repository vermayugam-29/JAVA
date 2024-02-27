import java.util.Scanner;

public class LargestHistogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
}


/*Brute force approach--------------------------------------------------------------------
public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            // Consider each bar as the starting point of a potential rectangle
            int minHeight = Integer.MAX_VALUE;

            for (int j = i; j < n; j++) {
                // Find the minimum height in the current range
                minHeight = Math.min(minHeight, heights[j]);

                // Calculate the area of the rectangle using the current height
                int width = j - i + 1;
                int area = minHeight * width;

                // Update the maximum area if needed
                maxArea = Math.max(maxArea, area);
            }
        }

        return maxArea;
    }

 */
