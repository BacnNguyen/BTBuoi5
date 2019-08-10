package thongtintaikhoan;

public class KhoanTienVayNo extends ThongTinKhoanTien{
	private int soTien;
	private String nguoiThucHien;
	private String thoiHan;
	private String ngayTra;
	private float laiSuat;
	private String lyDo;
	private boolean xacNhanTra;
	public KhoanTienVayNo(String thoiGian, String diaDiem, int soTien, String nguoiThucHien, String thoiHan,
			String ngayTra, float laiSuat, String lyDo, boolean xacNhanTra) {
		super(thoiGian, diaDiem);
		this.soTien = soTien;
		this.nguoiThucHien = nguoiThucHien;
		this.thoiHan = thoiHan;
		this.ngayTra = ngayTra;
		this.laiSuat = laiSuat;
		this.lyDo = lyDo;
		this.xacNhanTra = xacNhanTra;
	}
	public float getSoTien() {
		return soTien;
	}
	public String getNguoiThucHien() {
		return nguoiThucHien;
	}
	public String getThoiHan() {
		return thoiHan;
	}
	public String getNgayTra() {
		return ngayTra;
	}
	public float getLaiSuat() {
		return laiSuat;
	}
	public String getLyDo() {
		return lyDo;
	}
	public boolean isXacNhanTra() {
		return xacNhanTra;
	}
	public void setSoTien(int soTien) {
		this.soTien = soTien;
	}
	public void setNguoiThucHien(String nguoiThucHien) {
		this.nguoiThucHien = nguoiThucHien;
	}
	public void setThoiHan(String thoiHan) {
		this.thoiHan = thoiHan;
	}
	public void setNgayTra(String ngayTra) {
		this.ngayTra = ngayTra;
	}
	public void setLaiSuat(float laiSuat) {
		this.laiSuat = laiSuat;
	}
	public void setLyDo(String lyDo) {
		this.lyDo = lyDo;
	}
	public void setXacNhanTra(boolean xacNhanTra) {
		this.xacNhanTra = xacNhanTra;
	}
	
	
	public void getThongTin() {
		System.out.println("Thoi gian :"+this.thoiGian);
		System.out.println("Dia diem :" +this.diaDiem);
		System.out.println("Nguoi thuc hien  :"+this.nguoiThucHien);
		System.out.println("Lai suat :"+this.laiSuat);
		System.out.println("Ngay tra :"+this.ngayTra);
		System.out.println("So Tien :"+this.soTien);
		System.out.println(" Thoi han :"+this.thoiHan);
		
	}
}
