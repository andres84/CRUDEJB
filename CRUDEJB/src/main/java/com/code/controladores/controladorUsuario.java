/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.code.controladores;

import com.code.ejb.UsuarioFacade;
import com.code.modelo.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

/**
 *
 * @author sil
 */
@ManagedBean
@ViewScoped
public class controladorUsuario implements Serializable{

    @EJB
    private UsuarioFacade usuariofacade;
    //private Usuario usuario = new Usuario();
    @Inject
    private Usuario usuario;
    
    public String eliminar(Usuario usuario){
        
        this.usuariofacade.remove(usuario);
        
        return "index";
        
    }
    
    public String crearUsuario(){
        
        this.usuariofacade.create(usuario);
        return "index";
        
    }
    
    public List<Usuario> listarUsuario(){
        
        return this.usuariofacade.findAll();
        
    }
    
    public controladorUsuario() {
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
