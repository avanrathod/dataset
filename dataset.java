
public class dataset {
int i;
double d;
String s;
dataset left,right;//for huffman
public dataset()
{
	i=0;
	d=0;
	s=null;
	left=null;
	right=null;
}
boolean comparator(dataset b)//for huffman
{
	return i<=b.i;
}
}
