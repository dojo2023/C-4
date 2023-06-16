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
 * Servlet implementation class ProfileServlet
 */
@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//①セッションスコープ(login_user)からログインしているユーザーの内容を取り出す
		//②主キーのID(ユーザーIDではない)を使ってユーザーテーブルの情報編集
		//③↑の内容をセッションスコープに入れる

		//セッションスコープの取得
				HttpSession session = request.getSession();
		//①
				String 変数名 = (String) session.getAttribute("Login_user");




		// プロフィールページにフォワードする
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/profile.jsp");
				dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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

		//プロフィール確認ページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/profile_check.jsp");
		dispatcher.forward(request, response);

	}

}
