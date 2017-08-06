public class Solution {
    List<String> list=new ArrayList<String>();
    public List<String> generateParenthesis(int n) {
    helper(n,0,0,new StringBuilder());       // use Stringbuilder
        return list;
    }
    public void helper(int size,int open,int close,StringBuilder s)
    {
        if(s.length()==2*size)//use function call instead of 2 IFs
            list.add(s.toString());
        if(open<size)
        {
            s.append("(");
            helper(size,open+1,close,s);
            s.deleteCharAt(s.length()-1);
        }
        if(close<open)
        {
             s.append(")");
            helper(size,open,close+1,s);
            s.deleteCharAt(s.length()-1);
        }
    }
}
