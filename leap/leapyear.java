package leap;

public class leapyear {
public boolean isLeap(int year)
{
	boolean result=ismultipleof4(year)&&isnotmultipleof100(year);
	return result;
}
public boolean ismultipleof4(int year)
{
	return ismultipleof(year,4);
}
public boolean ismultipleof(int n,int base)
{
	return ((n%base)==0);
}
public boolean isnotmultipleof100(int year)
{
	return !ismultipleof(year,100);
}
}
