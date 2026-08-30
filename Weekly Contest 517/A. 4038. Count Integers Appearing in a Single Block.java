class Solution {

    static int a(int[]b){
        int c = 0;
        int  d = 1;
        while(d < b.length){
            if(b[d] != b[d-1]){
                c++;
            }
            d++;
        }
        return c;
    }

    static boolean b(int[]c, int d){
        boolean e = false;
        boolean f = false;
        int g = 0;
        while(g < c.length){
            if(c[g] == d){
                if (!e && f) return false;
                e = true;
                f = true;
            }
            else{
                e = false;
            }
            g++;
        }
        return f;
    }

    public int countSpecialIntegers(int[] nums) {
        int a = 0;
        int b = 1;
        while(b<=100){
            if(b(nums,b))a++;
            b++;
        }
        return a;
    }
}
