package thongtintaikhoan;

public class KhoanTienThu extends KhoanTienThuChi{
	private float tienThu;

	public KhoanTienThu(String thoiGian, String diaDiem, String lyDo, String nguoiThuHuong, float tienThu) {
		super(thoiGian, diaDiem, lyDo, nguoiThuHuong);
		this.tienThu = tienThu;
	}

	public float getTienThu() {
		return tienThu;
	}

	public void setTienThu(float tienThu) {
		this.tienThu = tienThu;
	}
	
	@Override
	public void getThongTin() {
		// TODO Auto-generated method stub
		super.getThongTin();
		System.out.println("So tien thu :"+this.tienThu);
	}
}
