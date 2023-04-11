package com.oraclejava;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NowController {
	@RequestMapping(value = "/now", method = RequestMethod.GET)
	public ModelAndView now() {
		ModelAndView mav = new ModelAndView();
		//mav.setViewName("now"); now.html을 의미한다
		//mav.addObject("currentDate",new Date());
		
		mav.setViewName("now");
		Date date = new Date();
		mav.addObject("time", date);
		mav.addObject("msg", "오늘 날짜와 시간입니다.🤣");
		return mav;
		
		
		}
}
