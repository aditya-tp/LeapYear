package leap;

public class leapyear {
public boolean isLeap(int year)
{
	boolean result=ismultipleof4(year)&&isnotmultipleof100_or_ismultipleof100and400(year);
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
public boolean isnotmultipleof100_or_ismultipleof100and400(int year)
{
	return isnotmultipleof100(year) || ismultipleof100and400(year);
}
public boolean ismultipleof100and400(int year)
{
	return ismultipleof(year,100) && ismultipleof(year,400);
}
}
