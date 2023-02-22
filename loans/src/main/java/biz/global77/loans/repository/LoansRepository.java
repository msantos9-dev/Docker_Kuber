package biz.global77.loans.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import biz.global77.loans.models.Loans;

@Repository
public interface LoansRepository extends CrudRepository<Loans, Long> {

	
	List<Loans> findByCustomerIdOrderByStartDtDesc(int customerId);

}
