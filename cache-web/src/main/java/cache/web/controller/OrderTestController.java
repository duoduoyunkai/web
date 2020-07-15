package cache.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cache.web.model.OrderVo;
@Controller
public class OrderTestController {

	@RequestMapping("/orders")
	@ResponseBody
	public OrderVo hello(@RequestParam String orderNumber) {
		OrderVo result = new OrderVo(orderNumber, "123", "Pa", "7011428", "0007011428");
		return result;
				
	}
}
