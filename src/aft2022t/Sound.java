/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aft2022t;

import java.io.File; 
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
/**
 *
 * @author Fábián Levente
 */
public class Sound {
    private static FloatControl gainControl;
    private static float decibel=0.0f;
    
    public static float getdec(){
        return decibel;
    }
    public static void setdec(float dec){
        decibel = dec;
    }
    public static void rolldice(){
        try //playing the music
        {
    String soundName = ".\\src\\aft2022t\\sound\\rolldice.wav";    
    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
    gainControl.setValue(decibel);
    clip.start(); //start to play the clip
        } 
    catch (Exception e) 
    {
    //Do stuff in case of an exception, for example, file not found
    }
        
    }
    public static void bigger_sound(){
        try //playing the music
        {
    String soundName = ".\\src\\aft2022t\\sound\\win_sound.wav";    
    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
    gainControl.setValue(decibel);
    clip.start(); //start to play the clip
        } 
    catch (Exception e) 
    {
    //Do stuff in case of an exception, for example, file not found
    }
        
    }
    public static void same_sound(){
        try //playing the music
        {
    String soundName = ".\\src\\aft2022t\\sound\\same_sound.wav";    
    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
    gainControl.setValue(decibel);
    clip.start(); //start to play the clip
        } 
    catch (Exception e) 
    {
    //Do stuff in case of an exception, for example, file not found
    }
        
    }
    public static void small_sound(){
        try //playing the music
        {
    String soundName = ".\\src\\aft2022t\\sound\\lose_sound.wav";    
    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
    gainControl.setValue(decibel);
    clip.start(); //start to play the clip
        } 
    catch (Exception e) 
    {
    //Do stuff in case of an exception, for example, file not found
    }
        
    }
    
}
