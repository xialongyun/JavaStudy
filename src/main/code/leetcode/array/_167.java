package main.code.leetcode.array;

public class _167 {
    /**
     *
     * */
    public int[] twoSum1(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; ++i) {
            int low = i + 1, high = numbers.length - 1;
            while (low <= high) {
                int mid = (high - low) / 2 + low;
                if (numbers[mid] == target - numbers[i]) {
                    return new int[]{i + 1, mid + 1};
                } else if (numbers[mid] > target - numbers[i]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return new int[]{-1, -1};
    }
    /**
     *
     * */
    public int[] twoSum2(int[] numbers, int target) {
        int length = numbers.length;
        for(int left = 0; left < length - 1; left++) {
            int targetRight = target - numbers[left];
            int right = search(numbers, targetRight, left + 1, length - 1);
            if(right != -1) {
                return new int[]{left + 1, right + 1};
            }
        }
        return new int[]{-1, -1};
    }

    public int search(int[] numbers, int targetRight, int left, int right) {
        while(left <= right) {
            int middle = left + (right - left) / 2;
            if(numbers[middle] == targetRight) {
                return middle;
            }
            if(numbers[middle] < targetRight) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

    /**
     *
     * */
    public int[] twoSum3(int[] numbers, int target) {
        int length = numbers.length;
        int left = 0, right = length - 1;
        while(left < right) {
            if(numbers[left] + numbers[right] == target) {
                return new int[]{left + 1, right + 1};
            }
            if(numbers[left] + numbers[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }
    /**
     *
     * */
    public int[] twoSum4(int[] numbers, int target) {
        int length = numbers.length;
        int left = 0, right = 1;
        int[] result = new int[2];
        while(left < length - 1) {
            for(right = left + 1; right < length; right++) {
                if(numbers[left] + numbers[right] == target) {
                    result[0] = left + 1;
                    result[1] = right + 1;
                    return result;
                }
            }
            left++;
        }
        return result;
    }
}
