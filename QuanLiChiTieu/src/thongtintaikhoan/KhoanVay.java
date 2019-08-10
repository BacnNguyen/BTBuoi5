package thongtintaikhoan;

public class KhoanVay extends KhoanTienVayNo{

	public KhoanVay(String thoiGian, String diaDiem, int soTien, String nguoiThucHien, String thoiHan, String ngayTra,
			float laiSuat, String lyDo, boolean xacNhanTra) {
		super(thoiGian, diaDiem, soTien, nguoiThucHien, thoiHan, ngayTra, laiSuat, lyDo, xacNhanTra);
		// TODO Auto-generated constructor stub
	}
	
	public float getTienLai() {
		return this.getLaiSuat()*this.getSoTien();
	}

}
