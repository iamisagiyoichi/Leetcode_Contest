class Solution {
    public boolean isPalindromic(String s) {
        String a = a(s);
        String b = b(a);
        return c(a,b);
    }

    static String a(String a){
        StringBuilder b = new StringBuilder();
        for(char c : a.toCharArray()){
            int d = c;
            for(int e = 7; e >= 0; e--){
                b.append((d >> e) & 1);
            }
        }
        return b.toString();
    }

    static String b(String a){
        return new StringBuilder(a).reverse().toString();
    }

    static boolean c(String a, String b){
        return a.equals(b);
    }
}
