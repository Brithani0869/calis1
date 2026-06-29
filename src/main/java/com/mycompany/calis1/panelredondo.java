package com.mycompany.calis1;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;
import java.awt.Image;

public class panelredondo extends JPanel {
    
    public panelredondo() {
        // Hace transparente el cuadrado exterior para que solo se vea el círculo
        setOpaque(false); 
    }
    // Variable para almacenar la imagen del logo
    private Image imagen;
    
    
    
    // Método para asignar la imagen desde la ventana de iniciar_sesion
    public void setImage(Image imagen) {
        this.imagen = imagen;
        this.repaint(); // Fuerza al panel a redibujarse con la nueva imagen
    }

    @Override
    protected void paintComponent(Graphics g) {
        // CORRECCIÓN: super siempre va en la primera línea
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        int diametro = Math.min(getWidth(), getHeight());
        int x = (getWidth() - diametro) / 2;
        int y = (getHeight() - diametro) / 2;
        
        // Dibuja el fondo del círculo (puedes cambiarlo a Color.WHITE o al rosa que tenías)
        g2.setColor(new Color(245, 171, 185)); 
        g2.fillOval(x, y, diametro, diametro);

        // SI HAY UNA IMAGEN ASIGNADA, LA RECORTA Y DIBUJA
        if (imagen != null) {
            java.awt.Shape clipOriginal = g2.getClip();
            
            Ellipse2D.Double circuloRecorte = new Ellipse2D.Double(x, y, diametro, diametro);
            g2.setClip(circuloRecorte);
            
            // Dibuja la imagen estirándose/adaptándose al diámetro del panel
            g2.drawImage(imagen, x, y, diametro, diametro, this);
            
            g2.setClip(clipOriginal);
        }
    }
}