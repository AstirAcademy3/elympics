package com.elympics.manager;

import java.util.Collection;

import com.elympics.bean.RigaMedagliereVO;

public class UserManagerTest {

	public static void main(String[] args) {
		ClassificaManager cManager=new ClassificaManager();
		Collection<RigaMedagliereVO> medagliere = cManager.getMedagliere();
		for(RigaMedagliereVO r : medagliere) {
			System.out.println(r);
		}
	}

}
