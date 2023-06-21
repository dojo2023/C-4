package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DailyDao;
import model.Day;

/**
 * Servlet implementation class RecordSearchServlet
 */
@WebServlet("/RecordSearchServlet")
public class RecordSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// コーディネート履歴検索ページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/record_search.jsp");
		dispatcher.forward(request, response);
    }


     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

 		// リクエストパラメータを取得する
 			request.setCharacterEncoding("UTF-8");
 			String user_id = request.getParameter("USER_ID");
 			String day_day = request.getParameter("DAY_DAY");
 			String day_htemperture = request.getParameter("DAY_HTEMPERTURE");
 			String day_ltemperture = request.getParameter("DAY_LTEMPERTURE");


 		// 検索処理を行う
 			DailyDao dDao = new DailyDao();
 			List<Day> record_search = dDao.select(new Day(day_day,user_id,day_htemperture,day_ltemperture));

 			// 検索結果をリクエストスコープに格納する
 			request.setAttribute("record_search", record_search);

 			// 結果ページにフォワードする
 			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/record_display.jsp");
 			dispatcher.forward(request, response);


     }
}
