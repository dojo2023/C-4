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
import javax.servlet.http.Part;

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
			int CTAG = Integer.parseInt(ctag);
			String upctag = request.getParameter("upclothes__id");
			//int UPCTAG = Integer.parseInt(upctag);
			System.out.println("n"+CTAG);
			System.out.println("up"+upctag);

			/*
			request.setCharacterEncoding("UTF-8");


			//画像一枚目、服の種類プルダウン一つ目
			Part part = request.getPart("IMAGE"); // getPartで取得

			String image = this.getFileName(part);
	//		System.out.println("画像の名前＝"+image);
			request.setAttribute("image", image);
			// サーバの指定のファイルパスへファイルを保存
	        //場所はクラス名↑の上に指定してある
			part.write(image);
			String img = "/hello/images/clothes_images/"+image;



			Cloth clo;
			clo = new Cloth();
			clo.setSMALL_CATEGORYID(CTAG);
			clo.setCLO_IMAGES(img);


			//服の小カテゴリーのDaoと結び付け
			SmallcategoryDao smallDao = new SmallcategoryDao();
			//selectIDを使ってIDで検索できるようにする
	        Small_category SC=smallDao.selectID(clo.getSMALL_CATEGORYID());

	        //cloに上の検索結果（SMALL_CATEGORY）をSMALL_NAMEとしてセットする
	        clo.setSMALL_NAME(SC.getSMALL_CATEGORY());

	        // セッションスコープにcloをclo_img_nameという名前を付けて格納する
			HttpSession session = request.getSession();
			session.setAttribute("update_clo_img_name", clo);*/













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
	private String getFileName(Part part) {
		String name = null;
        for (String dispotion : part.getHeader("Content-Disposition").split(";")) {
            if (dispotion.trim().startsWith("filename")) {
                name = dispotion.substring(dispotion.indexOf("=") + 1).replace("\"", "").trim();
                name = name.substring(name.lastIndexOf("\\") + 1);
                break;
            }
        }
		return name;
	}
}
