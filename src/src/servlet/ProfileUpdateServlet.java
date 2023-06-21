package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Latitude_and_longitudeDao;
import dao.PtempertureDao;
import dao.UsersDao;
import model.Latitudes_and_longitudes;
import model.Ptemperture;
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

		//セッションスコープの取得
				HttpSession session = request.getSession();
		//①セッションスコープからインスタンスを取得する
				User loginusers = (User)session.getAttribute("login_user");

		//③戻り値で返ってきたインスタンスをリクエストスコープに格納する
				request.setAttribute("login_user",loginusers);

		//都道府県のDaoと結び付け
				Latitude_and_longitudeDao dao;
				dao = new Latitude_and_longitudeDao();
				List<Latitudes_and_longitudes> list = dao.select(null);
				request.setAttribute("list",list);

		//暑がり寒がりのDaoと結び付け
				PtempertureDao dao2;
				dao2 = new PtempertureDao();
    		    List<Ptemperture> list2 = dao2.select(null);
			    request.setAttribute("list2",list2);

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
				request.setCharacterEncoding("UTF-8"); //文字化けしないようにしている
				String USER_ID= request.getParameter("ID");//()の中にはjspのnameを入れる
				String USER_PW = request.getParameter("PW");
				String genderid = request.getParameter("gender");
				String homeid = request.getParameter("USER_HOMEID");
				String ptempetureid = request.getParameter("PTEMPERTUREID");
				int USER_GENDERID = Integer.parseInt(genderid);
				int USER_HOMEID = Integer.parseInt(homeid);
				int USER_PTEMPERTUREID = Integer.parseInt(ptempetureid);



		//セッションの中身をとりだす
				HttpSession session = request.getSession();
				User LOGINUSER = (User)session.getAttribute("login_user");

	            User NEWUSER = new User(LOGINUSER.getID(),USER_ID,USER_PW,USER_HOMEID,USER_GENDERID,USER_PTEMPERTUREID);


		// 更新または削除を行う
				UsersDao uDao = new UsersDao();
				if (request.getParameter("ProfileChange_").equals("確定")) {
					if (uDao.update(NEWUSER)) {	// 更新成功
//						request.setAttribute("result",
//						new Result("更新成功！", "レコードを更新しました。", "/hello/MainServlet"));
//					}
//					else {												// 更新失敗
//						request.setAttribute("result",
//						new Result("更新失敗！", "レコードを更新できませんでした。", "/hello/MainServlet"));
					}
				}

//				User pu = new User(USER_ID, USER_PW,USER_GENDERID,USER_HOMEID,USER_PTEMPERTUREID);
				UsersDao puDao = new UsersDao();
				User abc = puDao.selectUSER_ID(NEWUSER.getUSER_ID());
				//セッションスコープにIDを格納する
				HttpSession session2 = request.getSession();
				session2.setAttribute("login_user", abc);



				//メインページにフォワードする
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/weather_information_get.jsp");
				dispatcher.forward(request, response);
	}


	}


