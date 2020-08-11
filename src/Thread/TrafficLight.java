package Thread;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TrafficLight extends JFrame implements Runnable

 {

JButton red, green, yellow ;

TrafficLight()

 {

  setTitle("TrafficLight") ;

  setSize(500,500) ;

  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  red = new JButton() ;

  yellow = new JButton() ;

  green = new JButton() ;

  setLayout(new GridLayout(3,1));

  this.add(red); this.add(yellow); this.add(green) ;

  Thread t = new Thread(this) ;

  t.start();

 }

public void run()

 {

  while(true)

   {

    Thread turnRed = new Thread(new TurnRed());

    turnRed.start() ;

    synchronized(turnRed)

     {

      try { turnRed.wait() ; } catch(InterruptedException e) {}

     }

    Thread turnYellow = new Thread(new TurnYellow());

    turnYellow.start() ;

    synchronized(turnYellow)

     {

      try { turnYellow.wait() ; } catch(InterruptedException e) {}

     }

    Thread turnGreen = new Thread(new TurnGreen());

    turnGreen.start() ;

    synchronized(turnGreen)

     {

      try { turnGreen.wait() ; } catch(InterruptedException e) {}

     }

   }

 }

public static void main(String[] args)

 {

  new TrafficLight().setVisible(true);

 }

class TurnRed implements Runnable

 {

  public void run()

   {

    synchronized(this) {

    green.setBackground(Color.WHITE) ;

    red.setBackground(Color.RED) ;

    try { Thread.sleep(1000); } catch(InterruptedException e) {}

    notify(); }

   }

 }

class TurnYellow implements Runnable

 {

  public void run()

   {

    synchronized(this) {

    red.setBackground(Color.WHITE) ;

    yellow.setBackground(Color.YELLOW) ;

    try { Thread.sleep(1000); } catch(InterruptedException e) {}

    notify(); }

   }

 }

class TurnGreen implements Runnable

 {

  public void run()

   {

    synchronized(this) {

    yellow.setBackground(Color.WHITE) ;

    green.setBackground(Color.GREEN) ;

    try { Thread.sleep(1000); } catch(InterruptedException e) {}

    notify(); }

   }

 }

 }
