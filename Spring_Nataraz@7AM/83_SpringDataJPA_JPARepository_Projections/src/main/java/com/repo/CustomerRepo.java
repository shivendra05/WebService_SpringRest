package com.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.CustomerDetails;

public interface CustomerRepo extends JpaRepository<CustomerDetails,Integer> {

	//-----static projection
	interface QuerySearchResults{
		String getcname();
		String getcadd();
	}
	public List<QuerySearchResults> findByCno(Integer cno);

	interface QuerySearchResults1{
		int getcno();
		String getcadd();
	}
	public List<QuerySearchResults> findByCnoBetween(int min,int max);

	//-----dynemic projection
	<A>	List<A> findBycno(int cno,Class<A> clzz);
}