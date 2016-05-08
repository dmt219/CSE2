//Duc Tran
//CSE 2
//A program that generates random basic words



public class Methods{
    
    public static void main(String[]args){
    String a = printSubjects();
    String b = printAdjectives1();
    String g = printAdjectives2();
    String c = printVerb();
    String e = printAdjectives1();
    String d = printObjects();
    
    System.out.println("The " + g+" "  + b + " "+a + " " +c +" "+" the " +e + " " +d );
    }
    
    
    public static String printAdjectives1(){
        String a ="";
        int x = (int) ((Math.random()*10)+1);
        switch(x){
            case 0:
                a = "purple";
                break;
            case 1:
                a ="red";
                break;
            case 2:
                a="blue";
                break;
            case 3:
                a ="orange";
                break;
            case 4:
                a ="yellow";
                break;
            case 5:
                a ="purple";
                break;
            case 6:
                a ="white";
                break;
            case 7:
                a ="blue";
                break;
            case 8:
                a ="colorful";
                break;
            case 9:
                a ="red";
                break;
            case 10:
                a ="green";
                break;
                
        }
        return a;
    }
    
     public static String printAdjectives2(){
        String a ="";
        int x = (int) ((Math.random()*10)+1);
        switch(x){
            case 0:
                a = "quick";
                break;
            case 1:
                a ="small";
                break;
            case 2:
                a="big";
                break;
            case 3:
                a ="large";
                break;
            case 4:
                a ="crazy";
                break;
            case 5:
                a ="slow";
                break;
            case 6:
                a ="fast";
                break;
            case 7:
                a ="lazy";
                break;
            case 8:
                a ="happy";
                break;
            case 9:
                a ="quick";
                break;
            case 10:
                a ="nice";
                break;
                
        }
        return a;
    }
    public static String printSubjects(){
        String a = "";
        int x = (int) ((Math.random()*10)+1);
        switch(x){
            case 0:
                a = "mouse";
                break;
            case 1:
                a ="fox";
                break;
            case 2:
                a="pig";
                break;
            case 3:
                a ="chicken";
                break;
            case 4:
                a ="cow";
                break;
            case 5:
                a ="dog";
                break;
            case 6:
                a ="cat";
                break;
            case 7:
                a ="duck";
                break;
            case 8:
                a ="mouse";
                break;
            case 9:
                a ="rabbit";
                break;
            case 10:
                a ="unicorn";
                break;
                
        }
        return a;
    }
    
    public static String printVerb(){
        String a = "";
        int x = (int) ((Math.random()*10)+1);
        switch(x){
            case 0:
                a="saw";
                break;
            case 1:
                a ="passed";
                break;
            case 2:
                a="flew";
                break;
            case 3:
                a ="stayed";
                break;
            case 4:
                a ="jumped";
                break;
            case 5:
                a ="barked";
                break;
            case 6:
                a ="passed";
                break;
            case 7:
                a ="saw";
                break;
            case 8:
                a ="hit";
                break;
            case 9:
                a ="chased";
                break;
            case 10:
                a ="saw";
                break;
                
        }
        return a;
    }
    
    public static String printObjects(){
        String a = "";
        int x = (int) ((Math.random()*10)+1);
        switch(x){
            case 0:
                a= "table";
                break;
            case 1:
                a ="box";
                break;
            case 2:
                a="chair";
                break;
            case 3:
                a ="ball";
                break;
            case 4:
                a ="machine";
                break;
            case 5:
                a ="computer";
                break;
            case 6:
                a ="desk";
                break;
            case 7:
                a ="TV";
                break;
            case 8:
                a ="bag";
                break;
            case 9:
                a ="pen";
                break;
            case 10:
                a ="eraser";
                break;
                
        }
        return a;
    }
    
    
    
    
    

}