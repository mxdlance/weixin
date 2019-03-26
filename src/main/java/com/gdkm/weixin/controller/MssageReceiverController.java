package com.gdkm.weixin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


//@RestController是满足RESTful风格的一种控制器实现，实际上它还是@Controller。
//但是@RestController只是返回内容，不返回视图（JSP、HTML）。
//路径和类的映射关系
//<url-pattern> 用于映射URL和Servlet的关系
//如果多人共享一台服务器，把kemao_2改为姓名的拼音
@RestController
@RequestMapping("/weixin/message/receiver")
public class MssageReceiverController {
	
	// 日志记录器
		private static final Logger LOG = LoggerFactory.getLogger(MssageReceiverController.class);
	
@GetMapping
public String echo(//
	@RequestParam("signature") String signature,
	@RequestParam("timestamp") String timestamp,
	@RequestParam("nonce") String nonce,
	@RequestParam("echostr") String echostr) {
	return echostr;

}
@PostMapping
// @RequestBody注解表示把请求内容获取出来，并且转换为String传入给xml参数。

public String onMessage(//
		@RequestParam("signature") String signature, //
		@RequestParam("timestamp") String timestamp, //
		@RequestParam("nonce") String nonce, //
		@RequestBody String xml) {
	// 收到消息
	// {}是占位符，第一个{}会把第二个参数的值自动填入
	// LOG.trace必须要求日志记录器的配置为trace级别才能输出
	LOG.trace("收到的消息原文：\n{}\n------------------------------", xml);
	// 转换消息
	// 把消息丢入队列
	// 消费队列中的消息
	// 产生客服消息

	return "success";
}


}
