package com.bank.bankapp.controller;


import java.text.MessageFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.bankapp.entity.Customer;
import com.bank.bankapp.service.BankService;
import com.bank.bankapp.utils.BankConstants;


@RestController
@RequestMapping("/services")
public class BankServiceController {
          private static final Logger logger = LoggerFactory.getLogger(BankServiceController.class);

	@Autowired
	private BankService bankService;
	

	

	@GetMapping("/gettoken/{customerId}/{service}")
	public String generateToken(@PathVariable int customerId, @PathVariable String service) throws Exception {
		logger.info("Generate Token Service");
		MessageFormat tokenMF = new MessageFormat(BankConstants.TOKEN_GENERATE_SUCCESS);
		Integer token = bankService.enterinQueue(customerId, service);
		return tokenMF.format(new Object[] { token, customerId });

	}
	
		
	@GetMapping("updatepassbook/{customerId}/{tokenId}")
	public String updatePassbookService(@PathVariable int customerId, @PathVariable int tokenId) throws Exception {
		logger.info("Update Passbook Service");
		MessageFormat passbookMF = new MessageFormat(BankConstants.PASSBOOK_SUCCESS);
		Customer customer = bankService.passBookService(customerId, tokenId);
		return passbookMF
				.format(new Object[] { customer.getCustomerId(), customer.getCustomerName(), customer.getBalance() });

	}
	
	

	@GetMapping("cashdeposit/{customerId}/{tokenId}/{depositAmt}")
	public String cashDepositService(@PathVariable int customerId, @PathVariable int tokenId,
			@PathVariable int depositAmt) throws Exception {
		MessageFormat depositMF = new MessageFormat(BankConstants.DEPOSIT_SUCCESS);
		Customer customer = bankService.depositService(customerId, tokenId, depositAmt);
		return depositMF
				.format(new Object[] { customer.getCustomerId(), customer.getCustomerName(), customer.getBalance() });

	}

	
	
	@GetMapping("demanddraft/{customerId}/{tokenId}/{ddAmt}")
	public String ddService(@PathVariable int customerId, @PathVariable int tokenId, @PathVariable int ddAmt)
			throws Exception {
		logger.info("Demand Draft Service");
		MessageFormat ddMF = new MessageFormat(BankConstants.DD_SUCCESS);
		Customer customer = bankService.demandDraftService(customerId, tokenId, ddAmt);
		return ddMF
				.format(new Object[] { customer.getCustomerId(), customer.getCustomerName(), customer.getBalance() });

	}

	
	
	@PutMapping("/postreview/{customerId}/{review}")
	public String postReview(@PathVariable int customerId, @PathVariable String review) throws Exception {
		logger.info("Review Service");
		bankService.reviewForService(customerId, review);
		return BankConstants.THANKS_FOR_FEEDBACK;

	}
	
}

