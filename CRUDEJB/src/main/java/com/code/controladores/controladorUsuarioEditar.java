/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.code.controladores;


import com.code.ejb.UsuarioFacade;
import com.code.modelo.Usuario;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

/**
 *
 * @author sil
 */
@ManagedBean
@SessionScoped
public class controladorUsuarioEditar implements Serializable {

   @EJB
   private UsuarioFacade usuariofacade; 
   //private Usuario usuario = new Usuario(); 
   @Inject 
   private Usuario usuario;
    
   public String editarUsuario(Usuario usuario){
       
       this.usuario = usuario;
       return "edicionUsuarios";
       
   }
   
   public String editarUsuario(){
       
       this.usuariofacade.edit(usuario);
       return "index";
       
   }
    
    public controladorUsuarioEditar() {
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
