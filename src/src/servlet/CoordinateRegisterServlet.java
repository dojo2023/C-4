package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ClothesDao;
import dao.SmallcategoryDao;
import model.Cloth;
import model.Small_category;

/**
 * Servlet implementation class CoordinateRegisterServlet
 */
@WebServlet("/CoordinateRegisterServlet")
public class CoordinateRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//リクエストパラメータを取得する。一気にint型にする。
		request.setCharacterEncoding("UTF-8");
		int  tops = Integer.parseInt(request.getParameter("tops"));
		int  outer1 = Integer.parseInt(request.getParameter("outer1"));
		int  outer2 = 0;
		if(request.getParameter("outer2") != null) {
		    outer2 = Integer.parseInt(request.getParameter("outer2"));
		}
		int  bottoms =Integer.parseInt(request.getParameter("bottoms"));

		//int型に変換。intの後は変数名を変える！
		/*		int TOPS = Integer.parseInt(tops);
				int OUTER1 = Integer.parseInt(outer1);
				int OUTER2 = Integer.parseInt(outer2);
				int BOTTOMS = Integer.parseInt(bottoms);
		*/

		//
		HttpSession session = request.getSession();
		session.setAttribute("outer", outer2);

		//ClothesDaoをつくる(インスタンス化)
		ClothesDao cdao;
		cdao = new ClothesDao();

		//ClothesDaoのselectメソッドを使う tops
		ArrayList<Cloth> ClothList = cdao.selectSMALL_CATEGORY(tops);

		//セッションスコープにIDを格納する
		session.setAttribute("Coordinate1", ClothList);

        //タグを取る
		SmallcategoryDao smallDao = new SmallcategoryDao();
		//Cloth tag = new Cloth();
		Small_category smallTag = new Small_category();
		smallTag = smallDao.selectID(tops);

		//tag.setSMALL_TAG(smallTag.getSMALL_CATEGORY());


		//セッションスコープに格納する
		session.setAttribute("smallTag1", smallTag);


		//ClothesDaoのメソッドを使う outer1
	    ClothList = cdao.selectSMALL_CATEGORY(outer1);

		//セッションスコープにIDを格納する
		session.setAttribute("Coordinate2", ClothList);




		smallTag = smallDao.selectID(outer1);



		//セッションスコープに格納する
		session.setAttribute("smallTag2", smallTag);




		//ClothesDaoのメソッドを使う outer2(アウター+防寒着など)
		if(outer2 != 0) { //outer2が0でない時以下が動く
		    ClothList = cdao.selectSMALL_CATEGORY(outer2);

			//セッションスコープにIDを格納する
			session.setAttribute("Coordinate3", ClothList);
			smallTag = smallDao.selectID(outer2);

			//tag.setSMALL_TAG(smallTag.getSMALL_CATEGORY());

			session.setAttribute("smallTag3", smallTag);
		} else {
			session.removeAttribute("smallTag3");
			session.removeAttribute("Coodenate3");
		}



		//ClothesDaoのメソッドを使う bottoms
	    ClothList = cdao.selectSMALL_CATEGORY(bottoms);

		//セッションスコープにIDを格納する
		session.setAttribute("Coordinate4", ClothList);
		smallTag = smallDao.selectID(bottoms);

		//tag.setSMALL_TAG(smallTag.getSMALL_CATEGORY());


		session.setAttribute("smallTag4", smallTag);


		// コーディネート登録ページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/coordinate_register.jsp");
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
		int  cood_outer1 = Integer.parseInt(request.getParameter("cood_outer1"));


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


		Cloth check_outer1;
		check_outer1 = new Cloth();
		check_outer1 = ccdao.selectID(cood_outer1);

		//check_outer1.setID(cood_outer1);
		//check_outer1.setCLO_IMAGES(cood_outer1IM);

		//request.setAttribute("check_outer1", check_outer1);
		HttpSession session7 = request.getSession();
		session7.setAttribute("check_outer1", check_outer1);


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
	//s	session.setAttribute("profile_update", puDao);

		//プロフィール確認ページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/coordinate_register_check.jsp");
		dispatcher.forward(request, response);












	}

}
