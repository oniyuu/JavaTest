package kr.co.job.jacom;

import java.util.Scanner;

public class JacomControl {
	Scanner scan = new Scanner(System.in);
	JacomDAO dao = new JacomDAO();
	
	void start() {
		boolean b = false;
		while (!b) {
			//JacomConnect connect = new JacomConnect();
			dao = new JacomDAO();
			System.out.println("----------------------MENU----------------------");
			System.out.println("1.�� ��Ϻ���      2.�� �߰��ϱ�      3.�� �����ϱ�      4.�� �����ϱ�      5.����");
			int num = Integer.parseInt(scan.next());
			

			switch (num) {
			case 1: // �۸�Ϻ���
				writingView();
				break;
			case 2: // ���߰��ϱ�
				writingAdd();
				break;
			case 3: // �ۼ����ϱ�
				writingModify();
				break;
			case 4: // �ۻ����ϱ�
				writingDelete();
				break;
			case 5: // ����
				System.out.println("����");
				b = true;
				break;
			default:
				System.out.println("�ٽ��Է����ּ���");
			}
		}
	}

	// �۸�Ϻ���
	void writingView() {
		dao = new JacomDAO();
		System.out.println("-----------�� ��Ϻ���-----------");
		System.out.println("1.��ü����     2.��������     3.��������");
		int num = Integer.parseInt(scan.next());
		
		
		switch (num) {
		case 1:
			// ��ü����
			dao.view();
			break;
		case 2:
			// ��������
			dao.sequenceView();
			break;
		case 3:
			// ��������
			dao.deleteView();
			break;
		}
	}

	// ���߰��ϱ�
	void writingAdd() {
		dao = new JacomDAO();
		System.out.println("-----------�� �߰��ϱ�-----------");
		dao.add();
	}

	// �ۼ����ϱ�
	void writingModify() {
		dao = new JacomDAO();
		System.out.println("-----------�� �����ϱ�-----------");
		dao.modify();
	}

	// �ۻ����ϱ�
	void writingDelete() {
		dao = new JacomDAO();
		System.out.println("-----------�� �����ϱ�-----------");
		dao.delete();
	}
}
