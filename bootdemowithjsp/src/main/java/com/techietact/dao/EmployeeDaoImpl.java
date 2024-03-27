package com.techietact.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techietact.vo.EmployeeVO;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {
@Autowired
private EntityManager entity;
	@Override
	public EmployeeVO saveEmployee(EmployeeVO vo) {
		entity.persist(vo);
		return vo;
	}

}
