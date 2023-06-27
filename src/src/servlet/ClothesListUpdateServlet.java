package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import dao.SmallcategoryDao;
import model.Cloth;
import model.Small_category;

/**
 * Servlet implementation class ClothesListUpdateServlet
 */

//↓これ絶対入れてね！！
@MultipartConfig(location = "C:\\dojo6\\src\\WebContent\\images\\clothes_images") // アップロードファイルの一時的な保存先

@WebServlet("/ClothesListUpdateServlet")
public class ClothesListUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//前画面からPOSTされるidを受け取る
		 //int clothId = Integer.parseInt(request.getParameter("CLOTH_ID"));

		//服のキーとなる項目を前画面から受け取る
		//int CLOTH_ID = 10;


		//服の情報をデータベースから取得する

		HttpSession session = request.getSession();
		Cloth smallcategory = (Cloth)session.getAttribute("small_category");

		request.setAttribute("small_category",smallcategory);



		//取得した値をjspに渡す
		//request.setAttribute("clothId", CLOTH_ID);


		//編集画面にフォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/clothes_update.jsp");
		dispatcher.forward(request, response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String ctag = request.getParameter("clothes__id");
		//String cimg = request.getParameter("clothes__images");
		//String ckind = request.getParameter("clothes_kind");
		int CTAG = Integer.parseInt(ctag);
		Cloth clothesuptag = new Cloth();
		clothesuptag.setID(CTAG);
		/*clothestag.setCLO_IMAGES(cimg);
		clothestag.setSMALL_NAME(ckind);*/


		if(request.getParameter("clothes__name") != null) {
			String cname = request.getParameter("clothes__name");
			clothesuptag.setSMALL_NAME(cname);
			//服の画像を変更するとき
			Part part = request.getPart("IMAGE"); // getPartで取得

			String image = this.getFileName(part);
	//		System.out.println("画像の名前＝"+image);
			request.setAttribute("image", image);
			// サーバの指定のファイルパスへファイルを保存
	        //場所はクラス名↑の上に指定してある
			part.write(image);//ファイルの書き込み

			//ここから上で画像の保存
			String img = "/hello/images/clothes_images/"+image;
			clothesuptag.setCLO_IMAGES(img);
			HttpSession session = request.getSession();
			session.setAttribute("clothesuptag", clothesuptag);

		}else if(request.getParameter("clothes__images") != null) {
			//服のタグを変更する

			String ckind = request.getParameter("clothes_kind");
			int CKIND =Integer.parseInt(ckind);
			clothesuptag.setSMALL_CATEGORYID(CKIND);
			String cimg = request.getParameter("clothes__images");
			clothesuptag.setCLO_IMAGES(cimg);

			//服のタグ名取得
			SmallcategoryDao scDao = new SmallcategoryDao();
			Small_category sc = new Small_category();
			sc = scDao.selectID(CKIND);
			clothesuptag.setSMALL_NAME(sc.getSMALL_CATEGORY());



			HttpSession session = request.getSession();
			session.setAttribute("clothesuptag", clothesuptag);
		}




		//編集確認ページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/clothes_update_check.jsp");
		dispatcher.forward(request, response);
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
/*
//int CTAG = Integer.parseInt(ctag);

//String ctag = request.getParameter("upclothes__id");
String cname = request.getParameter("upclothes__name");
String cimages = request.getParameter("upclothes__images");
Cloth upclothestag = new Cloth();
//upclothestag.setID(ctag);
upclothestag.setSMALL_TAG(cname);
upclothestag.setCLO_IMAGES(cimages);


HttpSession session = request.getSession();
session.setAttribute("upsmallTag", upclothestag);*/

//Cloth clothestag = new Cloth();
		/*clothestag.setID(CTAG);
		clothestag.setSMALL_TAG(cname);
		clothestag.setCLO_IMAGES(cimages);*/
