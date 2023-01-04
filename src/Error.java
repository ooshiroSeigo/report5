public class Error {
    public static void main(String[] args) throws Exception {
        String str = null;
        try{
        System.out.println(str.length());
        }
        catch(NullPointerException exception){
            System.out.println("NullPointerExceptionが発生しました。");
            System.out.println(exception.getMessage());
        }
    }
}
