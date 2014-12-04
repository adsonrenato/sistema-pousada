/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

/**
 *
 * @author qualidade-2
 * @param <T>
 */
public interface InterfaceDao<T> {
    
  public boolean salvar(T bean);

    public boolean alterar(T bean);

    public List<T> buscar(String nome);

    public T buscar(int id);

    public T excluir(T bean);
}
