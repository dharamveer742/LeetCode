class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        long res=1;
        for(int j=0;j<rowIndex;j++){
            res=res*(rowIndex-j);
            res=res/(j+1);
            ans.add((int) res);
        }
        return ans;
        
    }
}