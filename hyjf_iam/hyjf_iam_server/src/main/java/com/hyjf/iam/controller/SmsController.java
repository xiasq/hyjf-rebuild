package com.hyjf.iam.controller;

import com.hyjf.com.request.SmsCodeRequest;
import com.hyjf.com.response.SmsCodeResponse;
import com.hyjf.iam.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author xiasq
 * @version SmsController, v0.1 2018/4/12 17:26
 */

@RestController
@RequestMapping("/sms")
public class SmsController {

	@Autowired
	private SmsService smsService;

	@RequestMapping(value = "/saveSmsCode", method = RequestMethod.POST)
	public SmsCodeResponse saveSmsCode(@RequestBody @Valid SmsCodeRequest request) {
		SmsCodeResponse response = new SmsCodeResponse();

		smsService.save(request.getMobile(), request.getVerificationType(), request.getVerificationCode(),
				request.getPlatform(), request.getStatus());
		return response;
	}
}
