public class arr_work{
    public static void main(String[] args){
    
        //int[] marks = new int[] {we use this also for declare of  array variable}
        int marks[] = new int[3];

        System.out.println("marks of Subjects");
        
        marks[0] = 97;  //physics 
        marks[1] = 95;  // chemistery 
        marks[2] = 98;  // maths 

        /*System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);*/

        // since here count is less we and use indivisual line but when we have lot of number we will use this trick 

        for(int i=0; i<3 ; i++){
            System.out.println(marks[i]); 
        }

    }
}