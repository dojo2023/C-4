package servlet;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class ClothesRegisterServlet
 */

//↓これ絶対入れてね！！
@MultipartConfig(location = "C:\\dojo6\\src\\WebContent\\images\\clothes_images") // アップロードファイルの一時的な保存先

@WebServlet("/ClothesRegisterServlet")
public class ClothesRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//服の小カテゴリーのDaoと結び付け
		SmallcategoryDao sdao;
		sdao = new SmallcategoryDao();
		List<Small_category> list = sdao.selectall(null);
		request.setAttribute("smallcategory_list", list);

		// 服登録ページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/clothes_register.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		Part part = request.getPart("IMAGE"); // getPartで取得

		String image = this.getFileName(part);
		request.setAttribute("image", image);
		// サーバの指定のファイルパスへファイルを保存
        //場所はクラス名↑の上に指定してある
		part.write(image);

		//ここから上で画像の保存

		// リクエストパラメータを取得する
		request.setCharacterEncoding("UTF-8");
		String small_category= request.getParameter("clothes_kind");
		int SMALL_CATEGORY=Integer.parseInt(small_category);
		//String img = "'/hello/images/clothes_images/'+=image";
		String img = "/hello/images/clothes_images/"+image;


		Cloth clo;
		clo = new Cloth();
		clo.setSMALL_CATEGORYID(SMALL_CATEGORY);
		clo.setCLO_IMAGES(img);
//		clo.setCLO_NAME(image);

		//服の小カテゴリーのDaoと結び付け
		SmallcategoryDao smallDao = new SmallcategoryDao();
		//selectIDを使ってIDで検索できるようにする
        Small_category SC=smallDao.selectID(clo.getSMALL_CATEGORYID());

        //cloに上の検索結果（SMALL_CATEGORY）をSMALL_NAMEとしてセットする
        clo.setSMALL_NAME(SC.getSMALL_CATEGORY());

        // リクエストスコープにcloをclo_img_nameという名前を付けて格納する
		HttpSession session = request.getSession();
		session.setAttribute("clo_img_name", clo);

		// 服確認ページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/clothes_register_check.jsp");
		dispatcher.forward(request, response);

	}

	//ファイルの名前を取得してくる
	private String getFileName(Part part) {
        String name = null;
        for (String dispotion : part.getHeader("Content-Disposition").split(";")) {
            if (dispotion.trim().startsWith("filename")) {
                name = dispotion.substring(dispotion.indexOf("=") + 1).replace("\"", "").trim();
                name = name.substring(name.lastIndexOf("\\") + 1);
                break;
            }
        }		// TODO 自動生成されたメソッド・スタブ
		return name;

//		// リクエストパラメータを取得する
//		request.setCharacterEncoding("UTF-8");
//		String small_categoryid = request.getParameter("clothes_kind");
//		String CLO_IMAGES = request.getParameter("clothes_img");
//		int SMALL_CATEGORYID = Integer.parseInt(small_categoryid);


	}

}
