
public class ForAbstract implements InterfaceA{
@Override
public void Display() {
	
System.out.println("octoberegaints");
}
@Override
	public void print() {
		
		InterfaceA.super.print();
		System.out.println("more specification");
	}

}
