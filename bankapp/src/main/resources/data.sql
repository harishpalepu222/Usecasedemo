insert into customer (customerId,customerName,balance) 
values 
(101,'ram',50000),
(102,'naveen',10000),
(103,'prem',40000),
(104,'harish',70000),
(105,'sunny',80000);

insert into services (serviceId,serviceName)
values
(1,'UpdatePassbook'),
(2,'CashDeposit'),
(3,'DemandDraft');

insert into transactionstatus (transactionId,customerId,tokenId,serviceName,status)
values
(100001,101,1,'UpdatePassbook','open'),
(100002,102,2,'UpdatePassbook','open');

insert into transactionstatus (transactionId,customerId,tokenId,serviceName,amount,status)
values
(100003,103,1,'CashDeposit',10000,'open');

insert into bankqueue (serviceName,tokenId)
values
('UpdatePassbook',3),
('CashDeposit',2),
('DemandDraft',1);


