package com.elympics.dao;

import java.util.List;

import com.elympics.bean.Gioco;

public interface GiocoDAO {
public List<Gioco> getAll();

public Gioco get(int id);
}
