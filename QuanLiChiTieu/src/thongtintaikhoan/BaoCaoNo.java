package thongtintaikhoan;

import java.util.ArrayList;

public class BaoCaoNo {
	private ArrayList<KhoanNo > khoanNo = new ArrayList<KhoanNo>();

	public BaoCaoNo(ArrayList<KhoanNo> khoanNo) {
		super();
		this.khoanNo = khoanNo;
	}
	
	public int getTongTienNo () {
		int S =0 ;
		for(int i =0;i< khoanNo.size();i++) {
			S+=khoanNo.get(i).getSoTien();
		}
		return S;
	}
}
