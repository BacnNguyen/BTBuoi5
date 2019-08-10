package thongtintaikhoan;

public class KhoanTienThuChi extends ThongTinKhoanTien {
	protected String lyDo;
	protected String nguoiThuHuong;
	public KhoanTienThuChi(String thoiGian, String diaDiem, String lyDo, String nguoiThuHuong) {
		super(thoiGian, diaDiem);
		this.lyDo = lyDo;
		this.nguoiThuHuong = nguoiThuHuong;
	}
	public String getLyDo() {
		return lyDo;
	}
	public String getNguoiThuHuong() {
		return nguoiThuHuong;
	}
	public void setLyDo(String lyDo) {
		this.lyDo = lyDo;
	}
	public void setNguoiThuHuong(String nguoiThuHuong) {
		this.nguoiThuHuong = nguoiThuHuong;
	}
	
	public void getThongTin() {
		System.out.println("Thoi Gian :"+ this.thoiGian);
		System.out.println("Dia diem :"+ this.diaDiem);
		System.out.println("Nguoi Thu Huong :"+ this.nguoiThuHuong);
		System.out.println("Ly do :"+ this.lyDo);
	}
}
