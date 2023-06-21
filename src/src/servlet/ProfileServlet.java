package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.PtempertureDao;
import model.Ptemperture;
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

		//セッションスコープに保存されているユーザーIDを使って、登録されているユーザーのプロフィール情報を表示する
		//①セッションスコープ(login_user)からログインしているユーザーの内容を取り出す
		//②主キーのID(ユーザーIDではない)を使ってユーザーテーブルの情報を取り出す SQL文のSELECTを使う
		//③ユーザーテーブルの情報をリクエストスコープに入れる

		//セッションスコープの取得
		HttpSession session = request.getSession();
		//①セッションスコープからインスタンスを取得する
		User loginusers = (User)session.getAttribute("login_user");

		PtempertureDao pdao;
		pdao = new PtempertureDao();
		Ptemperture p = pdao.select(loginusers.getUSER_PTEMPERTUREID());
        loginusers.setUSER_PTEMPERTURENAME(p.getUSER_PTEMPERTURE());

		//②プロフィール情報を取ってくるDAOのメソッドを使う→プロフィール情報が入っているインスタンスが戻り値として戻ってくる
//				request.setCharacterEncoding("UTF-8");
//
//				String ID =request.getParameter("ID"); //なぜintじゃないの？
//
//				String USER_ID = request.getParameter("USER_ID");
//				String USER_PW = request.getParameter("USER_PW");
//				String USER_HOMEID = request.getParameter("USER_HOMEID");
//				String USER_GENDERID = request.getParameter("USER_GENDERID");
//				String USER_PTEMPERTUREID = request.getParameter("USER_PTEMPERTUREID");


		//③戻り値で返ってきたインスタンスをリクエストスコープに格納する
		request.setAttribute("login_user",loginusers);


		//①ができているかの確認→OK
		//System.out.println(loginusers.getID());

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
