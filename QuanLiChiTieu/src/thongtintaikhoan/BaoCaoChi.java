package thongtintaikhoan;

import java.util.ArrayList;

public class BaoCaoChi {
	private ArrayList<KhoanTienChi> chiTieu = new ArrayList<>();

	public BaoCaoChi(ArrayList<KhoanTienChi> chiTieu) {
		super();
		this.chiTieu = chiTieu;
	}
	 
	
	public void thongTinNguoiDung() {
		for(int i =0;i<chiTieu.size();i++) {
			System.out.print ("Thong Tin Nguoi Dung : ");
			System.out.println(chiTieu.get(i).getNguoiThuHuong());
		}
	}
	
	public void thongTinCacKhoanChi() {
		for(int i = 0;i< chiTieu.size();i++) {
			chiTieu.get(i).getThongTin();
			System.out.println("=====================");
		}
	}
	
	public int getTongChiTieu() {
		int S = 0;
		for(int i = 0;i<chiTieu.size();i++) {
			S+=chiTieu.get(i).getTienChi();
		}
		return S;
	}
}
