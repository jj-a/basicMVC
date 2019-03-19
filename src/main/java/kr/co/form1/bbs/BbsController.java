package kr.co.form1.bbs;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller ////////////////////////////////
public class BbsController {
	
	public BbsController() {
		System.out.println("BbsController Start");
	}
	
	/*
	@RequestMapping(value="[요청명령어]", method=RequestMethod.[GET|POST], produces="text/plain; charset='UTF-8'")
	 */
	/*
	@RequestMapping(value="/bbs/create.do", method=RequestMethod.GET)
	public ModelAndView bbsForm() {
	
		ModelAndView mav=new ModelAndView();
		// view페이지 이동 (prefix="/", suffix=".jsp")
		mav.setViewName("bbs/bbsForm"); // /bbs/bbsForm.jsp
		
		return mav;
		
	} // bbsForm() end
	*/
	
	@RequestMapping(value="/bbs/create.do", method=RequestMethod.GET)
	public String bbsForm() {
		return "bbs/bbsForm";
	} // bbsForm() end
	

	// 1) 기본 방법
	/*
	@RequestMapping(value="/bbs/create.do", method=RequestMethod.POST)
	public ModelAndView bbsIns(HttpServletRequest req) {
		
		String wname=req.getParameter("wname").trim();
		String subject=req.getParameter("subject").trim();
		String content=req.getParameter("content").trim();
		String passwd=req.getParameter("passwd").trim();
		
		ModelAndView mav=new ModelAndView();
		// view페이지 이동 (prefix="/", suffix=".jsp")
		mav.setViewName("bbs/bbsResult"); // /bbs/bbsResult.jsp
		
		mav.addObject("wname", wname);
		mav.addObject("subject", subject);
		mav.addObject("content", content);
		mav.addObject("passwd", passwd);
		
		return mav;
	} // bbsIns() end
	*/
	
	// 2) 매개변수(parameter)가 DTO객체인 경우, 
	// 해당 클래스에 반드시 폼 컨트롤 요소 이름으로 되어있는 멤버변수, getter&setter가 있어야 함
	@RequestMapping(value="/bbs/create.do", method=RequestMethod.POST)
	public ModelAndView bbsIns(BbsDTO dto) {

		ModelAndView mav=new ModelAndView();
		// view페이지 이동 (prefix="/", suffix=".jsp")
		mav.setViewName("bbs/bbsResult2"); // /bbs/bbsResult2.jsp
		
		mav.addObject("dto", dto);
		
		return mav;
	} // bbsIns() end
	
	
	
	
	
}
