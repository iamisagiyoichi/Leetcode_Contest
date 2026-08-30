class Solution {
    static int[]a(int b, int c){
        int[] d = new int[c+20];
        int e = 0;
        int f = b;
        while(f<=c){
            d[e++] = f;
            f *= 2;
        }
        f = b/2;
        while(f>0){
            d[e++] = f;
            f/=2;
        }
        int[] g = new int[e];
        int h = 0;
        while(h < e){
            g[h] = d[h];
            h++;
        }
        return g;
    }

    static int b(int c, int d){
        if(c == d)return 0;
        if(c > d){
            int e = 0;
            while(c>d){
                c/=2;
                e++;
            }
            return c==d?e:(int)1e6;
        }
        int e = 0;
        while(c<d){
            c*=2;
            e++;
        }
        return c==d?e:(int)1e6;
    }

    static int c(int[] d, int e, int f){
        int[] g = new int[f+1];
        int h = 0;
        while(h<=f){
            g[h] = (int)1e6;
            h++;
        }
        g[0] = 0;
        int i = 0;
        while(i < d.length){
            int[] j = a(d[i],f);
            int k = j.length;
            int[] l = new int[f+1];
            int m = 0;
            while(m <= f){
                l[m] = g[m];
                m++;
            }
            int n = 0;
            while(n < k){
                int o = j[n];
                int p = b(d[i], o);
                int q = f;
                while(q >= o && p < (int)1e6){
                    if(g[q-o] < (int)1e6){
                        l[q] = Math.min(l[q],g[q-o]+p);
                    }
                    q--;
                }
                n++;
            }
            g = l;
            i++;
        }
        return g[e];
    }
    
    public int minOperations(int[] nums, int sum) {
        int[] m = nums;
        int a = c(m,sum,sum);
        if(a>=(int)1e6){
            return -1;
        }
        return a;
    }
}
