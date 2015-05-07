package com.sds.icto.guestbook.test;

import java.util.List;

import com.sds.icto.guestbook.dao.GuestBookDAO;
import com.sds.icto.guestbook.vo.GuestBookVO;

public class TESTGuestBookDAO {

	public static void main(String[] args) {
		try {
			//0.  deleteTest
			//testDelete();
			//testDelete2();
			//1.insert TEST
			//testInsert();
			//2.fetch TEST
			//testFetchList();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void testDelete() throws Exception{
			GuestBookDAO dao = new GuestBookDAO();
			dao.delete(9,"1234");
	}
	public static void testDelete2() throws Exception{
		GuestBookDAO dao = new GuestBookDAO();
		dao.delete();
	}
	
	public static void testFetchList() throws Exception{
		GuestBookDAO dao = new GuestBookDAO();
		List<GuestBookVO> list = dao.fetchList();
		
		for (GuestBookVO vo : list) {
			System.out.print(vo.getNo() + " : ");
			System.out.print(vo.getName()+ " : ");
			System.out.print(vo.getPassword()+ " : ");
			System.out.print(vo.getDate()+ " : ");
			System.out.print(vo.getMessage());
			System.out.print("\n");
		}
	}
	
	public static void testInsert() throws Exception{
		GuestBookVO vo = new GuestBookVO();
		vo.setName("홍길동");
		vo.setPassword("1234");
		vo.setMessage("내용내용333");
		
		GuestBookDAO dao = new GuestBookDAO();
		dao.insert(vo);
	}

}
