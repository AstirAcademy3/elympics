package com.elympics.manager;

import java.util.Collections;
import java.util.Date;
import java.util.List;


import com.elympics.bean.User;
import com.elympics.bean.*;
import com.elympics.dao.UserDAO;
import com.elympics.dao.UserFileDAO;
import com.elympics.dao.UserHBDAO;
import com.google.common.collect.Lists;



public class UserManager {
	
	public void cancellaIscrizione(User user) throws Exception {
		UserDAO dao= new UserHBDAO();
		user.setEliminazione(new Date());
		dao.modifica(user);
	}
}