

import java.util.*;
public class Slovo
{
   public void hra(){
       String slovo;
       Random r = new Random();
       Scanner sc = new Scanner(System.in);
       int a = r.nextInt(3);
       
       int c = 1;
       
       
       if(a == 0){
           slovo = "smrk";
           String pom0 = slovo.substring(0,1);
           String pom1 = slovo.substring(1,2);
           String pom2 = slovo.substring(2,3);
           String pom3 = slovo.substring(3,4);
          
       System.out.println("VÍTEJ VE HŘE UHODNI SLOVO");
       System.out.println("HRA SPOČÍVÁ V TOM, ŽE ZADÁVAŠ PÍSMENA. MÁŠ TŘI POKUSY UHODNOUT JEDNO PÍSMENO SLOVA, JINAK HRA SKONČÍ");
       
       
       System.out.println("PROSÍM TVŮJ TYP :d");
       String b = sc.nextLine();  
        
       if(b.equals(pom0)){System.out.println("SPRÁVNĚ, JEN TAK DÁL :d");}  
           else {System.out.println("ŠPARNĚ, ZKUS TO ZNOVU");b = sc.nextLine(); 
                 System.out.println("POSLEDNÍ POKUS, CHLAPČE!");b = sc.nextLine();
                 System.out.println("NO, KONEČNĚ!");
                 if(!b.equals(pom0)){System.out.println("TADY SI SKONČIL!");
                                                            System.exit(0);}
       }
       System.out.println();
       System.out.println("HÁDÁŠ DRUHÉ PÍSMENO");  
       b = sc.nextLine();
       if(b.equals(pom1)){System.out.println("SPRÁVNĚ, JEN TAK DÁL :d");}  
           else {System.out.println("ŠPARNĚ, ZKUS TO ZNOVU");b = sc.nextLine(); 
                 System.out.println("POSLEDNÍ POKUS, CHLAPČE!");b = sc.nextLine();
                 
                 if(!b.equals(pom1)){System.out.println("KONČÍŠ!");
                                                            System.exit(0);}
       }
       System.out.println();
       System.out.println("HÁDÁŠ TŘETÍ PÍSMENO");  
       b = sc.nextLine();
       if(b.equals(pom2)){System.out.println("SPRÁVNĚ, JEN TAK DÁL :d");}  
           else {System.out.println("ŠPARNĚ, ZKUS TO ZNOVU");b = sc.nextLine(); 
                 System.out.println("POSLEDNÍ POKUS, CHLAPČE!");b = sc.nextLine();
                 
                 if(!b.equals(pom2)){System.out.println("KONČÍŠ!");
                                                            System.exit(0);}
       }
       System.out.println();
       System.out.println("HÁDÁŠ ČTVRTÉ PÍSMENO");  
       b = sc.nextLine();
       if(b.equals(pom3)){System.out.println("SPRÁVNĚ, JEN TAK DÁL :d");}  
           else {System.out.println("ŠPARNĚ, ZKUS TO ZNOVU");b = sc.nextLine(); 
                 System.out.println("POSLEDNÍ POKUS, CHLAPČE!");b = sc.nextLine();
                 
                 if(!b.equals(pom3)){System.out.println("KONČÍŠ!");
                                                            System.exit(0);}
       }
       System.out.println();
       System.out.println("ANO, SLOVO JE " + slovo);
    }
    
    if(a == 1){
           slovo = "ovce";
           String pom0 = slovo.substring(0,1);
           String pom1 = slovo.substring(1,2);
           String pom2 = slovo.substring(2,3);
           String pom3 = slovo.substring(3,4);
          
       System.out.println("VÍTEJ VE HŘE UHODNI SLOVO");
       System.out.println("HRA SPOČÍVÁ V TOM, ŽE ZADÁVAŠ PÍSMENA. MÁŠ TŘI POKUSY UHODNOUT JEDNO PÍSMENO SLOVA, JINAK HRA SKONČÍ");
       

       System.out.println("PROSÍM TVŮJ TYP :d");
       String b = sc.nextLine();  
        
       if(b.equals(pom0)){System.out.println("SPRÁVNĚ, JEN TAK DÁL :d");}  
           else {System.out.println("ŠPARNĚ, ZKUS TO ZNOVU");b = sc.nextLine(); 
                 System.out.println("POSLEDNÍ POKUS, CHLAPČE!");b = sc.nextLine();
                 System.out.println("NO, KONEČNĚ!");
                 if(!b.equals(pom0)){System.out.println("TADY SI SKONČIL!");
                                                            System.exit(0);}
       }
       System.out.println();
       System.out.println("HÁDÁŠ DRUHÉ PÍSMENO");  
       b = sc.nextLine();
       if(b.equals(pom1)){System.out.println("SPRÁVNĚ, JEN TAK DÁL :d");}  
           else {System.out.println("ŠPARNĚ, ZKUS TO ZNOVU");b = sc.nextLine(); 
                 System.out.println("POSLEDNÍ POKUS, CHLAPČE!");b = sc.nextLine();
                 
                 if(!b.equals(pom1)){System.out.println("KONČÍŠ!");
                                                            System.exit(0);}
       }
       System.out.println();
       System.out.println("HÁDÁŠ TŘETÍ PÍSMENO");  
       b = sc.nextLine();
       if(b.equals(pom2)){System.out.println("SPRÁVNĚ, JEN TAK DÁL :d");}  
           else {System.out.println("ŠPARNĚ, ZKUS TO ZNOVU");b = sc.nextLine(); 
                 System.out.println("POSLEDNÍ POKUS, CHLAPČE!");b = sc.nextLine();
                 
                 if(!b.equals(pom2)){System.out.println("KONČÍŠ!");
                                                            System.exit(0);}
       }
       System.out.println();
       System.out.println("HÁDÁŠ ČTVRTÉ PÍSMENO");  
       b = sc.nextLine();
       if(b.equals(pom3)){System.out.println("SPRÁVNĚ, JEN TAK DÁL :d");}  
           else {System.out.println("ŠPARNĚ, ZKUS TO ZNOVU");b = sc.nextLine(); 
                 System.out.println("POSLEDNÍ POKUS, CHLAPČE!");b = sc.nextLine();
                 
                 if(!b.equals(pom3)){System.out.println("KONČÍŠ!");
                                                            System.exit(0);}
       }
       System.out.println();
       System.out.println("ANO, SLOVO JE " + slovo);
    }
    
    if(a == 2){
           slovo = "mrak";
           String pom0 = slovo.substring(0,1);
           String pom1 = slovo.substring(1,2);
           String pom2 = slovo.substring(2,3);
           String pom3 = slovo.substring(3,4);
          
       System.out.println("VÍTEJ VE HŘE UHODNI SLOVO");
       System.out.println("HRA SPOČÍVÁ V TOM, ŽE ZADÁVAŠ PÍSMENA. MÁŠ TŘI POKUSY UHODNOUT JEDNO PÍSMENO SLOVA, JINAK HRA SKONČÍ");
       

       System.out.println("PROSÍM TVŮJ TYP :d");
       String b = sc.nextLine();  
        
       if(b.equals(pom0)){System.out.println("SPRÁVNĚ, JEN TAK DÁL :d");}  
           else {System.out.println("ŠPARNĚ, ZKUS TO ZNOVU");b = sc.nextLine(); 
                 System.out.println("POSLEDNÍ POKUS, CHLAPČE!");b = sc.nextLine();
                 System.out.println("NO, KONEČNĚ!");
                 if(!b.equals(pom0)){System.out.println("TADY SI SKONČIL!");
                                                            System.exit(0);}
       }
       System.out.println();
       System.out.println("HÁDÁŠ DRUHÉ PÍSMENO");  
       b = sc.nextLine();
       if(b.equals(pom1)){System.out.println("SPRÁVNĚ, JEN TAK DÁL :d");}  
           else {System.out.println("ŠPARNĚ, ZKUS TO ZNOVU");b = sc.nextLine(); 
                 System.out.println("POSLEDNÍ POKUS, CHLAPČE!");b = sc.nextLine();
                 
                 if(!b.equals(pom1)){System.out.println("KONČÍŠ!");
                                                            System.exit(0);}
       }
       System.out.println();
       System.out.println("HÁDÁŠ TŘETÍ PÍSMENO");  
       b = sc.nextLine();
       if(b.equals(pom2)){System.out.println("SPRÁVNĚ, JEN TAK DÁL :d");}  
           else {System.out.println("ŠPARNĚ, ZKUS TO ZNOVU");b = sc.nextLine(); 
                 System.out.println("POSLEDNÍ POKUS, CHLAPČE!");b = sc.nextLine();
                 
                 if(!b.equals(pom2)){System.out.println("KONČÍŠ!");
                                                            System.exit(0);}
       }
       System.out.println();
       System.out.println("HÁDÁŠ ČTVRTÉ PÍSMENO");  
       b = sc.nextLine();
       if(b.equals(pom3)){System.out.println("SPRÁVNĚ, JEN TAK DÁL :d");}  
           else {System.out.println("ŠPARNĚ, ZKUS TO ZNOVU");b = sc.nextLine(); 
                 System.out.println("POSLEDNÍ POKUS, CHLAPČE!");b = sc.nextLine();
                 
                 if(!b.equals(pom3)){System.out.println("KONČÍŠ!");
                                                            System.exit(0);}
       }
       System.out.println();
       System.out.println("ANO, SLOVO JE " + slovo);
    }
   }
}
       
       
       
       
       
   

