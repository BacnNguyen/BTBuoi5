package thongtintaikhoan;

import java.util.ArrayList;

public class BaoCaoThu {
	private ArrayList<KhoanTienThu > tienThu = new ArrayList<>();

	public BaoCaoThu(ArrayList<KhoanTienThu> tienThu) {
		super();
		this.tienThu = tienThu;
	}
	
	public int getTongTienThu() {
		int S = 0;
		for(int i = 0;i<tienThu.size();i++) {
			S+=tienThu.get(i).getTienThu();
		}
		return  S;
	}
}
