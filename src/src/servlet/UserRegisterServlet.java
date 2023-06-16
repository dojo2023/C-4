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
		String id = request.getParameter("ID");
		String pw = request.getParameter("PW");
		String gender = request.getParameter("GENDER");
		String latitude_and_longitude = request.getParameter("LATITUDE_AND_LONGITEDE");
		String ptempertureid = request.getParameter("PTEMPERTUREID");
		int GENDER = Integer.parseInt(gender);
		int LATITUDE_AND_LONGITUDE = Integer.parseInt(latitude_and_longitude);
		int PTEMPERTUREID = Integer.parseInt(ptempertureid);

		User urDao = new User(id, pw, GENDER, LATITUDE_AND_LONGITUDE, PTEMPERTUREID);

		// セッションスコープにIDを格納する
			HttpSession session = request.getSession();
			session.setAttribute("user_register", urDao);

			// ユーザー登録ページにフォワードする
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/user_register_check.jsp");
			dispatcher.forward(request, response);
	}

}
