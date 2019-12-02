package br.ufsc.ine5608.model;

import br.ufsc.ine5608.rede.AtorNetgames;
import br.ufsc.inf.leobr.cliente.Proxy;
import java.util.ArrayList;

public class Player {
	
    private String name;
    private int coins;
    private Itens itens;

    public Player() {
        itens = new Itens();
    }
    
    //getters and setters

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Itens getItens() {
        return itens;
    }

    public void setItens(Itens itens) {
        this.itens = itens;
    }
    
    //Player methods
    public void addCoins(int num){
        this.coins += num;
    }
    
    public void removeCoins(int num){
        this.coins -= num;
    }
    
    public int getYellowCardsNumber(){
        return 0;
    }
    
    public void setWonders(ArrayList wonders){
        
    }
    
    public ArrayList getAgeCards(){
        return new ArrayList();
    }
    
    public void addAgeCard(AgeCard ageCard){
        
    }
    
    

}
