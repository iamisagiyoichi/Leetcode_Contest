class Solution {
    static int a(int x){
        int y = 0;
        while(x > 1){
            x >>= 1;
            y++;
        }
        return y;
    }

    static int b(int x){
        int y = 0;
        while(x > 0){
            y++;
            x &= x - 1;
        }
        return y;
    }

    static char c(int x){
        return (char)('a'+a(x));
    }

    static String d(int x){
        StringBuilder y = new StringBuilder();
        while(x>=(1<<25)){
            y.append('z');
            x-=(1<<25);
        }
        int z = a(x);
        while(z >= 0){
            int w = 1 << z;
            if((x & w) != 0){
                y.append(c(w));
            }
            z--;
        }
        return y.toString();
    }
    
    public String[] largestString(int[] nums) {
        int[]f =nums;
        String[]a = new String[f.length];
        int b = 0;
        while(b<f.length){
            a[b] = d(f[b]);
            b++;
        }
        return a;
    }
}
