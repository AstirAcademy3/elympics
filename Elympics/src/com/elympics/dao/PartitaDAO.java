package com.elympics.dao;

import java.util.List;

import com.elympics.bean.Gioco;
import com.elympics.bean.Partita;
import com.elympics.bean.RigaClassifica;
import com.elympics.bean.User;

public interface PartitaDAO {
	public List<Partita> getAll() throws Exception ;

	public List<RigaClassifica> getClassifica(Gioco gioco);
	
	public void crea(Partita partita) throws Exception;

	public List<RigaClassifica> getClassificaPerPaese(User user, Gioco gioco);
	
	public void delete(Partita partita) throws Exception;

	public List<RigaClassifica> getGiochiPartitaPerPaese(User u);
}
