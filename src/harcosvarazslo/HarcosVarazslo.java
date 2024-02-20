
package harcosvarazslo;


public class HarcosVarazslo {


    public static void main(String[] args) {
        final int MERET = 3;
        String palya = "___";

        System.out.println("");
        for(int i = 0 ; i < 10; i++){
            int harPoz = (int)(Math.random()*MERET);
            int varPoz = (int)(Math.random()*MERET);
            if (harPoz==varPoz){
                if(harPoz == 0){
                    palya = "X__";
                }else{
                    palya = harPoz == 1 ? "_X_":"__X";
                }
            }else{
                if(harPoz == 0){
                    if (varPoz== 1){
                        palya = "HV_";
                    }else{
                        palya = "H_V";
                    }
                }else if(harPoz == 1){
                    if(varPoz == 0){
                        palya = "VH_";
                    }else{
                        palya = "_HV";
                    }
                }else{
                    if(varPoz == 0){
                        palya = "V_H";
                    }else{
                        palya = "_VH";
                    }
                }
            }
            System.out.println(palya);
            }
        System.out.println("");
        
    }
    
}
