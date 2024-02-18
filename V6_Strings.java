public class V6_Strings {
    public static void main(String args[]) {
        // int a = 10;
        // float b = 13.10f;
        // System.out.printf("The value of a is %d and value of b is %f",a,b);
        // System.out.format("The value of a is %d and value of b is %f",a,b);

        String name = "Nikhil";
        System.out.println(name); // Strings cant be chnged
        System.out.println(name.length()); // 6
        System.out.println(name.toLowerCase()); // nikhil
        System.out.println(name.toUpperCase()); // NIKHIL
        String name2 = "      Nikhil      ";
        System.out.println(name.trim()); // Nikhil
        System.out.println(name.substring(2)); // khil (Begins at the given index)
        System.out.println(name.substring(1, 4)); // (1->3) ikh
        System.out.println(name.replace('i', 'e')); // Nekhel // a;; characters
        System.out.println(name.replace("ikh", "hki")); // Nhkiil // changes the substring
        System.out.println(name.replace("k", "ppp")); // Nippphil // replaced char with string

        System.out.println(name.startsWith("Nik")); // true
        System.out.println(name.endsWith("p")); // false
        System.out.println(name.charAt(2)); // k
        System.out.println(name.indexOf("i")); // 1 // first occurence of "i"
        System.out.println(name.indexOf("kh")); // 2 // starts from index 2
        System.out.println(name.indexOf("i", 2)); // 4 // start finding from index 2, "i" is at index 4 then.

        // returns -1 if not there

        System.out.println(name.lastIndexOf("i")); // 4 , search from right to left
        System.out.println(name.lastIndexOf("i", 3)); // 1, starts searching from the index 3 towards the left side // (Right to Left).

        System.out.println(name.equals("Nikhil")); // true
        System.out.println(name.equalsIgnoreCase("niKHil")); // true // ignores case (Upper or lower)

        System.out.println("I m Nikhil \"Greate Human\" "); // I m Nikhil "Greate Human"
        System.out.println("I m Nikhil \n\"Greate Human\" ");
        // I m Nikhil
        // "Greate Human"
    }
}
