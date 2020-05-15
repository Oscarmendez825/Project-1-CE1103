
package com.Player;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class GameUser {
    
    public static String name1;
    public static String name2;
    public static String name3;
    public static String name4;
    public static int cantidad;
    public static String personaje1;
    public static String personaje2;
    public static String personaje3;
    public static String personaje4;

    JLabel p1;
    JLabel p2;
    JLabel p3;
    JLabel p4;

    public GameUser(JLabel p1, JLabel p2, JLabel p3, JLabel p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        personajeIcon();
    }

    public void personajeIcon(){
        switch (cantidad) {
            case 2:
                switch (personaje1) {
                    case "Halo":
                    {
                        ImageIcon j1 = new ImageIcon("halo.png");
                        Icon icon1 = new ImageIcon(j1.getImage().getScaledInstance(p1.getWidth(), p1.getHeight(), Image.SCALE_DEFAULT));
                        p1.setIcon(icon1);
                        break;
                    }
                    case "Goku":
                    {
                        ImageIcon j1 = new ImageIcon("goku.png");
                        Icon icon1 = new ImageIcon(j1.getImage().getScaledInstance(p1.getWidth(), p1.getHeight(), Image.SCALE_DEFAULT));
                        p1.setIcon(icon1);
                        break;
                    }
                    case "Mazinger":
                    {
                        ImageIcon j1 = new ImageIcon("mazinger.png");
                        Icon icon1 = new ImageIcon(j1.getImage().getScaledInstance(p1.getWidth(), p1.getHeight(), Image.SCALE_DEFAULT));
                        p1.setIcon(icon1);
                        break;
                    }
                    case "Crash":
                    {
                        ImageIcon j1 = new ImageIcon("crash.png");
                        Icon icon1 = new ImageIcon(j1.getImage().getScaledInstance(p1.getWidth(), p1.getHeight(), Image.SCALE_DEFAULT));
                        p1.setIcon(icon1);
                        break;
                    }
                    default:
                        break;
                }
                switch (personaje2) {
                    case "Halo":
                    {
                        ImageIcon j2 = new ImageIcon("halo.png");
                        Icon icon2= new ImageIcon(j2.getImage().getScaledInstance(p2.getWidth(), p2.getHeight(), Image.SCALE_DEFAULT));
                        p2.setIcon(icon2);
                        break;
                    }
                    case "Goku":
                    {
                        ImageIcon j2 = new ImageIcon("goku.png");
                        Icon icon2 = new ImageIcon(j2.getImage().getScaledInstance(p2.getWidth(), p2.getHeight(), Image.SCALE_DEFAULT));
                        p2.setIcon(icon2);
                        break;
                    }
                    case "Mazinger":
                    {
                        ImageIcon j2 = new ImageIcon("mazinger.png");
                        Icon icon2 = new ImageIcon(j2.getImage().getScaledInstance(p2.getWidth(), p2.getHeight(), Image.SCALE_DEFAULT));
                        p2.setIcon(icon2);
                        break;
                    }
                    case "Crash":
                    {
                        ImageIcon j2 = new ImageIcon("crash.png");
                        Icon icon2 = new ImageIcon(j2.getImage().getScaledInstance(p2.getWidth(), p2.getHeight(), Image.SCALE_DEFAULT));
                        p2.setIcon(icon2);
                        break;
                    }
                    default:
                        break;
                }
                break;
            case 3:
                switch (personaje1) {
                    case "Halo":
                    {
                        ImageIcon j1 = new ImageIcon("halo.png");
                        Icon icon1 = new ImageIcon(j1.getImage().getScaledInstance(p1.getWidth(), p1.getHeight(), Image.SCALE_DEFAULT));
                        p1.setIcon(icon1);
                        break;
                    }
                    case "Goku":
                    {
                        ImageIcon j1 = new ImageIcon("goku.png");
                        Icon icon1 = new ImageIcon(j1.getImage().getScaledInstance(p1.getWidth(), p1.getHeight(), Image.SCALE_DEFAULT));
                        p1.setIcon(icon1);
                        break;
                    }
                    case "Mazinger":
                    {
                        ImageIcon j1 = new ImageIcon("mazinger.png");
                        Icon icon1 = new ImageIcon(j1.getImage().getScaledInstance(p1.getWidth(), p1.getHeight(), Image.SCALE_DEFAULT));
                        p1.setIcon(icon1);
                        break;
                    }
                    case "Crash":
                    {
                        ImageIcon j1 = new ImageIcon("crash.png");
                        Icon icon1 = new ImageIcon(j1.getImage().getScaledInstance(p1.getWidth(), p1.getHeight(), Image.SCALE_DEFAULT));
                        p1.setIcon(icon1);
                        break;
                    }
                    default:
                        break;
                }
                switch (personaje2) {
                    case "Halo":
                    {
                        ImageIcon j2 = new ImageIcon("halo.png");
                        Icon icon2= new ImageIcon(j2.getImage().getScaledInstance(p2.getWidth(), p2.getHeight(), Image.SCALE_DEFAULT));
                        p2.setIcon(icon2);
                        break;
                    }
                    case "Goku":
                    {
                        ImageIcon j2 = new ImageIcon("goku.png");
                        Icon icon2 = new ImageIcon(j2.getImage().getScaledInstance(p2.getWidth(), p2.getHeight(), Image.SCALE_DEFAULT));
                        p2.setIcon(icon2);
                        break;
                    }
                    case "Mazinger":
                    {
                        ImageIcon j2 = new ImageIcon("mazinger.png");
                        Icon icon2 = new ImageIcon(j2.getImage().getScaledInstance(p2.getWidth(), p2.getHeight(), Image.SCALE_DEFAULT));
                        p2.setIcon(icon2);
                        break;
                    }
                    case "Crash":
                    {
                        ImageIcon j2 = new ImageIcon("crash.png");
                        Icon icon2 = new ImageIcon(j2.getImage().getScaledInstance(p2.getWidth(), p2.getHeight(), Image.SCALE_DEFAULT));
                        p2.setIcon(icon2);
                        break;
                    }
                    default:
                        break;
                }
                switch (personaje3) {
                    case "Halo":
                    {
                        ImageIcon j3 = new ImageIcon("halo.png");
                        Icon icon3= new ImageIcon(j3.getImage().getScaledInstance(p3.getWidth(), p3.getHeight(), Image.SCALE_DEFAULT));
                        p3.setIcon(icon3);
                        break;
                    }
                    case "Goku":
                    {
                        ImageIcon j3 = new ImageIcon("goku.png");
                        Icon icon3 = new ImageIcon(j3.getImage().getScaledInstance(p3.getWidth(), p3.getHeight(), Image.SCALE_DEFAULT));
                        p3.setIcon(icon3);
                        break;
                    }
                    case "Mazinger":
                    {
                        ImageIcon j3 = new ImageIcon("mazinger.png");
                        Icon icon3 = new ImageIcon(j3.getImage().getScaledInstance(p3.getWidth(), p3.getHeight(), Image.SCALE_DEFAULT));
                        p3.setIcon(icon3);
                        break;
                    }
                    case "Crash":
                    {
                        ImageIcon j3 = new ImageIcon("crash.png");
                        Icon icon3 = new ImageIcon(j3.getImage().getScaledInstance(p3.getWidth(), p3.getHeight(), Image.SCALE_DEFAULT));
                        p3.setIcon(icon3);
                        break;
                    }
                    default:
                        break;
                }
                break;
            default:
                switch (personaje1) {
                    case "Halo":
                    {
                        ImageIcon j1 = new ImageIcon("halo.png");
                        Icon icon1 = new ImageIcon(j1.getImage().getScaledInstance(p1.getWidth(), p1.getHeight(), Image.SCALE_DEFAULT));
                        p1.setIcon(icon1);
                        break;
                    }
                    case "Goku":
                    {
                        ImageIcon j1 = new ImageIcon("goku.png");
                        Icon icon1 = new ImageIcon(j1.getImage().getScaledInstance(p1.getWidth(), p1.getHeight(), Image.SCALE_DEFAULT));
                        p1.setIcon(icon1);
                        break;
                    }
                    case "Mazinger":
                    {
                        ImageIcon j1 = new ImageIcon("mazinger.png");
                        Icon icon1 = new ImageIcon(j1.getImage().getScaledInstance(p1.getWidth(), p1.getHeight(), Image.SCALE_DEFAULT));
                        p1.setIcon(icon1);
                        break;
                    }
                    case "Crash":
                    {
                        ImageIcon j1 = new ImageIcon("crash.png");
                        Icon icon1 = new ImageIcon(j1.getImage().getScaledInstance(p1.getWidth(), p1.getHeight(), Image.SCALE_DEFAULT));
                        p1.setIcon(icon1);
                        break;
                    }
                    default:
                        break;
                }
                switch (personaje2) {
                    case "Halo":
                    {
                        ImageIcon j2 = new ImageIcon("halo.png");
                        Icon icon2= new ImageIcon(j2.getImage().getScaledInstance(p2.getWidth(), p2.getHeight(), Image.SCALE_DEFAULT));
                        p2.setIcon(icon2);
                        break;
                    }
                    case "Goku":
                    {
                        ImageIcon j2 = new ImageIcon("goku.png");
                        Icon icon2 = new ImageIcon(j2.getImage().getScaledInstance(p2.getWidth(), p2.getHeight(), Image.SCALE_DEFAULT));
                        p2.setIcon(icon2);
                        break;
                    }
                    case "Mazinger":
                    {
                        ImageIcon j2 = new ImageIcon("mazinger.png");
                        Icon icon2 = new ImageIcon(j2.getImage().getScaledInstance(p2.getWidth(), p2.getHeight(), Image.SCALE_DEFAULT));
                        p2.setIcon(icon2);
                        break;
                    }
                    case "Crash":
                    {
                        ImageIcon j2 = new ImageIcon("crash.png");
                        Icon icon2 = new ImageIcon(j2.getImage().getScaledInstance(p2.getWidth(), p2.getHeight(), Image.SCALE_DEFAULT));
                        p2.setIcon(icon2);
                        break;
                    }
                    default:
                        break;
                }
                switch (personaje3) {
                    case "Halo":
                    {
                        ImageIcon j3 = new ImageIcon("halo.png");
                        Icon icon3= new ImageIcon(j3.getImage().getScaledInstance(p3.getWidth(), p3.getHeight(), Image.SCALE_DEFAULT));
                        p3.setIcon(icon3);
                        break;
                    }
                    case "Goku":
                    {
                        ImageIcon j3 = new ImageIcon("goku.png");
                        Icon icon3 = new ImageIcon(j3.getImage().getScaledInstance(p3.getWidth(), p3.getHeight(), Image.SCALE_DEFAULT));
                        p3.setIcon(icon3);
                        break;
                    }
                    case "Mazinger":
                    {
                        ImageIcon j3 = new ImageIcon("mazinger.png");
                        Icon icon3 = new ImageIcon(j3.getImage().getScaledInstance(p3.getWidth(), p3.getHeight(), Image.SCALE_DEFAULT));
                        p3.setIcon(icon3);
                        break;
                    }
                    case "Crash":
                    {
                        ImageIcon j3 = new ImageIcon("crash.png");
                        Icon icon3 = new ImageIcon(j3.getImage().getScaledInstance(p3.getWidth(), p3.getHeight(), Image.SCALE_DEFAULT));
                        p3.setIcon(icon3);
                        break;
                    }
                    default:
                        break;
                }
                switch (personaje3) {
                    case "Halo":
                    {
                        ImageIcon j4 = new ImageIcon("halo.png");
                        Icon icon4 = new ImageIcon(j4.getImage().getScaledInstance(p4.getWidth(), p4.getHeight(), Image.SCALE_DEFAULT));
                        p4.setIcon(icon4);
                        break;
                    }
                    case "Goku":
                    {
                        ImageIcon j4 = new ImageIcon("goku.png");
                        Icon icon4 = new ImageIcon(j4.getImage().getScaledInstance(p4.getWidth(), p4.getHeight(), Image.SCALE_DEFAULT));
                        p4.setIcon(icon4);
                        break;
                    }
                    case "Mazinger":
                    {
                        ImageIcon j4 = new ImageIcon("mazinger.png");
                        Icon icon4 = new ImageIcon(j4.getImage().getScaledInstance(p4.getWidth(), p4.getHeight(), Image.SCALE_DEFAULT));
                        p4.setIcon(icon4);
                        break;
                    }
                    case "Crash":
                    {
                        ImageIcon j4 = new ImageIcon("crash.png");
                        Icon icon4 = new ImageIcon(j4.getImage().getScaledInstance(p4.getWidth(), p4.getHeight(), Image.SCALE_DEFAULT));
                        p4.setIcon(icon4);
                        break;
                    }
                    default:
                        break;
                }
                break;
        }
    }
}
    
    
    
    


