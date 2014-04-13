package com.dtr.oas.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dtr.oas.dao.UserDAO;
import com.dtr.oas.dao.UserNotFoundException;
import com.dtr.oas.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
    @Autowired
    private UserDAO userDAO;

	@Override
	public void addUser(User user) {
		userDAO.addUser(user);
	}

    @Override
    public User getUser(int userId) throws UserNotFoundException {
        return userDAO.getUser(userId);
    }

	@Override
	public User getUser(String username) throws UserNotFoundException {
		return userDAO.getUser(username);
	}

	@Override
	public void updateUser(User user) throws UserNotFoundException {
		userDAO.updateUser(user);
	}

	@Override
	public void deleteUser(int userId) throws UserNotFoundException {
		userDAO.deleteUser(userId);
	}

	@Override
	public List<User> getUsers() {
		return userDAO.getUsers();
	}
	
	//TODO Dummy role added temporarily until next example
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		try {
		    Collection<GrantedAuthority> authorities = new ArrayList<>();
		    SimpleGrantedAuthority authority = new SimpleGrantedAuthority("ROLE_ADMIN");
		    authorities.add(authority);

		    User userObject = getUser(username);
		    userObject.setAuthorities(authorities);
		    return userObject;
		} catch (UserNotFoundException e) {
			throw new UsernameNotFoundException(e.getMessage());
		}
	}
}
