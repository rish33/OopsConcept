package functionOverloading;

public class TypePromotion_ambiguous {
	void sum(int a,long b){System.out.println("int a, long b");}  
	void sum(long a,int b){System.out.println("long a, int b");}  
}
