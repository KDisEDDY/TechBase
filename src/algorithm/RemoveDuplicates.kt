package algorithm


/**
 * LC section 80:
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使得出现次数超过两次的元素只出现两次 ，返回删除后数组的新长度。

    不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
    说明：

    为什么返回数值是整数，但输出的答案是数组呢？

    请注意，输入数组是以「引用」方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。

    你可以想象内部操作如下:

    // nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
    int len = removeDuplicates(nums);

    // 在函数里修改输入数组对于调用者是可见的。
    // 根据你的函数返回的长度, 它会打印出数组中 该长度范围内 的所有元素。
    for (int i = 0; i < len; i++) {
      print(nums[i]);
    }
    示例 1：

    输入：nums = [1,1,1,2,2,3]
    输出：5, nums = [1,1,2,2,3]
    解释：函数应返回新长度 length = 5, 并且原数组的前五个元素被修改为 1, 1, 2, 2, 3 。 不需要考虑数组中超出新长度后面的元素。

    来源：力扣（LeetCode）
    链接：https://leetcode.cn/problems/remove-duplicates-from-sorted-array-ii
    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */
class RemoveDuplicates {

    /*
      1.有序，所以会出现连续两个相同的数据，这里才可以用快慢指针来解决
      2.不用考虑超出新长度后的数组元素，这里不能重新生成新的array来装载
     */
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.size <= 2) return nums.size
        val maxRepeat = 2
        var fast = maxRepeat
        var slow = maxRepeat - 1
        while (fast < nums.size) {
            if (nums[fast] != nums[slow - maxRepeat + 1]) {
                slow ++
                nums[slow] = nums[fast]
            }
            fast++
        }
        return slow + 1
    }

}