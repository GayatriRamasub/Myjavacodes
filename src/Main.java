// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;




public class Main {


    String valuemain;


    public static void palindrome(String a) {


        Set<String> obj = new HashSet<>();


        char[] arrystring = a.toCharArray();


//gayatri

        for (int i = 0; i < arrystring.length; i++) {

            for (int j = 0; j < arrystring.length; j++) {

                if ((i != j) && (j>i)  && (j-i==1)) {
                    String charryst = (arrystring[i]) +  String.valueOf(arrystring[j]);

                   // System.out.println(charryst);

                   // poppopo
                    //System.out.println("The reverse of the string"+charryst);


                    if (reverse(charryst).equals(charryst)) {

                   //  System.out.println(charryst);
                        obj.add(charryst);


                    }


                    for (int k = 0; k < a.length(); k++) {

                        if (k != (i) && k != (j) && (k > i) && (k> j)) {


                            charryst = charryst + arrystring[k] +"";


                         //   System.out.println("The reverse of the string"+charryst);

                            if (reverse(charryst).equals(charryst)) {



                               // System.out.println(charryst);


                                obj.add(charryst);


                            }


                        }


                    }


                }

            }


        }


        Iterator it=obj.iterator();


        while(it.hasNext())
        {
            System.out.println(it.next());


        }


    }




    public static String reverse(String ast)
        {

            StringBuffer objbuffer=new StringBuffer(ast);

          return(objbuffer.reverse().toString());




        }




    public static boolean  hasTeen(int a,int b, int c)
    {

        boolean btoreturn=false;



        if(((a>=13) && (a<=19)) || ((b>=13) && (b<=19)) || ((c>=13) && (c<=19)))
        {

            btoreturn=true;





        }



        return btoreturn;



    }


    public static void endUp(String abc)
    {


        int a=abc.length()-4;


         abc.substring(0,abc.length()-5);

        abc.substring(abc.length()-4, abc.length()).toUpperCase();




        System.out.print(  abc.substring(0,abc.length()-3)   +    abc.substring(abc.length()-3, abc.length()).toUpperCase());


    }
    public static String delDel(String abc)
    {
        String stringtoreturn="";


        if(abc.contains("del"))
        {
            int a=abc.indexOf("del");

        //    System.out.println(a);



            StringBuffer obj=new StringBuffer(abc);

            obj.deleteCharAt(a);

          //  obj=new StringBuffer(abc);

            obj.deleteCharAt(a);

            //obj=new StringBuffer(abc);
            obj.deleteCharAt(a);

            stringtoreturn=obj.toString();


        }


        else

        {
            stringtoreturn=abc;

        }

        return   stringtoreturn;




    }



    public static boolean timeForMilkAndCookies(Date d)
    {

       if(( d.getDate()==24) && (d.getMonth()==11))
       {

           return true;

       }


        return false;
    }
    public static long convertoseconds(int values)
    {


        return(values * 60);







    }


    public static int togetmatchsticks(int n)
    {

        int total = 0;





       if(n > 1)
       {
           int neven = n / 2;


           /*
           total = (6 + 6 - 1) * neven;

           for (int i = 0; i < neven; i++) {

               total = (6 + 6 - 1) * neven;

           }

           */




           total = n * (6)- (n-1);
       }


       else {


           total= 6;

       }

       return total;


    }


    public static void matrixmul()
    {


        int sum=0;


        int firstarray[][]=new int[][]{{1,1,1},{2,2,2},{3,3,3},{4,4,4} };

//4 * 3
 //  1  1  1  1
 //  2  2   2  2
  // 3   3    3 3

        int secondarray[][]=new int[][]{{1,1,1,1},{2,2,2,2},{3,3,3,3}};

        int newarray[][]=new int[4][4];


        int g=0;
        int e=0;

        int flag=0;


        int flaginner=0;



   //     00 01 02    00 01 02
     //               10 11 12
      //              2



        for(int i=0;i< 4;i++ )
        {


            System.out.println("Value of i"+i);








            for (int j = 0; j < 4; j++)
            {

                flaginner=0;
                flag=0;

                sum=0;

                for (int k = 0; k < 3; k++)
                {
                System.out.println("Value of j"+j);

                if(k<(3))
                {
                    sum = sum + firstarray[i][k] * secondarray[k][j];
                }//if

              //  System.out.println("The sum in loop"+sum);


                if(k==2) {

                //    System.out.println("The sum for k" + sum);
                    //   System.out.println("The value of g and e" + g+e);


                    while (g < 4 && flag < 2) {

                        if (e == 4) {

                            e = 0;

                        }
                        while (e < 4 && flaginner < 3) {

                            System.out.println("The value of g and e" + g + e);

                            System.out.println("The sum for k" + sum);

                            newarray[g][e] = sum;
                            e++;

                            flaginner = 3;


                        }

                        if (e == 3) {

                            g++;


                        }
                        //g++;

                        flag = 3;

                    }//second while

                }

                }


                }









            }

            for(int i=0;i<4;i++ )
            {



                for (int j = 0; j < 4; j++)
                {


                    System.out.print(newarray[i][j]);

                }

                System.out.println();
            }

        }




