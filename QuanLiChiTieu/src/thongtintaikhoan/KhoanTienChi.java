package thongtintaikhoan;

public class KhoanTienChi extends KhoanTienThuChi{
	private float tienChi;

	public KhoanTienChi(String thoiGian, String diaDiem, String lyDo, String nguoiThuHuong, float tienChi) {
		super(thoiGian, diaDiem, lyDo, nguoiThuHuong);
		this.tienChi = tienChi;
	}

	public float getTienChi() {
		return tienChi;
	}

	public void setTienChi(float tienChi) {
		this.tienChi = tienChi;
	};
	
	@Override
	public void getThongTin() {
		// TODO Auto-generated method stub
		super.getThongTin();
		System.out.println("So tien chi:"+this.tienChi);
	}
	
}
