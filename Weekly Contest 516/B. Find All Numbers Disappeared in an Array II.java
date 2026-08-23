class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper){
        List <List<Integer>> a = new ArrayList<>();
        a(nums);
        int b = lower, c = 0;
        while(c < nums.length){
            int d = nums[c];
            if(d > upper) break;
            if(d >= b && d > b) b(a, b, d-1);
            if(d >= b) b = d(d);
            c++;
        }
        if(b <= upper) b(a, b, upper);
        return a;
    }

    static void a(int[] a){
        Arrays.sort(a);
        int b = a.length;
    }

    static void b(List<List<Integer>> a, int b, int c){
        List<Integer> d = Arrays.asList(b,c);
        a.add(d);
    }

    static boolean c(int a, int b){
        if(a > b) return false;
        return true;
    }

    static int d(int a){
        int b = a+1;
        return b;
    }
}
