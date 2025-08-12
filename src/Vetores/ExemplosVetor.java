package Vetores;

public class ExemplosVetor {
    public static void main(String[] args) {
        int[]array = {70,20,30,40,45};
        int variavel = array[0] ;
         /*
//achar o maior valor
        for (int i = 0; i < array.length ; i++) {

            if (array[i] > variavel){
                variavel += array[i];
            }
        }
        System.out.println(variavel);
*/

        for (int i = 0; i < array.length ; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if (array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }


                }

                }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
        }
        }



