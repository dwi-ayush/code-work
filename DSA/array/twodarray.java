public class twodarray{
    public static void main(String[] args) {
        
        // 2d array  = An array where each elemt is an array 
        //  useful foer storing matrix data      

        /*String[] fruits = {" banana", " apple ","grapes "};
        String[] vegetables  = {" potao", " onion "," carrot "};
        String[] drinks = {" thumbs up", " sprite  "," appy fizz "};*/

        /*String[][] groceries ={ fruits,vegetables, drinks };*/ // used to state an array before and then combine it 


        String[][] groceries = {{" banana", " apple ","grapes "}, 
                                   {" potao", " onion "," carrot "}, 
                                  {" thumbs up", " sprite  "," appy fizz "}};// this method can be used  for direct storing up the elements 
        
        groceries[0][0] = "pineapple";// it will replace bana by pineapple 
        // array_name[index of row in array ][ index of cloum in array]

        for(String[] foods : groceries)// it give only memory addres in print statement
        {
        for( String food : foods)// it will print  up the elements 
        {
            System.out.print(food + " ");
        }
           System.out.println();// state every new line after complete of one string 
        }



    }
}