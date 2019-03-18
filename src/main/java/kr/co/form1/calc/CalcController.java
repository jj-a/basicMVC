package kr.co.form1.calc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller ////////////////////////////////
public class CalcController {
	
	public CalcController() {
		System.out.println("CalcController Start");
	}
	
	/*
	@RequestMapping(value="[요청명령어]", method=RequestMethod.[GET|POST], produces="text/plain; charset='UTF-8'")
	 */
	@RequestMapping(value="/multi.do", method=RequestMethod.GET)
	public ModelAndView multi(HttpServletRequest req) {
		
		int num1=Integer.parseInt(req.getParameter("num1"));
		int num2=Integer.parseInt(req.getParameter("num2"));
		
		int result=num1*num2;
		
		System.out.println(result);
		
		ModelAndView mav=new ModelAndView();
		
		// view페이지 이동 (prefix="/", suffix=".jsp")
		mav.setViewName("calc/calcResult"); // /calc/calcResult.jsp
		
		req.setAttribute("msg", "두 수의 곱");
		req.setAttribute("img", "<img src='images/001.gif' width=500>");
		
		req.setAttribute("num1", num1);
		req.setAttribute("num2", num2);
		req.setAttribute("result", result);
		
		return mav;
		
	} // multi() end
	

	@RequestMapping(value="/div.do", method=RequestMethod.GET)
	public ModelAndView div(HttpServletRequest req) {
		
		int num1=Integer.parseInt(req.getParameter("num1"));
		int num2=Integer.parseInt(req.getParameter("num2"));
		
		int result=Math.abs(num1/num2);
		
		System.out.println(result);
		
		ModelAndView mav=new ModelAndView();
		
		// view페이지 이동 (prefix="/", suffix=".jsp")
		mav.setViewName("calc/calcResult"); // /calc/calcResult.jsp
		
		req.setAttribute("msg", "두 수의 나눔");
		req.setAttribute("img", "<img src='images/001.gif' width=500>");
		
		req.setAttribute("num1", num1);
		req.setAttribute("num2", num2);
		req.setAttribute("result", result);
		
		return mav;
		
	} // div() end
	

	@RequestMapping(value="/diff.do", method=RequestMethod.GET)
	public ModelAndView diff(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
		
		int result=Math.abs(num1-num2);
		
		System.out.println(result);
		
		ModelAndView mav=new ModelAndView();
		
		// view페이지 이동 (prefix="/", suffix=".jsp")
		mav.setViewName("calc/calcResult"); // /calc/calcResult.jsp
		
		mav.addObject("msg", "두 수 사이의 간격");
		mav.addObject("img", "<img src='images/001.gif' width=500>");
		
		mav.addObject("num1", num1);
		mav.addObject("num2", num2);
		mav.addObject("result", result);
		
		return mav;
		
	} // diff() end
	

	@RequestMapping(value="/max.do", method=RequestMethod.GET)
//	@RequestMapping(value="/diff.do", method=RequestMethod.POST)
	public ModelAndView max(int num1,  int num2) {
		
		int result= (num1>num2)? num1 : num2;
		
		System.out.println(result);
		
		ModelAndView mav=new ModelAndView();
		
		// view페이지 이동 (prefix="/", suffix=".jsp")
		mav.setViewName("calc/calcResult"); // /calc/calcResult.jsp
		
		mav.addObject("msg", "두 수 중 큰 값");
		mav.addObject("img", "<img src='images/001.gif' width=500>");
		
		mav.addObject("num1", num1);
		mav.addObject("num2", num2);
		mav.addObject("result", result);
		
		return mav;
		
	} // diff() end
	
	
	
	
	
}
