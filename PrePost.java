class PrePost
{
	public static void main(String[] args) {
		// int a=3;
		// int b=a++;
		// int c=a++;
		// System.out.println(a++ + b++ + c++ +a +b++ + c++);
		// int a=3;
		// int b=5;
		// int c=a++;
		// int d=++a;
		// System.out.println(a++ + b++ + c++ +a +b++ + ++a);
		int a= 65;
		int b= 56;
		int c = a++;
		int d = ++b;
		int e = a++;
		System.out.println(a++ + ++b + ++c + ++b);
	}
}