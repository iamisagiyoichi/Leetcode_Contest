class Solution {

    static int a(int x, int y){
        while(y != 0){
            int z = x % y;
            x = y;
            y = z;
        }
        return x;
    }

    static int b(int[]x){
        int n = x.length;
        if(n<2)return 0;
        int[]y = new int[n];
        int[]z = new int[n];
        y[0] = x[0];
        int i = 1;
        while(i < n){
            y[i] = a(y[i-1], x[i]);
            i++;
        }
        z[n-1] = x[n-1];
        i = n-2;
        while(i>=0){
            z[i] = a(z[i+1], x[i]);
            i--;
        }
        int  r = 0;
        i = 0;
        while(i<n-1){
            if(y[i] == z[i+1]){
                r++;
            }
            i++;
        }
        return r;
    }

    static int c(int[]x, int k){
        int n = x.length;
        int[]y = new int[n-1];
        int i = 0;
        int j = 0;
        while(i<n){
            if(i!=k){
                y[j++]=x[i];
            }
            i++;
        }
        return b(y);
    }
    
    public int maxValidSplits(int[] nums) {
        int[]v = nums;
        int r = b(v);
        int  i =0;
        while(i<v.length){
            r = Math.max(r,c(v,i));
            i++;
        }
        return r;
        
    }
}
