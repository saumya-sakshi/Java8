import java.util.function.Supplier;

// Program to get Random Password by using Supplier
public class PasswordGenerator {

    /**
     *
     * @param args
     * the length of the password should be 8
     * even places should have digit
     * old places can have uppercase letters or symbols like:- @ # $
     */
    public static void main(String[] args){

        Supplier<String> password = ()->{
            String pwd="";
            for(int i=1;i<=8;i++){
                Supplier<Integer> d =()->(int)(Math.random()*10);
                String symbols="ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
                Supplier<Character> c = ()->symbols.charAt((int)(Math.random()*28));

                if(i%2==0){
                    pwd=pwd+d.get();
                }else{
                    pwd=pwd+c.get();
                }

            }
            return pwd;
        };

        System.out.println(password.get());
        System.out.println(password.get());
        System.out.println(password.get());
        System.out.println(password.get());


    }
}
