package com.elympics.bean;

import com.elympics.manager.UserManager;

public class UserManagerTest {
	//problema conflitto
	public static void main(String[] args) {
		UserManager manager = new UserManager();
		Gioco g = new Gioco();
		g.setId(1);
		User u = new User();
		u.setId(1);
		manager.getListaPrimiTre(u, g);
	}
}
