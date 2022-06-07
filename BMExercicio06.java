import java.util.*;

class BMExercicio06{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int numero;
        
        
        
        
        do{
            System.out.print("Informe um numero de 1 a 7: ");
            numero = input.nextInt();
            
            
            
            
            
            switch (numero){
                case 0:
                    continue;
                case 1:
                    System.out.print("Domingo\n");
                    break;
                case 2:
                    System.out.print("Segunda-feira\n");
                    break;
                case 3:
                    System.out.print("Terca-feira\n");
                    break;
                case 4:
                    System.out.print("Quarta-feira\n");
                    break;
                case 5:
                    System.out.print("Quinta-feira\n");
                    break;
                case 6:
                    System.out.print("Sexta-feira\n");
                    break;
                case 7:
                    System.out.print("Sabado\n");
                    break;
                default:
                    System.out.print("Valor Inválido.\n");
            }
            
        }while(numero != 0);
        
        
    }
}
