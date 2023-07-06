import java.util.ArrayList;

class Node
        {


            int data;
            Node next;


            ArrayList<Integer> abc=new ArrayList<>();

            public Node (int node) {


                this.data=node;



            }


            public void addpointer(Node a) {


                this.next=a;




            }



            /*
            public static void tofindcycle(Node node)
            {


                Node  obj=null;


                obj = node;

                int a = obj.data;
                abc.add(a);




                while(node.next!=null)
                {


                    obj = node;

                    //abc.add(a);

                    // Node obj=new Node();

                    node=node.next;

                    a = node.data;

                    abc.add(a);

                  if (abc.contains(a)) {

                        //  obj = node;

                         obj.next=null;



                    }





                   }
                         // Renove cycle;

                        //   N next = node next;




                    }
                    */

                }

