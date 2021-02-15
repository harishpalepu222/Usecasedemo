package com.bank.bankapp.utils;


public class BankConstants {
	
	public static final String UPDATE_PASSBOOK="Updatepassbook";
	public static final String CASH_DEPOSIT="Cashdeposit";
	public static final String DEMAND_DRAFT="Demanddraft";
	public static final String CUSTOMER_ALRDY_PRESENT_ERR="Customer {0} already in queue";
	public static final String DUPLICATE_ENTRY="Duplicate entry";
	public static final String INVALID_CUSTOMER="Invalid customer id!!";
	public static final String INVALID_SERVICE="Invalid service id!!";
	public static final String CUST_NOT_FOUND="Customer id:{0} not found in database";
	public static final String SERVICE_NOT_FOUND="Customer id:{0} not found in database";
	public static final String INVALID_TOKEN="Invalid Token Id!!";
	public static final String TOKEN_CNT_BE_ZERO="Token Id cannot be zero";
	public static final String TOKEN_GENERATE_SUCCESS="Token Id {0} generated for Customer:{1}";
	public static final String PASSBOOK_SUCCESS="Passbook data updated for Customer id: {0} , name:{1} , Total Amount: {2}";
	public static final String EXPECTED_TOKEN_ERROR="Expected Token Id:{0}";
	public static final String INVALID_AMOUNT="Invalid Amount";
	public static final String AMOUNT_GRTR_THN_ZERO_MSG="Deposit Amount should be greater than zero";
	public static final String DEPOSIT_SUCCESS="Cash Deposit successful for Customer id: {0} , name:{1} , Total Amount: {2}";
	public static final String DD_SUCCESS="Demand Draft amount debited successful for Customer id: {0} , name:{1} , Acc Balance: {2}";
	public static final String DD_AMOUNT_GRTR_THN_ZERO_MSG="DD Amount should be greater than zero and lessthan or equal to account Balance";
	public static final String OPEN="open";
	public static final String IN_PROGRESS="in progress";
	public static final String REJECTED="rejected";
	public static final String CLOSED="closed";
	public static final String THANKS_FOR_FEEDBACK="Thanks for the feedback";
	public static final String TRAN_ID_NOT_FOUND="Valid transactionid not found to post a review";
	public static final String CUST_NOT_AVAIL_SERVICE="Customer not availed service to post Review";
	public static final String NO_TOKEN_IN_Q_MSG="(No Token in Queue)";


}
