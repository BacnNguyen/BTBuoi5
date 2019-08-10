package thongtintaikhoan;

import java.util.ArrayList;

public class BaoCaoNganQuy {
	private ArrayList<KhoanVay> khoanVay = new ArrayList<KhoanVay>();
	
	public BaoCaoNganQuy(ArrayList<KhoanVay> khoanVay) {
		super();
		this.khoanVay = khoanVay;
	}

	public void getThongTinNguoiDung() {
		for(int i =0 ;i< khoanVay.size();i++) {
			khoanVay.get(i).getNguoiThucHien();
		}
	}
	
	public void getCacKhoanVay() {
		for(int i =0;i<khoanVay.size();i++) {
			khoanVay.get(i).getThongTin();
			System.out.println("======================");
		}
	}
	
	public int getTongTienVay() {
		int S = 0 ;
		for(int i = 0;i<khoanVay.size();i++){
			S+=khoanVay.get(i).getSoTien();
		}
		return S;
	}
	
	public float getTongTienLai() {
		float S =0;
		for(int i =0;i<khoanVay.size();i++) {
			S+=khoanVay.get(i).getTienLai();
		}
		return S;
	}
}
