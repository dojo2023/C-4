package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SmallcategoryDao;
import model.Result;

/**
 * Servlet implementation class ClothesListUpdateDisplayServlet
 */
@WebServlet("/ClothesListUpdateDisplayServlet")
public class ClothesListUpdateDisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



		// リクエストパラメータを取得する
				request.setCharacterEncoding("UTF-8");
				//String photo = request.getParameter("PHOTO");
				String small_category = request.getParameter("SMALL_CATEGORY");

		// 更新または削除を行う
		SmallcategoryDao sDao = new SmallcategoryDao();
				if (request.getParameter("SUBMIT").equals("更新")) {
					if (sDao.update(new SmallcategoryDao(small_category))) {	// 更新成功
						request.setAttribute("result",
						new Result("更新成功！", "レコードを更新しました。", "/hello/ClothesListServlet"));
					}
					else {												// 更新失敗
						request.setAttribute("result",
						new Result("更新失敗！", "レコードを更新できませんでした。", "/hello/ClothesListServlet"));
					}
				}


		//編集確認画面にフォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/clothes_update_check.jsp");
		dispatcher.forward(request, response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
