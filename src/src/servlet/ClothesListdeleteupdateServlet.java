package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Cloth;

/**
 * Servlet implementation class ClothesListdeleteupdateServlet
 */
@WebServlet("/ClothesListdeleteupdateServlet")
public class ClothesListdeleteupdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//セッションスコープの取得
		HttpSession session = request.getSession();
		//①セッションスコープからインスタンスを取得する
		Cloth listclothes = (Cloth)session.getAttribute("clothes_img");
		//③戻り値で返ってきたインスタンスをリクエストスコープに格納する
		request.setAttribute("colthes_img",listclothes);

		//各タグ詳細一覧画面にフォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/detail.jsp");
		dispatcher.forward(request, response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		// リクエストパラメータを取得する
		request.setCharacterEncoding("UTF-8");
		String USER_ID = request.getParameter("USER_ID");
		String SMALL_CATEGORY = request.getParameter("SMALL_CATEGORY");
		String CLO_IMAGES = request.getParameter("CLO_IMAGES");
		int small_category = Integer.parseInt(SMALL_CATEGORY);

		//listDaoに一つのまとまりとして入れる
		Cloth listDao = new Cloth(USER_ID,small_category,CLO_IMAGES);


		//セッションスコープにIDを格納する
			HttpSession session = request.getSession();
			session.setAttribute("profile_update", listDao);

		//各タグ詳細一覧画面にフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/detail.jsp");
		dispatcher.forward(request, response);



	}

}
