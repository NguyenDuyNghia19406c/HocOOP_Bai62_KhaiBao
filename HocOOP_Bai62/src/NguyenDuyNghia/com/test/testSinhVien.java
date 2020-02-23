package NguyenDuyNghia.com.test;

import NguyenDuyNghia.com.model.SinhVien;

public class testSinhVien {
	public static void main(String[] args) {
		SinhVien obama= new SinhVien();
		SinhVien putin=new SinhVien("Ông Putin", 8);
		
		System.out.println("Điểm Putin="+putin.getDiem());
		System.out.println("Tên Putin="+putin.getHoTen());
		
		System.out.println("Tên Obama="+obama.getHoTen());
		obama.setHoTen("Ông OBAMA");
		System.out.println("Tên Obama="+obama.getHoTen());
		System.out.println("-----------------");
		putin.xuatThongTin();
		System.out.println("---------------");
		System.out.println(putin);
	}

}
