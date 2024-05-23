package com.rays.service;

import java.util.List;

import com.rays.dto.UserDTO;

public interface UserServiceInt {

	public long add(UserDTO dto);

	public void update(UserDTO dto);

	public void delete(long id);

	public UserDTO findByLogin(String login);

	public UserDTO findbyPk(long pk);

	public UserDTO authenticate(String login, String password);

	public List search(UserDTO dto);

	public List search(UserDTO dto, int pageNo, int pageSize);

}
