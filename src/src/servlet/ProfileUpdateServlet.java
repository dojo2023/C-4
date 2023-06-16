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
import model.Result;
import model.User;

/**
 * Servlet implementation class ProfileUpdateServlet
 */
@WebServlet("/ProfileUpdateServlet")
public class ProfileUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//プロフィール確認ページにフォワードする
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/profile_check.jsp");
				dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// メインサーブレットにリダイレクトする
		//		response.sendRedirect("/hello/MainServlet");

		// リクエストパラメータを取得する
				request.setCharacterEncoding("UTF-8");
				String ID = request.getParameter("ID");
				String PW = request.getParameter("PW");
				String LATITUDE_AND_LONGITUDE = request.getParameter("LATITUDE_AND_LONGITUDE");
				String gender= request.getParameter("gender");
				String PTEMPERTUREID = request.getParameter("PTEMPERTUREID");
				int latitude_and_longitude = Integer.parseInt(LATITUDE_AND_LONGITUDE);
				int GENDER = Integer.parseInt(gender);
				int ptemperture = Integer.parseInt(PTEMPERTUREID);

		//puDaoに一つのまとまりとして入れる
				User puDao = new User(ID,PW,latitude_and_longitude,GENDER,ptemperture);

		//セッションスコープにIDを格納する
				HttpSession session = request.getSession();
				session.setAttribute("profile_update", puDao);

		// 更新または削除を行う
				UsersDao uDao = new UsersDao();
				if (request.getParameter("SUBMIT").equals("確定")) {
					if (uDao.update(new User(ID,PW,latitude_and_longitude,GENDER,ptemperture))) {	// 更新成功
						request.setAttribute("result",
						new Result("更新成功！", "レコードを更新しました。", "/hello/MainServlet"));
					}
					else {												// 更新失敗
						request.setAttribute("result",
						new Result("更新失敗！", "レコードを更新できませんでした。", "/hello/MainServlet"));
					}
				}

				//プロフィール確認ページにフォワードする
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/profile_check.jsp");
				dispatcher.forward(request, response);
	}


	}


