/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Wein
 */
public class Player {
    String name,time;
    int timer;
 //Constructor
 public Player(String name,String time,int timer){
 this.name = name;
 this.time = time;
 this.timer = timer;

 }

 //getters
 public String getName(){
 return this.name;
 }
 public String getTime(){
 return this.time;
 }
 public int getTimer(){
 return this.timer;
 }

}

