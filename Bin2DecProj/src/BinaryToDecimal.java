public class BinaryToDecimal {

    //Constraints:
    //Arrays not allowed.
    //Need to use a mathematical function.
    //Prior value * 2 + next bit = next value Horners Method
    

    static public int calculateBinary(String input){
        if(input.length() > 10){
            return 0;
        }
        int result = 0;
        for(int i = 0; i < input.length() ; i++){
            result += (int) (Integer.parseInt(input.substring(i,i+1))*Math.pow(2,input.length()-1-i));
            System.out.println(i+" | "+result+ " | "+ Math.pow(2,input.length()-1-i));
        }
        return result;
    }

}
