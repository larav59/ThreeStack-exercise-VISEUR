package ThreeStack;

/**
 * La classe ThreeStack implémente 3 piles FILO
 * avec comme seule structure de données un tableau de chaînes de caractères
 * @author lara VISEUR - date : janvier 2023
 */
public class ThreeStack {
    /**
     * stack1, stack2 et stack3 sont de classe StackPerso
     * ils ont le même comportement que des piles (FILO)
     */
    private StackPerso stack1;
    private StackPerso stack2;
    private StackPerso stack3;

    /**
     * Constructeur par défaut de la classe ThreeStack qui initialize les 3 piles
     */
    public ThreeStack() {
        this.stack1 = new StackPerso();
        this.stack2 = new StackPerso();
        this.stack3 = new StackPerso();
    }
    
    /**
     * La méthode push ajoute une chaîne de caractère au sommet d'une pile si elle n'est pas pleine
     * stack : le numéro de la pile choisie pour l'ajout (doit être soit 1, soit 2, soit 3 puisqu'il n'y a que 3 piles)
     * chaîne : la chaîne de caractère que l'on souhaite ajouter
     */
    private void push(Integer stack, String chaine)  throws Exception { 
        
        if(stack < 1 || stack > 3) //Si le paramètre stack est incorrect, on lève une exception
            throw new Exception();
        
        else
        {
            try{
                switch(stack)
                {
                    case 1: 
                        this.stack1.push(chaine);
                        break;

                    case 2: 
                        this.stack2.push(chaine);
                        break;

                    case 3: 
                        this.stack3.push(chaine);
                        break;
                }
            }
            catch(Exception e){
                System.err.println("\n Pile " + stack + " Pleine ! Ajout impossible. \n");
            }
        }
    }

    /**
     * La méthode pop retire la chaîne de caractère au sommet d'une pile si elle n'est pas vide
     * stack : le numéro de la pile choisie pour l'ajout (doit être soit 1, soit 2, soit 3 puisqu'il n'y a que 3 piles)
     */
    private String pop(Integer stack)  throws Exception { 
        
        if(stack < 1 || stack > 3) //Si le paramètre stack est incorrect, on lève une exception
            throw new Exception();

        else
        {
            try{
                switch(stack)
                {
                    case 1: 
                        return (this.stack1.pop());

                    case 2: 
                        return (this.stack2.pop());

                    case 3: 
                        return (this.stack3.pop());
                }
            }
            catch(Exception e){
                System.err.println("\n Pile " + stack +" Vide ! Retrait impossible.\n");
            }
        }
        return "";
    }
    
    
    @Override
    public String toString() {
        return "ThreeStack{ \n stack1 = " + stack1.toString() + "\n stack2 = " 
                + stack2.toString() + "\n stack3 = " + stack3.toString() + '}';
    }

    
    /**
     * Méthode principale de cette épreuve technique
     * Elle est appélée à l'éxécution du projet/fichier
     */
    public static void main(String[] args) {
        ThreeStack threeStack = new ThreeStack();
        
        try{
            threeStack.push(1, "{name:\"object1\"}");
            threeStack.push(1, "{name:\"object2\"}");
            threeStack.push(2, "{name:\"object3\"}");
            threeStack.push(2, "{name:\"object4\"}");
            threeStack.push(2, "{name:\"object5\"}");
            threeStack.push(3, "{name:\"object6\"}");
            threeStack.push(3, "{name:\"object7\"}");
            
            System.out.println(threeStack + "\n");
            
            System.out.println((threeStack.pop(2))); // display {name:"object5"}
            System.out.println((threeStack.pop(2))); // display {name:"object4"}
            System.out.println((threeStack.pop(1))); // display {name:"object2"}
            System.out.println((threeStack.pop(1))); // display {name:"object1"}
            System.out.println((threeStack.pop(3))); // display {name:"object7"}
            System.out.println((threeStack.pop(1))); // throw Exception
            System.out.println((threeStack.pop(4))); // throw Exception
            
        }
        catch(Exception e){
            System.err.println("\n La pile choisie n'exite pas !\n");
        }
    }
    
}
