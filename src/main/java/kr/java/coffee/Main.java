package kr.java.coffee;

import kr.java.coffee.dto.Product;

public class Main {

	public static void main(String[] args) {
		System.out.println("��ĥ�ð�");
		
		Product p1 = new Product("A001");
		Product p2 = new Product("A001");
		
		System.out.println(p1);
		System.out.println(p2);
		
		if (p1.equals(p2)) {
			System.out.println("����");
			
		}else {
			System.out.println("�ٸ�");
		}
		
	}

}
