package com.elympics.bean;

import java.util.List;

import com.elympics.manager.UserManager;

public class UserManagerTest {
	public static void main(String[] args) {
		UserManager manager = new UserManager();
		Gioco g = new Gioco();
		g.setId(2);
		User u = new User();
		u.setId(5);
		List<RigaClassifica> classifica = manager.getListaPrimiTre(u, g);
		for(RigaClassifica riga: classifica) {
			System.out.println(riga);
			
		}
		List<RigaClassifica> classifica2 = manager.getClassificaCompleta(g);
		for(RigaClassifica riga: classifica2) {
			System.out.println(riga);
			
		}
	}
}
