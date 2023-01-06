package com.kakao.school;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kakao.school.domain.Command;
import com.kakao.school.dto.ItemDTO;
import com.kakao.school.sevice.ItemService;

import lombok.RequiredArgsConstructor;


@Controller
@RequiredArgsConstructor
public class ItemController {
	private final ItemService itemService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		//서비스 메서드 호출
		List<ItemDTO> list = itemService.allItem();
		//결과 저장
		model.addAttribute("list", list);
		return "home";
	}
	
	@RequestMapping(value="detail/{itemid}", method = RequestMethod.GET)
	public String detail(Model model, @PathVariable("itemid") int itemid){
		//서비스 메서드 호출
		ItemDTO dto = itemService.getItem(itemid);
		
		//데이터 전달
		model.addAttribute("item",dto);
		
		//출력할 뷰 이름설정
		return "detail";
	}
	
	//item.xls요청이 왔을 때 excel이라는 뷰로 출력 -> 엑셀다운로드가 생긴다
	@RequestMapping(value="item.xls", method=RequestMethod.GET)
	public String excel(Model model) {
		
		List<ItemDTO> list = itemService.allItem();
		model.addAttribute("list", list);
		return "excel";
	}
	@RequestMapping(value="item.pdf", method=RequestMethod.GET)
	public String pdf(Model model) {
		
		List<ItemDTO> list = itemService.allItem();
		model.addAttribute("list", list);
		return "pdf";
	}


	/*
	@RequestMapping(value="hello", method=RequestMethod.GET)
	public String hello(Model model) {
		model.addAttribute("message","뷰에게 전달하는 데이터");
		return "hello";
	}
	@RequestMapping(value = "message/detail/{num}", method = RequestMethod.GET)
	public String detail(Model model , @PathVariable("num") Integer num) {
		System.out.println("num :" + num );
		model.addAttribute("num", num);
		return "detail";
	}
	@RequestMapping(value = "param1", method = RequestMethod.GET)
	public String param1(Model model, HttpServletRequest request) {
		//전동적인 자바 웹 프로그래밍에서의 파라미터 읽기
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		System.out.println("name:" + name);
		System.out.println("passwor:"+ password);
		
		return "";
	}
	@RequestMapping(value = "param2", method = RequestMethod.POST)
	public String param2(Model model, @RequestParam("name") String name, @RequestParam("password") String password) {
		System.out.println("name:" + name);
		System.out.println("passwor:"+ password);
		
		return "";
	}
	@RequestMapping(value = "param3", method = RequestMethod.POST)
	public String param3(Model model, Command command) {
		System.out.println(command);
		return "";
	}

	@RequestMapping(value = "redirect", method = RequestMethod.GET)
	public String redirect(Model model , HttpSession session, RedirectAttributes rattr) {
		//데이터 생성 = request.setAttribute("msg", "메시지)와 동일
		//redirect로 이동을 하게 되면 Request의 데이터는 전달 되지 않는다.
		//request가 새로 만들어지기 때문이다.
		//이런 경우에는 session이나 RedirectAttributes를 이용해야한다.
		model.addAttribute("msg","메시지");
		//브라우저를 종료하거나 세션에서 제거하지 않는 이상 계속 유지
		//session.setAttribute("msg", "세션을 이용한 데이터 전달");;
		//한번만 전송되고 삭제 됨
		rattr.addFlashAttribute("msg", "일회용 데이터 전달");
		
		
		//리다이렉트 할 때는 redirect: 다음에 URL을 설
		return "redirect:disp";
	}
	
	//여기에 disp작성 리다이렉트시에는 이렇게 한번 거쳐서 온다.
	@RequestMapping(value = "disp", method = RequestMethod.GET)
	public String disp(Model model) {
		
		//리다이렉트 할 때는 redirect: 다음에 URL을 설정
		return "redirect";
	}
	*/
}
