class stringcomp
{
	String str[];
	stringcomp(String str[])
	{
		this.str=str;
	}
	public void check()
	{
		for(int j = 0; j < str.length; j++) 
		{
			for(int i = j + 1; i < str.length; i++) 
			{
				if(str[i].compareToIgnoreCase(str[j]) < 0) 
				{
                    String s = str[j];
                    str[j] = str[i];
                    str[i] = s;
				}
			}
		System.out.println(str[j]);
		}
	}
}
class compare
{
	public static void main(String args[])
	{
		String arr[]={"Nishi","kanta","ray"};
        stringcomp ac = new stringcomp(arr);
        System.out.println("before sorting");
        for(int j = 0; j < arr.length; j++) 
            System.out.println(arr[j]);
        System.out.println("After sorting");
		ac.check();
	}
}