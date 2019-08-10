
public class Mammals {
	public Mammals(String chungLoai, String nguonGoc, String mauSac, String tenGoi, String tuoi) {
		this.chungLoai = chungLoai;
		this.nguonGoc = nguonGoc;
		this.mauSac = mauSac;
		this.tenGoi = tenGoi;
		this.tuoi = tuoi;
	}

	protected String chungLoai;
	protected String nguonGoc;
	protected String mauSac;
	protected String tenGoi;
	protected String tuoi;

	public void moTa() {
		System.out.println("Chung Loai :" + chungLoai + "\n" + "Nguon Goc : " + nguonGoc + "\n" + "Mau Sac :" + mauSac
				+ "\n" + "Ten Goi :" + tenGoi + "\n" + "Tuoi :" + tuoi);
	}

	public String getChungLoai() {
		return chungLoai;
	}

	public String getNguonGoc() {
		return nguonGoc;
	}

	public String getMauSac() {
		return mauSac;
	}

	public String getTenGoi() {
		return tenGoi;
	}

	public String getTuoi() {
		return tuoi;
	}

	public void setChungLoai(String chungLoai) {
		this.chungLoai = chungLoai;
	}

	public void setNguonGoc(String nguonGoc) {
		this.nguonGoc = nguonGoc;
	}

	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}

	public void setTenGoi(String tenGoi) {
		this.tenGoi = tenGoi;
	}

	public void setTuoi(String tuoi) {
		this.tuoi = tuoi;
	}
	
	
	

}
