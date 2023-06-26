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
 * Servlet implementation class RecordSearchDisplayServlet
 */
@WebServlet("/RecordSearchDisplayServlet")
public class RecordSearchDisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	
		// コーディネート履歴検索結果ページにフォワードする
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/record_display.jsp");
				dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		//12個のリクエストパラメータを取得する。一気にint型にする。
		request.setCharacterEncoding("UTF-8");

		//String cood_topsIM = request.getParameter("cood_topsIM");
		System.out.println(request.getParameter("cood_tops"));
		int  cood_tops = Integer.parseInt(request.getParameter("cood_tops"));

		//String cood_outer1IM = request.getParameter("cood_outer1IM");
		System.out.println(request.getParameter("cood_outer1"));
		int  cood_outer1 = 0;
		if(request.getParameter("cood_outer1") != null) {
			  cood_outer1 =Integer.parseInt(request.getParameter("cood_outer1"));

			}

		//String cood_outer2IM = request.getParameter("cood_outer2IM");
		int cood_outer2 =0 ;
		if(request.getParameter("cood_outer2") != null) {
		  cood_outer2 = Integer.parseInt(request.getParameter("cood_outer2"));
		}

		//String cood_bottomsIM = request.getParameter("cood_bottomsIM");
		System.out.println(request.getParameter("cood_bottoms"));
		int  cood_bottoms = Integer.parseInt(request.getParameter("cood_bottoms"));


		//Cloth型のインスタンス4つ生成
		ClothesDao ccdao;
		ccdao = new ClothesDao();

		Cloth check_tops;
		check_tops = new Cloth();
        check_tops = ccdao.selectID(cood_tops);


		//check_tops.setID(cood_tops);
		//check_tops.setCLO_IMAGES(cood_topsIM);

		//request.setAttribute("check_tops", check_tops);
		HttpSession session6 = request.getSession();
		session6.setAttribute("check_tops", check_tops);

		if(cood_outer1 != 0) {
		Cloth check_outer1;
		check_outer1 = new Cloth();
		check_outer1 = ccdao.selectID(cood_outer1);

		//check_outer1.setID(cood_outer1);
		//check_outer1.setCLO_IMAGES(cood_outer1IM);

		//request.setAttribute("check_outer1", check_outer1);
		HttpSession session7 = request.getSession();
		session7.setAttribute("check_outer1", check_outer1);
		}

		if(cood_outer2 != 0) {
		Cloth check_outer2;
		check_outer2 = new Cloth();
		check_outer2 = ccdao.selectID(cood_outer2);

		//check_outer2.setID(cood_outer2);
		//check_outer2.setCLO_IMAGES(cood_outer2IM);

		//request.setAttribute("check_outer2", check_outer2);
		HttpSession session8 = request.getSession();
		session8.setAttribute("check_outer2", check_outer2);
		}


		Cloth check_bottoms;
		check_bottoms = new Cloth();
		check_bottoms = ccdao.selectID(cood_bottoms);

		//check_bottoms.setID(cood_bottoms);
		//check_bottoms.setCLO_IMAGES(cood_bottomsIM);

		//request.setAttribute("check_bottoms",check_bottoms );
		HttpSession session9 = request.getSession();
		session9.setAttribute("check_bottoms", check_bottoms);




		 //cDaoに一つのまとまりとして入れる
		//Cloth cDao = new Cloth(cood_topsID,PW,latitude_and_longitude,GENDER,ptemperture);

		//セッションスコープにIDを格納する
	//	HttpSession session = request.getSession();
	//	session.setAttribute("profile_update", puDao);
}
}
