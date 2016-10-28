package org.yangjie.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	/**
	 * 登录
	 * @author YangJie [2016年10月28日 下午2:17:58]
	 * @param username
	 * @param password
	 * @return
	 */
	public boolean login(String username, String password) {
		if ("1".equals(username) && "1".equals(password)) {
			return true;
		}
		return false;
	}
	
}
