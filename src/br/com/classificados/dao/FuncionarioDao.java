package br.com.classificados.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.classificados.entidade.Funcionario;

public class FuncionarioDao extends Conexao {

	public Funcionario buscar (String login, String senha) {
		String sql = "select * from Funcionario where cpf = ? and senha = ?";
		Funcionario func = null;
		try {
			PreparedStatement ps = getConexao().prepareStatement(sql);
			ps.setString(1, login);
			ps.setString(2, senha);
			
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				func = new Funcionario();
				func.setId(rs.getInt("idfuncionario"));
				func.setNome(rs.getString("nome"));
				func.setCpf(rs.getString("cpf"));
				func.setCargo(rs.getString("cargo"));
				func.setSenha(rs.getString("senha"));
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return func;
	}
}
