package com.flyonsky.datastructure.base;

/**
 * @author luowengang
 * @date 2021/5/23 10:03
 */
public class RotateArray {

    public static void main(String[] args){
//        int[] nums = {1,2,3,4,5,6,7};
        int[] nums = {1,2};
        int k = 3;

//        int[] nums = {-1,-100,3,99};
//        int k = 2;

        rotate(nums,k);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }

    /**
     * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
     * 输入: nums = [1,2,3,4,5,6,7], k = 3
     * 输出: [5,6,7,1,2,3,4]
     *
     * 输入：nums = [-1,-100,3,99], k = 2
     * 输出：[3,99,-1,-100]
     * 时间复杂度O(n)，空间复杂度O(n)
     * @param nums
     * @param k
     * @return
     */
    public static void rotate(int[] nums, int k){
        if(nums != null
                && k > 0){
            int newIndex = 0;
            int[] tmpNums = new int[nums.length];
            for(int i=0;i<nums.length;i++){
                tmpNums[i] = nums[i];
            }

            for(int i = 0;i<nums.length;i++){
                newIndex = (i + k) % nums.length;
                nums[newIndex] = tmpNums[i];
            }
        }
    }
}
