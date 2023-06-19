package servlet;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class WeatherInformationGetServlet
 */
@WebServlet("/WeatherInformationGetServlet")
public class WeatherInformationGetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/weather_information_get.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//Dailyに最高気温と最低気温をDay_weathercodeに各時間の気温と天気コードを自動保存し、メインへ遷移

		request.setCharacterEncoding("UTF-8");
		String max = request.getParameter("max_temperature");
		String min = request.getParameter("min_temperature");
		String weather = request.getParameter("day_weather");
		System.out.print(max);
		System.out.print(min);
		System.out.print(weather);
		/*double doublemax = Double.parseDouble(max);
		double doublemin = Double.parseDouble(min);
		int intweather = Integer.parseInt(weather);

		HttpSession session = request.getSession();
		User login_user = (User)session.getAttribute("login_user");
        String user_id = login_user.getUSER_ID();

        Day todayinformation = new Day ();
            todayinformation.setUSER_ID(user_id);
            todayinformation.setDAY_HTEMPERTURE(doublemax);
            todayinformation.setDAY_LTEMPERTURE(doublemin);
            todayinformation.setDAY_WEATHERCODE(intweather);

        DailyDao DDao = new DailyDao();
        DDao.insert(todayinformation);*/

		response.sendRedirect("/hello/MainServlet");

	}

}
