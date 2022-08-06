package JavaProgram;



public class ParametrizedConstructor
{
	ParametrizedConstructor()
{
	System.out.println("this is a default constructor");
}
	ParametrizedConstructor(int a,int b)
{
	System.out.println("constructor with two parameterised");
}
	ParametrizedConstructor(int c,int d,int e)
{
	System.out.println("constructor with three parameters");
}
	ParametrizedConstructor(int i,String name)
{
	System.out.println("constructor with int and string parameter");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParametrizedConstructor ob1=new ParametrizedConstructor();
		ParametrizedConstructor ob2=new ParametrizedConstructor(1,2);
		ParametrizedConstructor ob3=new ParametrizedConstructor(1,2,3);
		ParametrizedConstructor ob4=new ParametrizedConstructor(5,"Neha");
		

	}

}


