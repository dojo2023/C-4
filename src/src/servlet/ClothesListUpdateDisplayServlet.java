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

		// 送信された値を取得する
        /*String selectedValue = request.getParameter("selectedValue");
        int clothId = Integer.parseInt(request.getParameter("clothId"));*/

        // 取得した値をjspに渡す
       /* request.setAttribute("selectedValue", selectedValue);
        request.setAttribute("clothId", clothId);*/

		//編集確認画面にフォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/clothes_update_check.jsp");
		dispatcher.forward(request, response);

	}



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		//①セッションスコープからインスタンスを取得する
		Cloth clotheuptag = (Cloth)session.getAttribute("clothesuptag");
		ClothesDao clothesupdate = new ClothesDao();
		clothesupdate.update(clotheuptag);


		response.sendRedirect("/hello/MainServlet");




	}

}