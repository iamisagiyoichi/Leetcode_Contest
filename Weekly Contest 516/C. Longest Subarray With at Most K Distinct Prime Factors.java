class Solution {
    public int longestSubarray(int[] nums, int k) {
        int[] a = new int[100001];
        int[] b = new int[100001];
        a(a);
        int c = 0, d = 0 , e = 0, f = 0;
        while(e < nums.length){
            c += c(nums[e], a, b, 1);
            while(d <= e && e(c, k)){
                c -= c(nums[d], a, b, -1);
                d++;
            }
            f = d(e, e-d+1);
            e++;
        }
        return f;
    }

    static void a(int[] a){
        int b = 2;
        while(b < a.length){
            if(a[b] == 0){
                a[b] = b;
                int c = b + b;
                while(c < a.length){
                    if(a[c] == 0) a[c] = b;
                    c += b;
                }
            }
            b++;
        }
    }

    static int b(int a, int[] b){
        return b[a];
    }

    static int c(int a, int[] b, int[] c, int d){
        int e = 0;
        while(a > 1){
            int f = b(a,b);
            if(d == 1 && c[f] == 0) e++;
            c[f] += d;
            if(d == -1 && c[f] == 0) e--;
            while(a % f == 0) a /= f;
        }
        return e;
    }

    static int d(int a, int b){
        return Math.max(a, b);
    }

    static boolean e(int a, int b){
        return a > b;
    }
}
