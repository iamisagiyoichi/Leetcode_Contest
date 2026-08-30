class Solution {
    static long a(long b){
        long c = 0;
        while(b > 0){
            c++;
            b /= 10;
        }
        return c;
    }

    static long b(long c, long d){
        long e = 1;
        long f = 0;
        long g = c;
        while(f < d){
            e *= 10;
            f++;
        }
        return g/e;
    }

    static long c(long d, long e){
        long f = 1;
        long g = 0;
        while(g<e){
            f *= 10;
            g++;
        }
        return d%f;
    }
    
    public int sumDecoded(long[] nums) {
        long[] v = nums;
        long d = 1000000007L;
        long e = 0;
        int f = 0;
        while(f<nums.length){
            long g = v[f]%10;
            long h = v[f]/10;
            long i = a(h);
            long j = b(h,i-g);
            long k = c(h,i-g);
            long l = j%d;
            long m = k;
            long n = 1;
            while(m>0){
                if(m%2==1){
                    n = (n*l)%d;
                }
                l=(l*l)%d;
                m/=2;
            }
            e = (e+n)%d;
            f++;
        }
        return (int)e;
    }
}
