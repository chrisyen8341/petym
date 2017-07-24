package com.userquestion.model;

import java.util.List;

public class UserQuestionTest {

	public static void main(String[] args) {
		UserQuestionJDBCDAO dao = new UserQuestionJDBCDAO();

		// // �憓�
//		 UserQuestion uq1 = new UserQuestion();
		 
//		 uq1.setFaqNo(2);
//		 uq1.setUserQCategory("�");
//		 uq1.setUserQTitle("���齒");
//		 uq1.setUserQContent("蝬脩���");
//		 dao.insert(uq1);
//		 System.out.println("�憓�");

		// // 靽格
//		 UserQuestion uq2 = new UserQuestion();
//		 uq2.setFaqNo(2);
//		 uq2.setUserQCategory("��瘝���");
//		 uq2.setUserQTitle("���停瘝���");
//		 uq2.setUserQContent("撠曹����憭�");
//		 uq2.setUserQNo(5);
//		 dao.update(uq2);
//		 System.out.println("靽格摰");

		// //��
		// dao.delete(3);
		// System.out.println("���,蝟��");

		// //�閰�
//		 UserQuestion uq3 = dao.findByPrimaryKey(1);
//		 System.out.println(uq3.getUserQNo());
//		 System.out.println(uq3.getFaqNo());
//		 System.out.println(uq3.getUserQCategory());
//		 System.out.println(uq3.getUserQTitle());
//		 System.out.println(uq3.getUserQContent());
//		 System.out.println("�摰");

		// ���
//		List<UserQuestion> uqList = dao.getAll();
//		for (UserQuestion uq : uqList) {
//			System.out.println("===================");
//			System.out.println(uq.getUserQNo());
//			System.out.println(uq.getFaqNo());
//			System.out.println(uq.getUserQCategory());
//			System.out.println(uq.getUserQTitle());
//			System.out.println(uq.getUserQContent());
//		}

	}

}