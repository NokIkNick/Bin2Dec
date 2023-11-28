public class BinaryToDecimal {

    //Constraints:
    //Arrays not allowed.
    //Need to use a mathematical function.
    //(1010101010) = (1 x 2^9) + (0 x 2^8) + ...
    //Binary = (bit * 2^length of binary) + (nextbit * 2^length of binary-1) ...
    

    static public int calculateBinary(String input){
        int result = 0;
        for(int i = 0; i < input.length() ; i++){
            result += (int) (Integer.parseInt(input.substring(i,i+1))*Math.pow(2,input.length()-1-i));
            System.out.println(i+" | "+result+ " | "+ Math.pow(2,input.length()-1-i));
        }
        return result;
    }

}
