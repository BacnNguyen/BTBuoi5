package thongtintaikhoan;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<KhoanTienChi> khoanChi = new ArrayList<>();
		ArrayList<KhoanTienThu> khoanThu = new ArrayList<>();
		ArrayList< KhoanVay> khoanVay = new  ArrayList<>();
		ArrayList<KhoanNo> khoanNo = new ArrayList<>();
		BaoCaoChi baoCaoChi = new BaoCaoChi(khoanChi);
		BaoCaoThu baoCaoThu = new BaoCaoThu(khoanThu);
		BaoCaoNganQuy baoCaoVay = new BaoCaoNganQuy(khoanVay);
		BaoCaoNo baoCaoNo = new BaoCaoNo(khoanNo);
		
		// khoan chi
		/*
		 * KhoanTienChi chi = new KhoanTienChi("20/03/2016", "Lop LAND1602E",
		 * "Mua Do Sinh Nhat Cac Ban Thang 3", "Lop LAND1602E", 300000); KhoanTienChi
		 * chi1 = new KhoanTienChi("21/03/2016", "Cty FPT", "An trua", "Quan an",
		 * 35000); KhoanTienChi chi2 = new KhoanTienChi("21/03/2016", "Cafe Pho",
		 * "Uong Cafe Capuchino", "Cafe Cong", 45000); khoanChi.add(chi);
		 * khoanChi.add(chi1); khoanChi.add(chi2);
		 * System.out.println("Tong tien chi :"+baoCaoChi.getTongChiTieu()+
		 * "\n================"); baoCaoChi.thongTinCacKhoanChi();
		 */
		
		//khoan thu 
		/*
		 * KhoanTienThu thu = new KhoanTienThu("19/09/2016", "Cty FPT", "Luong Thang 3",
		 * "Toi", 5000000); KhoanTienThu thu1 = new KhoanTienThu("20/03/2016",
		 * "Nha rieng", "Tien Phi Nha Tro Anh Nam", "Toi", 2500000); khoanThu.add(thu);
		 * khoanThu.add(thu1); System.out.print("Tong tien thu :");
		 * System.out.println(baoCaoThu.getTongTienThu());
		 */
		
		
		//khoan vay
		/*
		 * KhoanVay vay = new KhoanVay("12/03/2016", "Nha rieng", 1000000, "Chi Hong",
		 * "7 ngay", "12/03/2016", 0, "Vay mua tu lanh", false); KhoanVay vay1 = new
		 * KhoanVay("15/03/2016", "Nha rieng", 10000000, "Anh Hoang", "30 ngay",
		 * "15/04/2016", 2000, "Vay mua dat", false); khoanVay.add(vay);
		 * khoanVay.add(vay1); baoCaoVay.getCacKhoanVay();
		 */
		
		
		//khoan no
		
		KhoanNo no = new KhoanNo("18/03/2016", "Ngan hang", 10000000, "Toi", "60 ngay", "18/05/2016", 1000, "Vay mua may giat", false);
		KhoanNo no1 = new KhoanNo("19/03/2016", "MediaMart", 8000000, "Toi", "60 ngay", "19/05/2016", 0, "Vay mua dien thoai", false);
		khoanNo.add(no);
		khoanNo.add(no1);
		System.out.println("Tong tien no :"+baoCaoNo.getTongTienNo());
	}
}
