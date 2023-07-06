
class Solution
{


    public boolean Isvalidate(BinarySearchTree root)
    {
        return (validate(root,Integer.MIN_VALUE, Integer.MAX_VALUE));



       // return false;
    }

    public static boolean validate(BinarySearchTree root,int min, int max )

    {


        if(root==null)
        {

            return true;


        }


        if((root.nodevalue>=max)  || (root.nodevalue <=min))
        {
            return false;



        }
        else
        {
            return( validate(root.left,min,root.nodevalue) && validate(root.right,root.nodevalue,max));



        }




    }


}

