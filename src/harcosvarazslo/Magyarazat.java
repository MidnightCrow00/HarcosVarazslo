
package harcosvarazslo;


public class Magyarazat {
    
    public static void main(String[] args) {
        String eredeti = "abc.12x";
        int hossz = eredeti.length();
        System.out.println("első:" + eredeti.charAt(0));
        System.out.println("utolsó:" + eredeti.charAt(hossz-1));
        
        String uj = eredeti.substring(1);
        uj = eredeti.substring(1);
        System.out.println(uj);
        
        uj = eredeti.substring(0,3);
        System.out.println(uj);
        
        uj = eredeti.substring(4,6);
        System.out.println(uj);
        
        uj = eredeti.substring(3,7);
        System.out.println(uj);
        
        uj = eredeti.substring(eredeti.indexOf("."));
        System.out.println(uj);
        
        int k = eredeti.indexOf(".") + 1;
        int v = eredeti.length() - 1;
        uj = eredeti.substring(k, v);
        int szam = Integer.parseInt(uj);
        System.out.println(szam+2);
        
        boolean abcKezdes = eredeti.startsWith("abc");
        boolean xVege =  eredeti.endsWith("2x");
        boolean vanBennePont = eredeti.contains(".");
        System.out.println("abc-bel kezdődik: " + abcKezdes);
        System.out.println("2x a vége: " + xVege);
        System.out.println("van benne pont: " + vanBennePont);
        
        uj = eredeti.replace("12x", "hu");
        System.out.println(uj);
    }
}
