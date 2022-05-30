import java.util.Scanner;

class BMExercicio07{  
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x; 
        int y;
            
        System.out.println("Informe um valor para x: ");
        x = input.nextInt();
        
        do{
            
            if(x % 2 == 0){
                y = x / 2;
            }else{
                y = 3 * x + 1;
            }
            
            if(y != 1){
                System.out.print(y + " -> ");
            }else{
                System.out.print(y);
            }
            
            x = y;
            
        }while(y != 1);
    }
}
