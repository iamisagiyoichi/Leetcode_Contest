class Solution {
    static boolean b(int[]a, int[]c){
        return (a[0]+a[1])%2==(c[0]+c[1])%2;
    }

    static boolean d(int[]a, int[]c){
        return Math.abs(a[0]-c[0]) == Math.abs(a[1]-c[1]);
    }
    
    public int minBishopMoves(int[] source, int[] target) {
        if(!b(source, target)) return -1;
        if(d(source, target)) return 1;
        return 2;
    }
}
