package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ClothesDao;
import model.Cloth;
import model.User;

/**
 * Servlet implementation class ClothesRegisterDisplayServlet
 */
@WebServlet("/ClothesRegisterDisplayServlet")
public class ClothesRegisterDisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 服登録確認ページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/clothes_register_check.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//一つ目、セッションスコープからclo_img_nameとlogin_userをゲットしclothesにUSER_IDをセットする
		HttpSession session = request.getSession();
		Cloth clothes = (Cloth)session.getAttribute("clo_img_name");

		HttpSession sessionuser = request.getSession();
		User user = (User)sessionuser.getAttribute("login_user");

		clothes.setUSER_ID(user.getUSER_ID());

		//二つ目、セッションスコープからclo_img_name2とlogin_user2をゲットしclothes2にUSER_IDをセットする
		HttpSession session2 = request.getSession();
		Cloth clothes2 = (Cloth)session2.getAttribute("clo_img_name2");

		HttpSession sessionuser2 = request.getSession();
		User user2 = (User)sessionuser2.getAttribute("login_user");

		clothes2.setUSER_ID(user2.getUSER_ID());

		//三つ目、セッションスコープからclo_img_name3とlogin_use3rをゲットしclothes3にUSER_IDをセットする
		HttpSession session3 = request.getSession();
		Cloth clothes3 = (Cloth)session3.getAttribute("clo_img_name3");

		HttpSession sessionuser3 = request.getSession();
		User user3 = (User)sessionuser3.getAttribute("login_user");

		clothes3.setUSER_ID(user3.getUSER_ID());

		//四つ目、セッションスコープからclo_img_name4とlogin_user4をゲットしclothes4にUSER_IDをセットする
		HttpSession session4 = request.getSession();
		Cloth clothes4 = (Cloth)session4.getAttribute("clo_img_name4");

		HttpSession sessionuser4 = request.getSession();
		User user4 = (User)sessionuser4.getAttribute("login_user");

		clothes4.setUSER_ID(user4.getUSER_ID());

		//五つ目、セッションスコープからclo_img_name5とlogin_user5をゲットしclothes5にUSER_IDをセットする
		HttpSession session5 = request.getSession();
		Cloth clothes5 = (Cloth)session5.getAttribute("clo_img_name5");

		HttpSession sessionuser5 = request.getSession();
		User user5 = (User)sessionuser5.getAttribute("login_user");

		clothes5.setUSER_ID(user5.getUSER_ID());

		//六つ目、セッションスコープからclo_img_name6とlogin_user6をゲットしclothes6にUSER_IDをセットする
		HttpSession session6 = request.getSession();
		Cloth clothes6 = (Cloth)session6.getAttribute("clo_img_name6");

		HttpSession sessionuser6 = request.getSession();
		User user6 = (User)sessionuser6.getAttribute("login_user");

		clothes6.setUSER_ID(user6.getUSER_ID());


		// 登録処理を行う
		ClothesDao cDao = new ClothesDao();
		if (clothes.getCLO_IMAGES() != "") {
			cDao.insert(clothes);
			String cl = clothes2.getCLO_IMAGES();
			if(cl=="") {
				// ログインページにリダイレクトする
//				response.sendRedirect("/hello/ClothesRegisterServlet");
			}
		}

		if (clothes2.getCLO_IMAGES() != "") {
			cDao.insert(clothes2);
			String cl2 = clothes3.getCLO_IMAGES();
			if(cl2=="") {
			// ログインページにリダイレクトする
//				response.sendRedirect("/hello/ClothesRegisterServlet");
			}
		}

		if (clothes3.getCLO_IMAGES() != "") {
			cDao.insert(clothes3);
			String cl3 = clothes4.getCLO_IMAGES();
			if(cl3=="") {
			// ログインページにリダイレクトする
//				response.sendRedirect("/hello/ClothesRegisterServlet");
			}
		}

		if (clothes4.getCLO_IMAGES() != "") {
			cDao.insert(clothes4);
			String cl4 = clothes5.getCLO_IMAGES();
			if(cl4=="") {
			// ログインページにリダイレクトする
//				response.sendRedirect("/hello/ClothesRegisterServlet");
			}
		}

		if (clothes5.getCLO_IMAGES() != "") {
			cDao.insert(clothes5);
			String cl5 = clothes6.getCLO_IMAGES();
			if(cl5=="") {
			// ログインページにリダイレクトする
//				response.sendRedirect("/hello/ClothesRegisterServlet");
			}
		}

		if (clothes6.getCLO_IMAGES() != "") {
			cDao.insert(clothes6);
			// ログインページにリダイレクトする
//				response.sendRedirect("/hello/ClothesRegisterServlet");
		}

		// ログインページにリダイレクトする
		response.sendRedirect("/hello/ClothesRegisterServlet");

//		else {												// 登録失敗
//			request.setAttribute("result",
//			new Result("登録失敗！", "レコードを登録できませんでした。", "/hello/LoginServlet"));
//		}
	}






//		// 服登録ページにフォワードする
//		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/clothes_register.jsp");
//		dispatcher.forward(request, response);
	}

