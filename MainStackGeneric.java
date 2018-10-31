
public class MainStackGeneric {

	public static void main(String[] args) {
		StackGeneric tumpuk = new StackGeneric();
		
		tumpuk.push("Sadly");tumpuk.cetak();
		tumpuk.push("Arul");tumpuk.cetak();
		tumpuk.push("Aulia");tumpuk.cetak();
		tumpuk.push("Aswad");tumpuk.cetak();
	
		tumpuk.pop();tumpuk.cetak();

	}

}
