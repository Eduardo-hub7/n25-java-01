import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta é uma classe que representará uma Abelha.
 * 
 * @author Gabriel Eduardo
 * @version 2025-06-04
 */
public class Abelha extends Actor
{
    /**
     * Act - do whatever the Abelha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(1);
        if(Greenfoot.isKeyDown("Left")){
            turn(-5);
        
        }
        if(Greenfoot.isKeyDown("right")){
           turn(5); 
        }
        verificarPosicao();
    }
    /**
     * Método que verifica posição da Abelha.
     */
    public void verificarPosicao(){
        if(estaNoTopo()){
           setLocation(getX(), getWorld().getHeight()-10); 
        }
        if(estaNaBase()){
           setLocation(getX(), 10); 
        }
        if(estaNaDireita()){
           setLocation(10, getY());
        }
        if(estaNaEsquerda()){
           setLocation(getWorld().getWidth()-10, getY()); 
        }
    }
    /**
     * Método que verifica se a abelha está no topo
     */
    public boolean estaNoTopo(){
       if(getY()<10){
          return true; 
       } else{
           return false;
       }
    }
    /**
     * Método que verifica se a abelha está na Base
     */
    public boolean estaNaBase(){
        return getY()>getWorld().getHeight()-10;
    }
    /**
     * Método que verifica se a abelha está na Esquerda
     */
    public boolean estaNaEsquerda(){
        return getX()<-10;
    }
    /**
     * Método que verifica se a abelha está na Direita
     */
    public boolean estaNaDireita(){
        return getX()>getWorld().getWidth()-10;
    }
}
