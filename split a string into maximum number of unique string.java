class Solution {
    public int maxUniqueSplit(String s) {
        return backtrack(0,s,new HashSet<>());
    }
    public int backtrack(int st,String s,HashSet<String>seen){
        if(st==s.length()){
            return 0;
        }
        int max=0;
        for(int end=st+1;end<=s.length();end++){
            String sub=s.substring(st,end);
            if(!seen.contains(sub)){
                seen.add(sub);
                max=Math.max(max,1+backtrack(end,s,seen));
                seen.remove(sub);
            }
        }
        return max;
    }
} 