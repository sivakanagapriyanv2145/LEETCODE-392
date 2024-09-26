class Solution {
    public boolean isSubsequence(String s, String t) {
        int i,a=0,b=0;
        boolean flag=false;
        while(a<s.length() && b<t.length() )//We use the seprate a and b because for the increment process
        {
            if(s.charAt(a)==t.charAt(b)){
                a++;
                
            }
            b++;
        }
        if(a==s.length()){
            flag=true;
        }
    return(flag);
        
    }
}