    public static void bitwiseAND(int a,int b)
    {

       String abinary= Integer.toBinaryString(a);

       String bbinary= Integer.toBinaryString(b);

        long result=(Long.parseLong(abinary) & Long.parseLong(bbinary));

       System.out.println(a & b);


    }

    public static void bitwiseOR(int a,int b)
    {

        String abinary= Integer.toBinaryString(a);

        String bbinary= Integer.toBinaryString(b);

        long result=(Long.parseLong(abinary) | Long.parseLong(bbinary));

        System.out.println(a | b);



    }


    public static void bitwiseXOR(int a,int b)
    {

        String abinary= Integer.toBinaryString(a);

        String bbinary= Integer.toBinaryString(b);



        System.out.println(a ^ b);



    }

    public static void countnumberofstringsintheword(String values)

    {


        String[] words=values.split(" ");

        System.out.println("The number of words in the strings "+words.length);











    }
    public static void countnumberofarrays(String[] values)

    {

        int truecount=0;

        int falsecount=0;



        for(int i=0;i< values.length;i++)
        {

            if(values[i]=="true")
            {

                truecount= truecount+1;


            }


            if(values[i]=="false")
            {

                falsecount= falsecount+1;



            }


        }

        System.out.println("The true values are "+    truecount);


        System.out.println("The false values are "+    falsecount);




    }

        public static void matchcharacter()
    {


        String mydata = "some string with 'the data i want' inside";
        //Pattern pattern = Pattern.compile("'(.*?)'");

        String inputStr = "30jjabcd10fsgf18ukkkkhhhhhhh10";



        String regexStrpattern1 = "\\b\\d{1,2}[a-z]";



        String regexStrpattern2 = "[a-z]\\d{1,2}[a-z]";

        String regexStrpattern3 = "\\d{1,2}$";

        Pattern pt1 = Pattern.compile(regexStrpattern1);
        Pattern pt2 = Pattern.compile(regexStrpattern2);

        Pattern pt3 = Pattern.compile(regexStrpattern3);

        Matcher matcher = pt2.matcher(inputStr);

        int num;

        int sum=0;


        while (matcher.find()){
            String s = matcher.group();

             num=Integer.parseInt(s.substring(1,3));

             sum=sum+num;




        }

        matcher = pt1.matcher(inputStr);



        while (matcher.find()){
            String s = matcher.group();

            num=Integer.parseInt(s.substring(0,2));

            sum=sum+num;



        }

        matcher = pt3.matcher(inputStr);



        while (matcher.find()){
            String s = matcher.group();


            System.out.println("The value"+s);
            num=Integer.parseInt(s.substring(0,2));


            sum=sum+num;




        }



        System.out.println("The sum"+sum);










    }






    public static void everyNth(String st, int a)

    {
        int[] arr=new int[5];




        for(int i = 0; i < st.length(); i=i+a)

        {


            System.out.print(st.charAt(i));



        }

    }
    public static void readandwritefile() throws IOException {

        FileWriter io=new FileWriter("abc.txt");

        BufferedWriter br=new BufferedWriter(io);


        br.write("This is the first line");
        br.write("\n");

        br.write("This is the first line. This is important");
       br.close();







    }

    public static boolean array123(int []a) {
        boolean b = false;


        for (int i = 0; i < a.length; i++) {

            if (a[i] == 1) {

                if ((a[i + 1] == 2) && (a[i + 2] == 3)) {


                    b = true;


                    break;

                }


            }

        }
        return b;
    }
        public static boolean fx(int[] ar)
        {
            boolean btriplet = false;

            int count = 0;

            for (int i = 0; i < ar.length; i++)
            {
                count = 0;

                for (int j = 0; j < ar.length; j++)
                {

                    if(i!=j) {
                        if (ar[i] == ar[j]) {

                            count = count + 1;


                        }
                    }

                }

                if (count == 2)
                {
                    btriplet = true;

                    break;

                }

            }

            return btriplet;
        }

