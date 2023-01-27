/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThreeStack;

/**
 * La classe StackPerso implémente une pile FILO
 avec comme seule structure de données un tableau de chaînes de caractères
 * @author lara VISEUR - date : janvier 2023
 */
public class StackPerso {
    /**
     * Une Pile (est donc StackPerso) est définie par un sommet et un corps
     * le corps de la pile est ici un tableau de chaînes de carctères
     */
    private String[] stack;
    private  int sommet;
    
    /**
     * stack1, stack2 et stack3 sont des tableaux de taille non dynamique
     * On leur définie respectivement une taille maximum de 20 chaînes de carctères
     */
    private final static int TAILLE = 20;

    /**
     * Constructeur par défaut de la classe StackPerso qui initialize le corps et le sommet de la pile
     */
    public StackPerso() {
        this.stack = new String[TAILLE];
        this.sommet = -1;
    }
    
    /**
     * La méthode push ajoute une chaîne de caractère au sommet de la pile si elle n'est pas pleine
     * chaîne : la chaîne de caractère que l'on souhaite ajouter
     */
    public void push(String chaine) throws Exception{
        if(this.sommet+1 == TAILLE) //la pile est pleine et ne peut plus accueillir de nouvelle chaîne
            throw new Exception();

        else
        {
            this.sommet ++;
            this.stack[this.sommet] = chaine;
        }
    }
    
    /**
     * La méthode pop retire la chaîne de caractère au sommet de la pile si elle n'est pas vide
     */
    public String pop() throws Exception{
        if(this.sommet == -1) //la pile est vide, impossible d'enlever quoi que ce soit
            throw new Exception();
        
        else
        {
            String dernier = this.stack[this.sommet];
            this.sommet --;
            return dernier;
            
        }
    }
    
    
    @Override
    public String toString() {
        String str = "\n";
        for (int i=0; i <= this.sommet; i++)
        {
            str += this.stack[i];
            str += "\n";
        }
        return str;
    }
}
