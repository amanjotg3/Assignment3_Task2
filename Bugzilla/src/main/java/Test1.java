
public class Test1 implements Subtraction
{
public long subtract(long...ls)
{
	long result=ls[0];
	for
	(int i=1; i<ls.length;i++) {
		result=ls[i];
	}
	return result;
}
}
