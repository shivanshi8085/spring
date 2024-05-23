package com.rays.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.rays.dao.UserDaoInt;
import com.rays.dto.UserDTO;

@Service

public class UserServiceImpl implements UserServiceInt{

	@Autowired
	private UserDaoInt dao = null;
	
	
	public long add(UserDTO dto) {
		
		long pk =dao.add(dto);
		
		return pk;
	}

	public void update(UserDTO dto) {
dao.update(dto);		
	}

	public UserDTO delete(long id) {
		UserDTO deleteUser =dao.delete(id);
		
		return deleteUser;
	}

	public UserDTO findByPk(long pk) {
		
		
		return dao.findByPK( pk);
	}

	public UserDTO findByLogin(String login) {
		// TODO Auto-generated method stub
		return dao.findByLogin(login);
	}

	public UserDTO authenticate(String login, String password) {
		UserDTO user =dao.authenticate(login, password);
		return null;
	}

	public List search(UserDTO dto) {
		return dao.search(dto);
	}

	public List search(UserDTO dto, int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return dao.search(dto, pageNo, pageSize);
	}

}
