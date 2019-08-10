
public class Dogs extends Mammals{
	private float khaNangDanhHoi;

	
	public Dogs(String chungLoai, String nguonGoc, String mauSac, String tenGoi, String tuoi, float khaNangDanhHoi) {
		super(chungLoai, nguonGoc, mauSac, tenGoi, tuoi);
		this.khaNangDanhHoi = khaNangDanhHoi;
	}

	public void sua() {
		System.out.println("Gâu gâu....");
	}
	
	public void coiNha() {
		System.out.println("Biet coi nha.");
	}
	
	public boolean soSanhKhaNangDanhHoi(Dogs dog) {
		if(this.khaNangDanhHoi>dog.khaNangDanhHoi) return true;
		else return false;
	}
}
