package br.com.classificados.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.classificados.entidade.Secao;

public class SecaoDao extends Conexao {
	public List<Secao> listar (){
		List<Secao> lista = new ArrayList<Secao>();
		
		String sql = "select * from secao";
		
		try {
			PreparedStatement ps = getConexao()
					.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			Secao secao;
			while (rs.next()) {
				secao = new Secao();
				secao.setId(rs.getInt("idsecao"));
				secao.setDescricao(rs.getString("descricao"));
				
				lista.add(secao);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return lista;
	}

	public void incluir(Secao secao) {
		String sql = "insert into secao "
				+ " (descricao) values (?) ";
	
		try {
			PreparedStatement ps = getConexao()
					.prepareStatement(sql);
			ps.setString(1, secao.getDescricao());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
}
