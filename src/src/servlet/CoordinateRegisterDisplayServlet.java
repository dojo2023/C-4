package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DailyDao;
import model.Cloth;
import model.Day;
import model.User;

/**
 * Servlet implementation class CoordinateRegisterDisplayServlet
 */
@WebServlet("/CoordinateRegisterDisplayServlet")
public class CoordinateRegisterDisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CoordinateRegisterDisplayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		HttpSession session = request.getSession();

		User loginusers = (User)session.getAttribute("login_user");
		Cloth cood1 = (Cloth)session.getAttribute("check_tops");
		Cloth cood2 = (Cloth)session.getAttribute("check_outer1");
		Cloth cood3 = new Cloth();
		if((Cloth)session.getAttribute("check_outer2")!= null);{
			cood3 = (Cloth)session.getAttribute("check_outer2");
		}

		Cloth cood4 = (Cloth)session.getAttribute("check_bottoms");

		Day coodinate = new Day();
		coodinate.setDAY_TOPSNO(cood1.getID());
		coodinate.setDAY_OUTERNO1(cood2.getID());
		if(cood3 != null) {
			coodinate.setDAY_OUTERNO2(cood3.getID());
		}
		coodinate.setDAY_BOTTOMNO(cood4.getID());
		coodinate.setID(loginusers.getID());




		DailyDao DDDAO = new DailyDao();
		DDDAO.update(coodinate);


		response.sendRedirect("/hello/MainServlet");


	}

}
