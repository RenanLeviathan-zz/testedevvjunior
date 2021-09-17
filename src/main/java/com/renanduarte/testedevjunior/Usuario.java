package com.renanduarte.testedevjunior;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Renan Duarte
 */
@Document(collection="desafio-dev")
public class Usuario {
    
    @Id
    public String id;
    public String nome;
    public String email;
    public String telefone;
    
    public Usuario(){}
    
    public Usuario(String nome, String email, String telefone){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    
    @Override
  public String toString() {
    return String.format(
        "Usuário:\nid=%s, Nome='%s', Email='%s', Telefone='%s'",
        id, nome, email, telefone);
  }
}
