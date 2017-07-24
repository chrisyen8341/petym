package com.news.model;

import java.util.List;

public class NewsTest {

	public static void main(String[] args) {
		NewsJDBCDAO dao = new NewsJDBCDAO();

		// �憓�
//		News news1 = new News();
//		news1.setEmpNo(6001);
//		news1.setNewsTitle("�����");
//		news1.setNewsContent("�摰孵��");
//		news1.setNewsDate(java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
//		dao.insert(news1);
//		System.out.println("�憓�");

		// 靽格
//		News news2 = new News();
//		news2.setEmpNo(6001);
//		news2.setNewsTitle("�����鈭�");
//		news2.setNewsContent("���摰寞鈭�");
//		news2.setNewsDate(java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
//		news2.setNewsNo(1);
//		dao.update(news2);
//		System.out.println("靽格摰");

		// ��
//		dao.delete(3);
//		System.out.println("���,蝟��");

		// �閰�
//		News news3 = dao.findByPrimaryKey(1);
//		System.out.println(news3.getNewsNo());
//		System.out.println(news3.getEmpNo());
//		System.out.println(news3.getNewsTitle());
//		System.out.println(news3.getNewsContent());
//		System.out.println(news3.getNewsDate());
//		System.out.println("�摰");

		// ���
//		List<News> newsList = dao.getAll();
//		for (News news : newsList) {
//			System.out.println(news.getNewsNo());
//			System.out.println(news.getEmpNo());
//			System.out.println(news.getNewsTitle());
//			System.out.println(news.getNewsContent());
//			System.out.println(news.getNewsDate());
//			System.out.println("===================");
//		}

	}

}