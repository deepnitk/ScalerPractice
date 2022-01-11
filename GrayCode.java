public class Solution {
	public ArrayList<Integer> grayCode(int a) {
        ArrayList<Integer> resList = new ArrayList();                                          
        resList.add(0);                                                                       
        for (int i =0;i<a;i++){                                                                          
            int curListSize= resList.size();  
            for(int  j=curListSize-1;j>=0;j--) {                                 
                resList.add(resList.get(j)+(1<<i));                                            
            }                                                                            
        }
        return resList;
	}
}
