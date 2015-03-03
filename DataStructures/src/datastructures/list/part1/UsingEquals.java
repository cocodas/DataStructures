package datastructures.list.part1;

/**
 * ��ü�� �񱳴� ��� �ұ�?
 * �����ϰ� ������ �� �� �����ڰ� �ִ�.
 * �ٷ� '==' �������̴�.
 * �� �����ڷ� ��ü ���� �� �� ������?
 * 
 * ����. �׷��� � ������� �񱳰� �����ұ�?
 * String �񱳿��� ����ߴ� �޼ҵ� equals() �޼ҵ尡 �ִ�.
 * 
 * �׷��� �ڷᱸ���� List�� ������ �˾ƾ� �Ǵµ� �� ��ü �񱳸� �ұ�?
 * List�� ��ü�� ���� ���� ��ü���� �ְ� List���� ���ϴ� ��ü�� ������ ����ϱ� ����
 * ���ϴ� ��ü�� ã������ �񱳸� ���� ã�� �� �ִ�. ���� �ٸ� ����� �����ϱ⵵ �Ѵ�.
 * �츮�� �����ϴ� �ܰ迡���� �񱳸� ���� ��ü�� ��� �������� �����ϴ� ���� �´�.
 * 
 * equals()�޼ҵ�� ObjectŬ�����κ��� Ȯ��Ǿ���.
 * �� equals()�޼ҵ��� Ư¡�� ����϶�.
 * 
 * 
 * @author Administrator
 *
 */
public class UsingEquals {

	public static void main(String[] args) {
		// �� ������ ��ü ��
		C1 c1 = new C1("Data Structure");
		C1 c2 = new C1("List");
		if (c1.equals(c2)) {
			System.out.println("�� ��ü�� �����ϴ�.");
		} else {
			System.out.println("�� ��ü�� ���� �ʽ��ϴ�.");
		}
		
		/*
		 * ����� ���� ���� �� ����� ��Ÿ����.
		 * �׷��� �������� ���ڸ� ���� �غ��� ���?
		 */
		
		C1 c3 = new C1("Data Structure");
		C1 c4 = new C1("Data Structure");
		
		if (c3.equals(c4)) {
			System.out.println("c3�� c4�� ���� ��ü�Դϴ�.");
		} else {
			System.out.println("c3�� c4�� �ٸ� ��ü�Դϴ�.");
		}
		
		/*
		 * c3�� c5�� ���� ��ü��� �ҷ��� ��� �ؾ��ϴ°�?
		 */
		
		C1 c5 = c3;
		if (c3.equals(c5)) {
			System.out.println("c3�� c5�� ���� ��ü�Դϴ�.");
		} else {
			System.out.println("c3�� c5�� �ٸ� ��ü�Դϴ�.");
		}
		
		/*
		 * �� �׷���?
		 * �� �̷� ����� �������� ����϶�.
		 */
		
	}

}
