package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsersDao;
import model.Result;
import model.User;

/**
 * Servlet implementation class UserRegisterDisplayServlet
 */
@WebServlet("/UserRegisterDisplayServlet")
public class UserRegisterDisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 服登録ページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/user_register_check.jsp");
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

		// 登録処理を行う
		UsersDao uDao = new UsersDao();
		if (uDao.insert(new User(id, pw, GENDER, LATITUDE_AND_LONGITUDE, PTEMPERTUREID))) {	// 登録成功
			request.setAttribute("result",
			new Result("登録成功！", "レコードを登録しました。", "/simpleBC/MenuServlet"));
		}
		else {												// 登録失敗
			request.setAttribute("result",
			new Result("登録失敗！", "レコードを登録できませんでした。", "/simpleBC/MenuServlet"));
		}
	}

}
