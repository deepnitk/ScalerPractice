public class Solution {
    public int solve(String s) {
        return boringString(s);
    }
static boolean check(String s)
{
	boolean ok = true;
	for (int i = 0; i + 1 < s.length(); ++i)
		ok &= (Math.abs(s.charAt(i) -
						s.charAt(i + 1)) != 1);
	return ok;
}

static int boringString(String s)
{
	String odd = "", even = "";
	for (int i = 0; i < s.length(); ++i)
	{
		if (s.charAt(i) % 2 == 0)
			odd += s.charAt(i);
		else
			even += s.charAt(i);
	}

	char oddArray[] = odd.toCharArray();
	Arrays.sort(oddArray);
	odd = new String(oddArray);
	
	char evenArray[] = even.toCharArray();
	Arrays.sort(evenArray);
	even = new String(evenArray);
	
	if (check(odd + even))
		return 1;
	else if (check(even + odd))
		return 1;
	return 0;
}
}
