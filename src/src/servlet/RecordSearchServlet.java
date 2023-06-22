package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
 			String user_id = request.getParameter("user_id");
 			String day_day = request.getParameter("DAY_DAY");
 			String day_htemperture = request.getParameter("DAY_HTEMPERTURE");
 			String day_ltemperture = request.getParameter("DAY_LTEMPERTURE");
 			List<Day> record_search = new ArrayList<Day>();

 			System.out.println(day_day);

 		// 検索処理を行う

 			if (day_day != "") {
 				DailyDao dDao = new DailyDao();
 	 			record_search = dDao.select(new Day(user_id,day_day));
 	 			System.out.println(record_search);
 			} else
 			if (day_htemperture != ""){
 				DailyDao dDao = new DailyDao();
 	 			record_search = dDao.select(new Day(user_id,day_htemperture));
 			} else
 			if (day_ltemperture != "") {
 				DailyDao dDao = new DailyDao();
 	 			record_search = dDao.select(new Day(user_id,day_ltemperture));
 			}

 			// 検索結果をセッションスコープに格納する
 			HttpSession session = request.getSession();
 			session.setAttribute("record_search",record_search);


 			// 結果ページにリダイレクトする(servletに移動)
 			response.sendRedirect("/hello/RecordSearchDisplayServlet");


     }
}
