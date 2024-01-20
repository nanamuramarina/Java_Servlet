import bean.RegisterBean;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/register4")
public class RegisterServlet4 extends HttpServlet {
  public void doPost(HttpServletRequest req, HttpServletResponse res)
    throws IOException, ServletException {
      //リクエストの文字コードの指定
      req.setCharacterEncoding("utf-8");
      
      //入力情報の取得
      String name = req.getParameter("name");
      String age = req.getParameter("age");
      String[] langs = req.getParameterValues("lang");
      res.setCountentType("text/html;charset=utf-8");
      
      //Beanの作成
      RegisterBean rb = new RegisterBean();
      rb.setName(name);
      rb.setAge(age);
      rb.setLangs(langs);
      
      //Beanをリクエストに格納
      req.setAttribute("rb", rb);
      
      //register4jspへフォワード
      RequestDispatcher rb = req.RequestDispatcher("/register4,jsp")
    }
}