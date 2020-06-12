package com.littletennis;

import java.applet.Applet;
import java.applet.AudioClip;

/**clase Music
 * define las canciones colectadas en la clase SoundTrack como audioclips usables en la m�quina java
 * @author Gordo_0195
 * */
public class Music {
	/**
	 * se definen las canciones como variables est�ticas dada su naturaleza
	 * */
	public static final AudioClip SoundTrack = Applet.newAudioClip(Music.class.getResource("track.wav"));
	public static final AudioClip Over = Applet.newAudioClip(Music.class.getResource("GameOver.wav"));
	public static final AudioClip Poing = Applet.newAudioClip(Music.class.getResource("poing.wav"));
}
