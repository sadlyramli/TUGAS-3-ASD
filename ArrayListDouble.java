import java.util.ArrayList;

public class ArrayListDouble {

	public static void main(String[] args) {
	ArrayList<Double> TinggiBadan = new ArrayList<Double>();
	TinggiBadan.add(160.20);
	TinggiBadan.add(158.26);
	TinggiBadan.add(155.00);
	TinggiBadan.add(163.40);
	TinggiBadan.add(157.43);
	System.out.println("Apakah ArrayList Kosong : " + TinggiBadan.isEmpty());
	System.out.println("Tinggi Badan : " + TinggiBadan);
	System.out.println("Berapa Jumlah Data : " + TinggiBadan.size());
	TinggiBadan.remove(3);
	System.out.println("Tinggi Badan : " + TinggiBadan);
	}

}
