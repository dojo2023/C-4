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

		HttpSession session = request.getSession();
		Cloth clothes = (Cloth)session.getAttribute("clo_img_name");

		HttpSession sessionuser = request.getSession();
		User user = (User)sessionuser.getAttribute("login_user");

		clothes.setUSER_ID(user.getUSER_ID());

		// 登録処理を行う
		ClothesDao cDao = new ClothesDao();
		if (cDao.insert(clothes)) {	// 登録成功
//			request.setAttribute("result",
//			new Result("登録成功！", "レコードを登録しました。", "/hello/LoginServlet"));
			// ログインページにリダイレクトする
			response.sendRedirect("/hello/ClothesRegisterServlet");
		}
//		else {												// 登録失敗
//			request.setAttribute("result",
//			new Result("登録失敗！", "レコードを登録できませんでした。", "/hello/LoginServlet"));
//		}
	}






//		// 服登録ページにフォワードする
//		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/clothes_register.jsp");
//		dispatcher.forward(request, response);
	}

