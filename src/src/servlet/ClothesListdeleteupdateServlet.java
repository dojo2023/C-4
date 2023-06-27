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

import dao.ClothesDao;
import dao.SmallcategoryDao;
import model.Cloth;
import model.Small_category;

/**
 * Servlet implementation class ClothesListdeleteupdateServlet
 */
@WebServlet("/ClothesListdeleteupdateServlet")
public class ClothesListdeleteupdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		//String USER_ID = request.getParameter("USER_ID");
		//String SMALL_CATEGORY = request.getParameter("SMALL_CATEGORY");//画面から受け取るpostデータは全て文字列だからString
		//String CLO_IMAGES = request.getParameter("CLO_IMAGES");
		//int small_category = Integer.parseInt(SMALL_CATEGORY);//数値の変換している
		//listDaoに一つのまとまりとして入れる
		//Cloth listDao = new Cloth();
		//セッションスコープにIDを格納する
		//HttpSession session = request.getSession();
		//session.setAttribute("small_category", listDao);


		//System.out.println(request.getParameter("btn"));
		String tagName = request.getParameter("btn");
		int tagintName = Integer.parseInt(tagName);

		ClothesDao listDao = new ClothesDao();
		ArrayList<Cloth> clothesTagList = new ArrayList<Cloth>();
		clothesTagList = listDao.selectSMALL_CATEGORY(tagintName);
		//セッションの取得または作成
		HttpSession session = request.getSession();
		//データの格納
		session.setAttribute("clothesTagList", clothesTagList);


		SmallcategoryDao smallDao = new SmallcategoryDao();
		//Cloth tag = new Cloth();
		Small_category smallTag = new Small_category();
		System.out.println(tagintName);
		smallTag = smallDao.selectID(tagintName);
		System.out.println(smallTag.getSMALL_CATEGORY());
		//tag.setSMALL_TAG(smallTag.getSMALL_CATEGORY());

		// 検索結果をリクエストスコープに格納する
		request.setAttribute("smallTag", smallTag);



		//プロフィール確認ページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/detail.jsp");
		dispatcher.forward(request, response);
		}




	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// リクエストパラメータを取得する
		request.setCharacterEncoding("UTF-8");

		if (request.getParameter("SUBMIT").equals("更新")) {
			//tagの一覧名前を出力する
			SmallcategoryDao sdao;
			sdao = new SmallcategoryDao();
			List<Small_category> list = sdao.selectall(null);
			//服の種類タグを全て表示する
			request.setAttribute("smallcategory_tag", list);



			//編集したい画像のID取得
			String ctag = request.getParameter("clothes__id");
			String cname = request.getParameter("clothes__name");
			String cimg = request.getParameter("clothes__images");
			int CTAG = Integer.parseInt(ctag);
			System.out.println(CTAG);
			System.out.println(cname);
			System.out.println(cimg);

			Cloth cclothes = new Cloth();
			cclothes.setID(CTAG);
			cclothes.setSMALL_NAME(cname);
			cclothes.setCLO_IMAGES(cimg);
			HttpSession session = request.getSession();
			session.setAttribute("cclothes", cclothes);


			RequestDispatcher dispatcher1 = request.getRequestDispatcher("/WEB-INF/jsp/clothes_update.jsp");
			dispatcher1.forward(request, response);

		}else if (request.getParameter("SUBMIT").equals("削除")) {
			String ctag = request.getParameter("clothes__id");
			String cname = request.getParameter("clothes__name");
			String cimages = request.getParameter("clothes__images");
			int CTAG = Integer.parseInt(ctag);
			Cloth clothestag = new Cloth();
			clothestag.setID(CTAG);
			clothestag.setSMALL_TAG(cname);
			clothestag.setCLO_IMAGES(cimages);


			HttpSession session = request.getSession();
			session.setAttribute("smallTag1", clothestag);





			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/delete_check.jsp");
			dispatcher.forward(request, response);
		}
	}

	}
