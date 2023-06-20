package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;

/**
 * Servlet implementation class UserRegisterServlet
 */
@WebServlet("/UserRegisterServlet")
public class UserRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// リクエストパラメータを取得する
		request.setCharacterEncoding("UTF-8");
//		String USER_ID= request.getParameter("user_id");
//		String USER_PW = request.getParameter("user_pw");
		String genderid = request.getParameter("user_genderid");
		String homeid = request.getParameter("user_homeid");
		String ptempetureid = request.getParameter("user_ptempertureid");
		int USER_GENDERID = Integer.parseInt(genderid);
		int USER_HOMEID = Integer.parseInt(homeid);
		int USER_PTEMPERTUREID = Integer.parseInt(ptempetureid);



		// ユーザー登録ページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/user_register.jsp");
		dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// リクエストパラメータを取得する
		request.setCharacterEncoding("UTF-8");
		String USER_ID= request.getParameter("user_id");
		String USER_PW = request.getParameter("user_pw");
		String genderid = request.getParameter("user_genderid");
		String homeid = request.getParameter("user_homeid");
		String ptempetureid = request.getParameter("user_ptempertureid");
		int USER_GENDERID = Integer.parseInt(genderid);
		int USER_HOMEID = Integer.parseInt(homeid);
		int USER_PTEMPERTUREID = Integer.parseInt(ptempetureid);

		User urDao = new User(USER_ID, USER_PW, USER_HOMEID, USER_GENDERID,USER_PTEMPERTUREID);

		// セッションスコープにurDaoを格納する
			HttpSession session = request.getSession();
			session.setAttribute("user_register", urDao);

			// ユーザー登録確認ページにフォワードする
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/user_register_check.jsp");
			dispatcher.forward(request, response);
	}

}
