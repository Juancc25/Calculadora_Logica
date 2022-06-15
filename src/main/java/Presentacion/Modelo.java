package Presentacion;

import java.awt.CardLayout;

public class Modelo {
    private VistaPrincipal ventanaInicial;
    
    public void iniciar(){
        getVentanaInicial().setVisible(true);
        getVentanaInicial().getPanelTabla().setVisible(false);
    }
    
    public void cambiarVista(String nombreVista){        
        CardLayout cl = (CardLayout) ventanaInicial.getContentPane().getLayout();        
        cl.show(ventanaInicial.getContentPane(), nombreVista);        
    }
    
    public VistaPrincipal getVentanaInicial(){
        if(ventanaInicial == null){
            ventanaInicial = new VistaPrincipal(this);
        }
        return ventanaInicial;
    }
}
