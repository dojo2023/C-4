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

import dao.DailyDao;
import model.Day;
import model.User;

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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//検索結果サーブレットにリダイレクトする
		response.sendRedirect("/hello/RecordSearchDisplayServlet");




		//リクエストパラメータを取得する
		request.setCharacterEncoding("UTF-8");
		String day_day = request.getParameter("DAY_DAY");
		String day_htemperture = request.getParameter("DAY_HTEMPERTURE");
		String day_ltemperture = request.getParameter("DAY_LTEMPERTURE");
		HttpSession session = request.getSession();

		User search = (User)session.getAttribute("login_user");
        String user_id = search.getUSER_ID();

		//検索処理を行う
		DailyDao bDao = new DailyDao();
		List<Day> cardList = bDao.select(new Day(user_id,day_day));


		// 検索結果をリクエストスコープに格納する
		request.setAttribute("record_search", cardList);

				// 結果ページにフォワードする
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/record_display.jsp");
				dispatcher.forward(request, response);
	}
}