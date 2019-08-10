
public class Cats extends Mammals{
	private float khaNangNhinTrongDemToi;

	
	public Cats(String chungLoai, String nguonGoc, String mauSac, String tenGoi, String tuoi,
			float khaNangNhinTrongDemToi) {
		super(chungLoai, nguonGoc, mauSac, tenGoi, tuoi);
		this.khaNangNhinTrongDemToi = khaNangNhinTrongDemToi;
	}

	public void keu() {
		System.out.println("Meo meo!");
	}
	
	public void setKhaNangNhinTrongDemToi(float khaNangNhinTrongDemToi) {
		this.khaNangNhinTrongDemToi = khaNangNhinTrongDemToi;
	}

	public void batChuot() {
		System.out.println("Co the bat chuot!");
	}
	
	public boolean soSanhBatChuot(Cats cat) {
		if(this.khaNangNhinTrongDemToi > cat.khaNangNhinTrongDemToi) return true;
		else return false;
	}

	public float getKhaNangNhinTrongDemToi() {
		return khaNangNhinTrongDemToi;
	}
}
