import java.util.ArrayList;

public class ArrayListObject {

	public static void main(String[] args){
	ArrayList<Mahasiswa> Data = new ArrayList<Mahasiswa>();
	Data.add(new Mahasiswa("SADLY", "D0217011", "B", ""));
	Data.add(new Mahasiswa("UDIN", "D0217512", "B", "Sepabatu"));
	Data.add(new Mahasiswa("ASWAD", "D0217012", "B", "Mamasa"));
	Data.add(new Mahasiswa("NILASARI", "D0217", "B", "Sendana"));
	Data.forEach(data ->{
	System.out.println("Nama : " + data.getNama() + ", NIM : " + data.getNim() + ", Kelas : " + data.getKelas() + ", Alamat : " + data.getAlamat());
	});

}
}