package com.leetcode;

public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] result = new int[image.length][image[0].length];
        // flip the image
        for (int i = 0; i < image.length; i++) {
            int left = 0;
            int right = image[i].length - 1;
            while (left < right) {
                int temp = image[i][left];
                image[i][left] = image[i][right];
                image[i][right] = temp;
                left++;
                right--;
            }
        }

        // invert the image
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                result[i][j] = image[i][j] == 0 ? 1 : 0;
            }
        }

        return result;
    }
}
