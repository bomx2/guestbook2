package com.sds.icto.guestbook.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sds.icto.guestbook.dao.GuestBookDAO;
import com.sds.icto.guestbook.vo.GuestBookVO;
import com.sds.icto.web.Action;

public class DeleteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException,
			IOException {
		GuestBookVO vo = new GuestBookVO();
		GuestBookDAO dao = new GuestBookDAO();

		int no = Integer.parseInt(request.getParameter("no"));
		String password = request.getParameter("password");
		
		vo.setNo(no);
		vo.setPassword(password);
		
		if(password.equals(vo.getPassword())){
			dao.delete(no,password);
		}

		response.sendRedirect("/Guestbook2/gb");
	}

}
