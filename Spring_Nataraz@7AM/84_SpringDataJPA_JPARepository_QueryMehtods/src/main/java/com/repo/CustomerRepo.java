package com.repo;

import java.lang.annotation.Native;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.entity.CustomerDetails;

@Transactional
public interface CustomerRepo extends JpaRepository<CustomerDetails, Integer> {

	@Query("from CustomerDetails")
	Iterable<CustomerDetails> getCustomers();
	
	@Query("from CustomerDetails where cadd=?1")
	Iterable<CustomerDetails> getCustomersByAddr(String city);
	
	@Query("from CustomerDetails where cno=?1")
	Iterable<CustomerDetails> getCustomersByID(int id);
	
	@Query("from CustomerDetails where cno between ?1 and ?2")
	Iterable<CustomerDetails> getCustomersByIDBetween(int num1,int num2);
	
	@Query("from CustomerDetails where cno in(?1,?2,?3)")
	Iterable<CustomerDetails> getCustomersByIDIn(int num1,int num2,int num3);
	
	@Query("from CustomerDetails where cname like 'a%'")
	Iterable<CustomerDetails> getCustomersByLike();
	
	@Query("from CustomerDetails where cno>=:cnum1 and cno<=:cnum2")
	Iterable<CustomerDetails> getCustomersByIDInRange(int cnum1,int cnum2);

	@Query("select cno, cadd from CustomerDetails where cname like 'a%'")
	Iterable<Object[]> getCnocAddeByLike();
	
	@Query("select cadd from CustomerDetails where cno>=:cnum1")
	Iterable<String> getcNoByID(int cnum1);

	@Modifying
	@Query("update CustomerDetails set billAmount=billAmount+:newBillAmount where cadd=:cadd")
	Iterable<Object[]> modifyBillAmount(double newBillAmount,String cadd);
	
	@Modifying
	@Query("delete from CustomerDetails where cno=:cnum1")
	int deleteByID(int cnum1);
	
	//@Query(nativeQuery = true,value="select cno, cname, cadd, bill_Amount from customer_details where cadd=:cadd")
	//@Query(nativeQuery = true,value="select cno, cadd, cname, bill_Amount from customer_details where cadd=?")
	@Query(nativeQuery = true,value="select cno, cadd, cname, bill_Amount from customer_details where cadd=?1")
	Iterable<CustomerDetails> getByAddress(String cadd);
	
	@Query(nativeQuery = true,value="select SYSDate from dual")
	java.util.Date  getSystemDate();
	
	//---PL/SQL-----------
	@Query(nativeQuery = true,value="{call GET_CUSTOMER_BY_ADDRS(?,?)}")
	String  getCustName(int cno,String cname);
}
