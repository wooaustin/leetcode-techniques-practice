/* MEDIUM Problem: 
There are a total of numCourses courses you have to take, labeled from 0 to numCourses-1.abstract

Some courses may have prerequisites, for exampl,e to take course 0, you have to first take course 1, which is expressed
as pair: [0, 1]

Given the total number of courses and a list of prerequisite pairs, is it possible for you to finish all courses?
*/

class Solution{
    public boolean courseSchedule(int numCourses, int[][] prerequisites){
        if(prerequisites == null){
            throw new IllegalArgumentException("Illegal input array");
        }

        int len = prerequisites.length;
        if(numCourses == 0|| len == 0){
            return true;
        }

        //All classes that had no prerequisite
        int[] pCounter = new int[numCourses];
        for(int i = 0;i<len;i++){
            pCounter[prerequisites[i][0]]++;
        }

        Queue<Integer> queue = new LinkedList();
        for(int i = 0;i<pCounter.length;i++){
            if(pCounter[i] == 0){
                queue.offer(i);
            }
        }

        int numsNoPre = queue.size();
        while(!queue.isEmpty()){
            int curr = queue.poll();
            for(int i = 0;i<len;i++){
                if(prerequisites[i][1] == curr){
                    pCounter[prerequisites[i][0]]--;
                    if(pCounter[prerequisites[i][0]] == 0){
                        numsNoPre++;
                        queue.add(prerequisites[i][0]);
                    }
                }
            }
        }

        return numCourse == numsNoPre;
    }
}