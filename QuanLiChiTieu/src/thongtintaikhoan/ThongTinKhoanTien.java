package thongtintaikhoan;

public class ThongTinKhoanTien {
	protected String thoiGian;
	protected String diaDiem;
	public ThongTinKhoanTien(String thoiGian, String diaDiem) {
		super();
		this.thoiGian = thoiGian;
		this.diaDiem = diaDiem;
	}
	public String getThoiGian() {
		return thoiGian;
	}
	public String getDiaDiem() {
		return diaDiem;
	}
	public void setThoiGian(String thoiGian) {
		this.thoiGian = thoiGian;
	}
	public void setDiaDiem(String diaDiem) {
		this.diaDiem = diaDiem;
	}
}
