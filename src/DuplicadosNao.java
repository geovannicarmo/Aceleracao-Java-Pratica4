public class  DuplicadosNao{
    String[] array1 ={"maca", "banana", "uva"};
    String[] array2={"uva" , "pera", "manga"};

    public void printArray(){
        for(String i : array1){
           for(String j : array2){
                if(i==j){
                    System.out.println(i);
                }
           }
        }
    }
    // DuplicadosNao()
}