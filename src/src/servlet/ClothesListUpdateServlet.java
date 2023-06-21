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
 * Servlet implementation class ClothesListUpdateServlet
 */
@WebServlet("/ClothesListUpdateServlet")
public class ClothesListUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//前画面からPOSTされるidを受け取る
		 //int clothId = Integer.parseInt(request.getParameter("CLOTH_ID"));

		//服のキーとなる項目を前画面から受け取る
		//int CLOTH_ID = 10;


		//服の情報をデータベースから取得する

		HttpSession session = request.getSession();
		Cloth smallcategory = (Cloth)session.getAttribute("small_category");

		request.setAttribute("small_category",smallcategory);



		//取得した値をjspに渡す
		//request.setAttribute("clothId", CLOTH_ID);


		//編集画面にフォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/clothes_update.jsp");
		dispatcher.forward(request, response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// リクエストパラメータを取得する
				request.setCharacterEncoding("UTF-8");
				String ID = request.getParameter("ID");
				String SMALL_CATEGORY = request.getParameter("SMALL_CATEGORY");
				String CLO_IMAGES = request.getParameter("CLO_IMAGES");
				int SMALL_CATEGORYID = Integer.parseInt("SMALL_CATEGORYID");


				Cloth cDao = new Cloth(ID,SMALL_CATEGORYID,SMALL_CATEGORY,CLO_IMAGES);


	        //セッションスコープにIDを格納する
			HttpSession session = request.getSession();
			session.setAttribute("clothes_update", cDao);

			//編集確認ページにフォワードする
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/clothes_update_check.jsp");
			dispatcher.forward(request, response);
	}

 }
