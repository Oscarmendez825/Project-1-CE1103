
package com.Player;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class GameUser {
    
    private static String name1;
    private static String name2;
    private static String name3;
    private static String name4;
    private static int cantidad;
    public static String personaje1;
    public static String personaje2;
    public static String personaje3;
    public static String personaje4;

    private JLabel p1;
    private JLabel p2;
    private JLabel p3;
    private JLabel p4;

    public GameUser(JLabel p1, JLabel p2, JLabel p3, JLabel p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        personajeIcon();
    }

    private void personajeIcon(){
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
                switch (personaje4) {
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

    public static String getName1() {
        return name1;
    }

    public static void setName1(String name1) {
        GameUser.name1 = name1;
    }

    public static String getName2() {
        return name2;
    }

    public static void setName2(String name2) {
        GameUser.name2 = name2;
    }

    public static String getName3() {
        return name3;
    }

    public static void setName3(String name3) {
        GameUser.name3 = name3;
    }

    public static String getName4() {
        return name4;
    }

    public static void setName4(String name4) {
        GameUser.name4 = name4;
    }

    public static int getCantidad() {
        return cantidad;
    }

    public static void setCantidad(int cantidad) {
        GameUser.cantidad = cantidad;
    }
    
}
    
    
    
    


