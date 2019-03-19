package kr.co.form1.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller ////////////////////////////////
public class LoginController {
	
	public LoginController() {
		System.out.println("LoginController Start");
	}
	
	/*
	@RequestMapping(value="[요청명령어]", method=RequestMethod.[GET|POST], produces="text/plain; charset='UTF-8'")
	 */
	
	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public ModelAndView loginForm() {
	
		ModelAndView mav=new ModelAndView();
		// view페이지 이동 (prefix="/", suffix=".jsp")
		mav.setViewName("login/loginForm"); // /login/loginForm.jsp
		
		return mav;
		
	} // loginForm() end
	
	
/*
	// 1번 방법
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public ModelAndView loginProc(@RequestParam("id") String uid, @RequestParam("pw") String passwd) {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("login/loginResult");
		mav.addObject("uid", uid);
		mav.addObject("passwd", passwd);
		return mav;
	} // loginProc() end
*/
	
/*	
	// 2번 방법
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public ModelAndView loginProc(String id, String passwd) {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("login/loginResult");	
		mav.addObject("uid", id);
		mav.addObject("passwd", passwd);
		return mav;
	} // loginProc() end
*/
	
	// 3번 방법 (Getter&Setter 필수)
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public ModelAndView loginProc(LoginVO dto, HttpServletRequest req, HttpSession session) {
		
		String id = dto.getId();
		String passwd = dto.getPasswd();
		
		System.out.println(dto.getId()+", "+dto.getPasswd());
		
		
		ModelAndView mav=new ModelAndView();
		
		if(id.equals("soldesk")&&passwd.equals("1234")) {
			mav.setViewName("login/loginResult");
			req.setAttribute("r_id", id);
			req.setAttribute("r_passwd", passwd);
			session.setAttribute("s_id", id);
			session.setAttribute("s_passwd", passwd);
			mav.addObject("id", id);
			mav.addObject("passwd", passwd);
			mav.addObject("msg", "로그인되었습니다. ");
		}else {
			mav.setViewName("login/msgView");
			mav.addObject("msg", "아이디와 비밀번호가 일치하지 않습니다. ");
			mav.addObject("link", "<a href='javascript:history.back()'>뒤로가기</a>");
		}
		
		
		return mav;
	} // loginProc() end
	

	@RequestMapping(value="/logout.do", method=RequestMethod.GET)
	public ModelAndView loginProc() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("login/logout");
		return mav;
	} // logout() end
	
	
	
	
	
}
