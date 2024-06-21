class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<Integer>());
        }
        int[] indegree = new int[numCourses];
        for(int i=0;i<prerequisites.length;i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
            indegree[prerequisites[i][0]]=indegree[prerequisites[i][0]]+1;
        }
        
        Queue<Integer> q = new LinkedList<>();
        for(int v=0;v<numCourses;v++){
            if(indegree[v]==0){
                q.offer(v);
            }
        }
        
        int[] topo = new int[numCourses];
        int count =0;
        while(!q.isEmpty()){
            int p = q.poll();
            topo[count] = p;
            count++;
            for(int it:adj.get(p)){
                indegree[it] = indegree[it]-1;
                if(indegree[it]==0){
                    q.offer(it);
                }
            }
        }
        if(count==numCourses){
            return topo;
        }
        int [] empty = {};
        return empty;
        
    }
}

// 55