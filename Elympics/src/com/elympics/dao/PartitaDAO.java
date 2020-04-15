package com.elympics.dao;

import java.util.List;

import com.elympics.bean.Gioco;
import com.elympics.bean.Partita;
import com.elympics.bean.RigaClassifica;

public interface PartitaDAO {
	public List<Partita> getAll() throws Exception ;

	public List<RigaClassifica> getClassifica(Gioco gioco);
	
	public void crea(Partita partita) throws Exception;
}
