package kr.co.form1.calc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller ////////////////////////////////
public class SubController {
	
	public SubController() {
		System.out.println("SubController Start");
	}

	@RequestMapping("/sub.do")
	public ModelAndView plus(HttpServletRequest req) {
		
		int num1=Integer.parseInt(req.getParameter("num1"));
		int num2=Integer.parseInt(req.getParameter("num2"));
		
		int result=Math.abs(num1-num2);
		
		System.out.println(result);
		
		ModelAndView mav=new ModelAndView();
		
		// view페이지 이동 (prefix="/", suffix=".jsp")
		mav.setViewName("calc/calcResult"); // /calc/calcResult.jsp
		
		req.setAttribute("msg", "두 수의 차");
		req.setAttribute("img", "<img src='images/014.gif'>");
		
		req.setAttribute("num1", num1);
		req.setAttribute("num2", num2);
		req.setAttribute("result", result);
		
		return mav;
		
	}
	
}
