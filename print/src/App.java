import java.util.Hashtable;
import java.util.Scanner;
import java.util.UUID;
//import org.json.simple.JSONObject;

public class App {
    public static void main(String[] args) {

        Hashtable<String,String> hm=new Hashtable<String,String>();
        //JSONObject jw =new JSONObject();
      /*  String s=args[0];
        String gett="get";
        String count="count";
        String stu = "storeurl"; */
        
        int n=1;
        int count=0;
        while(n!=5){
            System.out.println("1:java urldatabase storeurl");
        System.out.println("2:java urldatabase get");
        System.out.println("3:java urldatabase count");
        System.out.println("4:java urldatabase list");
        System.out.println("5:Exit");
        System.out.println("");
        
        Scanner myObj = new Scanner(System.in);
        String a = myObj.nextLine();  
        System.out.println("Enter Command");
        switch(a)
        {
            case "1":
                System.out.print("java urldatabase storeurl"+" ");
                String urlname=myObj.nextLine();
                String k=UUID.randomUUID().toString();
                hm.put(k,urlname);
                System.out.println("Stored succussfull");
                count++;
                break;
                
            case "2":
                System.out.print("java urldatabase get "+" ");
                String gett=myObj.nextLine();

                System.out.println("Size of table is:- " + hm.size());
                if(hm.containsValue(gett)){
                    
                String kk=UUID.randomUUID().toString();
                
                //System.out.println(hm.get(gett));
                hm.get(gett);
                System.out.println(".......Unique Short Key.....");
                System.out.println(kk);
                System.out.println("");
                count++;
                }

                else
                {
                    System.out.println("Please Enter exist Url");
                }
                break;
            case "3":
                System.out.print("java urldatabase count"+" ");
                String kkk=UUID.randomUUID().toString();
                String countt=myObj.nextLine();
                count++;
                System.out.println("latest usage count is:"+count);
                break;
            case "4":
                System.out.println("all urls: and counts " +hm );
                break;
            case "5":
                System.out.println("Thank You");
                n=5;

        }   
    }    
       /* if(s.equals(stu))
        {
           String k=UUID.randomUUID().toString();
            hm.put(k,s);
            //jw.put(k,s);
            System.out.println("Stored succussfull");
        }
        if (s.equals(gett))
        {
        System.out.println(hm.get(gett));
        }
        if(s.equals(count))
        {
            System.out.println();
        }
        */

        
    }
}
