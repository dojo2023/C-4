package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UsersDao;
import model.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ログインページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// リクエストパラメータを取得する
				request.setCharacterEncoding("UTF-8");
				String user_id = request.getParameter("ID");
				String pw = request.getParameter("PW");

				// ログイン処理を行う
				UsersDao uDao = new UsersDao();
				if (uDao.isLoginOK(new User(user_id, pw))) {	// ログイン成功

					// セッションスコープにIDを格納する
				   User Login_user = uDao.selectUSER_ID(user_id);


					HttpSession session = request.getSession();
					session.setAttribute("login_user", Login_user);

					// メインサーブレットにリダイレクトする
					response.sendRedirect("/hello/WeatherInformationGetServlet");
				}
				else {									// ログイン失敗
					// リクエストスコープに、タイトル、メッセージ、戻り先を格納する
					//request.setAttribute("result",
					//new Result("ログイン失敗！", "IDまたはPWに間違いがあります。", "/hello/LoginServlet"));

					// 結果ページにフォワードする
					RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
					dispatcher.forward(request, response);
				}





	}

}
