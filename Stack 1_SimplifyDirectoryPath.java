public class Solution {
    public String simplifyPath(String path) {
        
        // tokenize the path i.e. remove all "/"
        String[] tokens = path.split("/+");
        Stack<String> st = new Stack<String>();
        
        //push dir name(e.g. a,b,c) in stack. pop in case we encounter ".." and continue in case "."
        for(String t: tokens){
            if(!st.isEmpty() && "..".equals(t)) st.pop();
            else if(!Arrays.asList(".","","..").contains(t)) st.push(t);
            
        }

        return "/" + String.join("/", st); 

    }
}
