class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length ;
        int n = bsearch(l, r, nums, target);
        return n;
    }
}
public int bsearch(int l, int r, int[] arr, int k) {
    int c = (r + l) / 2;
    
    if (c == l) {
        if (k == arr[c]) {
            return c;
        } else {
            return -1;
        }
    }
    if (c == r) {
        return -1;
    }

    if (k <= arr[c]) {
        if (k == arr[c]) {
            return c;
        }
        if (k == arr[l]) {
            return l;
        }
        if (c != l || c != r) {
            return bsearch(l, c, arr, k);
        } else
            return -1;
    } else {
        if (k == arr[c]) {
            return c;
        }
        if (k == arr[r-1]) {
            return r-1;
        }
        // if (c != l || c != r) {
            return bsearch(c, r, arr, k);
        // } else
        //     return -1;
    }
}