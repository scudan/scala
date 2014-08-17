/**
 * Created by toshiba on 2014/8/10.
 */
public class TestCharacter {

    public static void main(String [] args){

        String ss = "AcBdd";
        for(int i =0; i < ss.length(); i++){
            if(Character.isUpperCase(ss.charAt(i))){
                System.out.println(ss.charAt(i));
            }
        }
    }

}