    public static int[] writemethod()
    {


        int[] ab=new int[]{10,20,30,40,50,60,70,80,90};


        return ab;


    }


    public static boolean arrayToCheckif1there(int[] arry) {

        int value=0;

        int valueof0=0;

        int valueof1=0;

        int valueoflenminus1=0;

        int valueof1minus2=0;

        boolean valuefor1follby3=false;




        for(int i=0; i< arry.length;i++)
        {


            valueof0=arry[0];


            valueof1=arry[1];


            valueoflenminus1=arry[arry.length - 1];


            valueof1minus2=arry[arry.length - 2];




            if ((value == 1) && arry[i] == 3)
            {

                valuefor1follby3=true;



            }

                if (i == arry.length - 1) {

                    if ( (( valueof0 == 1) || (valueof1== 1) || (arry[arry.length - 1] == 1) || (valueof1minus2 == 1))  && valuefor1follby3==true) {

                            return true;

                    }

                }




             value=arry[i];



        }




  return false;

    }



    public static void tofindcycle(Node node)
    {

        ArrayList<Integer> abc=new ArrayList<>();




        Node  obj=null;


        obj = node;

        int a = obj.data;
        abc.add(a);


        while(obj.next!=null)
        {


            obj = node;

            abc.add(obj.data);
            ///abc.add(a);

            // Node obj=new Node();

            node=node.next;

            a = node.data;



         //   System.out.println("value is"+obj.data);



            if (abc.contains(a)) {

                //  obj = node;

                System.out.println("The node is"+node.data);

                obj.next=null;





            }





        }
        // Renove cycle;

        //   N next = node next;




    }
    public static void printalllist(Node head)
    {

        Node node=head;


        int i=1;


        while(node != null)
        {



            System.out.println(""+i+" "+node.data);
            i++;


            node=node.next;
        }


    }




