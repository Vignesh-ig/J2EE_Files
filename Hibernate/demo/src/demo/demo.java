package demo;

public sealed class demo  permits a,b{

}

final class a extends demo {
	
}

non-sealed class b extends demo{
	
}

//final class c extends demo{
//	
//} 
