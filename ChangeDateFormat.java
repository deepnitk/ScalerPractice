// Convert the date string to the format YYYY-MM-DD, where:

public class Solution {
    public String solve(String A) {
        StringBuilder str = new StringBuilder();
        HashMap<String, String> monthMap = new HashMap<String, String>();
        monthMap.put("Jan","01");
        monthMap.put("Feb","02");
        monthMap.put("Mar","03");
        monthMap.put("Apr","04");
        monthMap.put("May","05");
        monthMap.put("Jun","06");
        monthMap.put("Jul","07");
        monthMap.put("Aug","08");
        monthMap.put("Sep","09");
        monthMap.put("Oct","10");
        monthMap.put("Nov","11");
        monthMap.put("Dec","12");
        
        HashMap<String, String> dayMap = new HashMap<String, String>();
        dayMap.put("1","01");
        dayMap.put("2","02");
        dayMap.put("3","03");
        dayMap.put("4","04");
        dayMap.put("5","05");
        dayMap.put("6","06");
        dayMap.put("7","07");
        dayMap.put("8","08");
        dayMap.put("9","09");

        String[] split = A.split("\\s+");
        String day = split[0];
        StringBuilder num = new StringBuilder();
        for(int i=0; i<=day.length()-3;i++){
            num.append(day.charAt(i));
        }
        String refectoredNum;
        if(dayMap.containsKey(num.toString())){
            refectoredNum = dayMap.get(num.toString());
        }
        else{
            refectoredNum = num.toString();
        }
        String month = monthMap.get(split[1]);
        String year = split[2];
        str.append(year);
        str.append("-");
        str.append(month);
        str.append("-");
        str.append(refectoredNum);
        
        return str.toString();
        
    }
}