        public static void main(String[] args) throws IOException {

           LinkedList<String> names=new LinkedList<String>();

       // matrixmul();

            Node obj1=new Node(10);

            Node obj2=new Node(20);

            Node obj3=new Node(30);

            Node obj4=new Node(40);


            Node obj5=new Node(50);

            Node obj6=new Node(60);

            Node obj7=new Node(70);
            Node obj8=new Node(80);

            Node obj9=new Node(90);
            Node obj10=new Node(100);
            Node obj11=new Node(120);


            obj1.next=obj2;

            obj2.next=obj3;

            obj3.next=obj4;

            obj4.next=obj5;

            obj5.next=obj6;

            obj6.next=obj7;

            obj7.next=obj8;

            obj8.next=obj5;

            tofindcycle(obj1);

            printalllist(obj1);













       // readandwritefile();


        BinarySearchTree root = new BinarySearchTree(100);
        root= new  BinarySearchTree(4);
        root.left= new BinarySearchTree(2);
        root.right= new BinarySearchTree(5);
        root.left.left= new BinarySearchTree(1);
        root.left.right= new BinarySearchTree(3);

        Solution obj=new Solution();
        //System.out.println(obj.Isvalidate(root));

        int[] argsarray=new int[]{1,2,3,4,1,1,5};



        int[][] argsarrayd=new int[][]{{1,2},{2,3}};

        argsarray=new int[]{1,3,4,5};

    //    System.out.println(arrayToCheckif1there( argsarray));

      // palindrome("poppopo");

        argsarray=new int[]{2,1,3,4,5};

   //     System.out.println(arrayToCheckif1there( argsarray));


        argsarray=new int[]{1,1,1};
     //   System.out.println(arrayToCheckif1there( argsarray));




    //    System.out.println(fx(argsarray));

        argsarray=new int[]{1,2,3,4,1,7,5};

      //  System.out.println(fx(argsarray));

        argsarray=new int[]{1,2,9,4,5};


       // System.out.println(array123(argsarray));


      //  System.out.println("The values in the array"+ writemethod());



    //    int[] argsarray={1,2,3,4,5};
        for(int i:argsarray)

        {

         //   System.out.println(i);


        }







      // Main obj=new Main();

       // System.out.print("The answer of value of main"+obj.valuemain);


       // endUp("Hello");

        int p;

        //System.out.print("The answer of p"+p);


        //  everyNth("Miracle", 2);
       // System.out.println();
       // everyNth("abcdefg", 2);
       // System.out.println();
       // everyNth("abcdefg", 3);
        //      System.out.println(    delDel("adelbc"));

    //    System.out.println(    delDel("adelHello"));

      //  System.out.println(    delDel("adedbc"));

       // System.out.println( timeForMilkAndCookies(new Date(2013, 11, 24)));
      //  timeForMilkAndCookies(new Date(2013, 0, 23));

       // timeForMilkAndCookies(new Date(3000, 11, 24));


        //String a="dhdhhd";
       // a.contains("hshsh");

        //a.indexOf("del");

       // hasTeen(13, 20, 10);
       // hasTeen(20, 19, 10);



  //       System.out.println( hasTeen(13, 20, 10));
   //     System.out.println(  hasTeen(20, 19, 10));
    //    System.out.println(  hasTeen(20, 10, 13));














        //Vehicle obj=new Car();

        //obj.vehicletype();


        // System.out.println(togetmatchsticks(1));;

       // System.out.println(togetmatchsticks(4));;

      //  System.out.println(togetmatchsticks(87));;

       // bitwiseAND(7,12);
      //  bitwiseXOR(7, 12);
      //  bitwiseOR(7, 12);

       // System.out.println(convertoseconds(5));

        //System.out.println(convertoseconds(3));


        //System.out.println(convertoseconds(2));

        //countnumberofstringsintheword("Just an example here move along");

        //countnumberofstringsintheword("This is a test");

        //countnumberofstringsintheword("What an easy task, right");

        //String[] values= {"true","false" ,"false","true","false"};


        //String[] val={"fsdfeasdfea","fdgzdfydszfyd","dsgdsgfsz"};



        //values[0]="true";

        //values[1]="false";

        //values[2]="false";

        //values[3]="true";

        //values[4]="false";


      //values=["true", "false", "false", "true", "false"];

        //countnumberofarrays(values);



       // Car obj=new Car();
       // obj.setModel("Maruti");
        //obj.setYear(1995);
        //obj.getYear();
       // obj.getModel();
      //  matchcharacter();

        //int v=70;

        /*
        int v1=121;




        long[] numberofdin= {1, 2, 5, 10, 20, 50, 100, 500, 1000};

        //	THREE LOOPS

        ///	FIRST I, PICK UP EVERY ELEMENT

//		THEN J, NPT EQAUL TO I ,

//		THEN K, NOT EQAUL TO I AND J,

        //	SUM A[I]+A[J]+A{K} AND CHECK EVERYTIME SUM.

        //	AND USE THE SAME LOGIC




        concatstrings("abc","pqr");


        concatstrings("abc","pqr","lop");




        //	2 DIGITS,
        //	3


        ArrayList<Integer> ab=new ArrayList();

        long v=70;


        int mimum=0;

        long sum=0;


        int sizelist=0;




        for(int i=0;i<numberofdin.length;i++)
        {


            //sum=0;

            for(int j=0;j<numberofdin.length;j++)
            {

                 ab.clear();

                //sum=0;

                if(j != i)

                {
                    System.out.println();

                    sum=sum+numberofdin[i]+ numberofdin[j];


                    //System.out.println(sum);

                    ab.add((int) numberofdin[i]);


                    ab.add((int) numberofdin[j]);

                    if(sum == v )

                    {
                        sizelist=ab.size();






                            for(int p=0;p<ab.size();p++)

                            {

                                System.out.print(ab.get(p));




                            }






                        mimum=sizelist;






                    }//


                    for(int k=0;k<numberofdin.length;k++)
                    {
                        System.out.println();
                        ab.clear();

                        if( (k != i) && (k != j))

                        {
                            sum=sum+numberofdin[i]+numberofdin[j]+numberofdin[k];


                            //System.out.println(sum);

                            ab.add((int) numberofdin[i]);


                            ab.add((int) numberofdin[j]);


                            ab.add((int) numberofdin[k]);



                            if(sum == v )

                            {
                                sizelist=ab.size();





                                    for(int p=0;p<ab.size();p++)

                                    {

                                        System.out.print(ab.get(p));




                                    }





                                mimum=sizelist;






                            }//



                        }//


                        sum=0;

                    }

                    sum=0;


                }

            }

        }


         */


    }



    public static void concatstrings(String a,String b)
    {


        System.out.println(a.concat(b));


    }

    public static void concatstrings(String a,String b,String c)
    {

        System.out.println(a.concat(b).concat(c));


    }
}
		
		

