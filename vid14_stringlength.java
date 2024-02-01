public class vid14_stringlength {
    public static void main(String[] args){
        String name= "sachin";
        int value=name.length();
        System.out.println(value);


        String lstring=name.toLowerCase();
        System.out.println(lstring);


        String ustring=name.toUpperCase();
        System.out.println(ustring);

        String nontrimmedString="      sachin     ";
        System.out.println(nontrimmedString);
        System.out.println(nontrimmedString.trim());
    }

    @Override
    public String toString() {
        return "vid14_stringlength []";
    }
}
