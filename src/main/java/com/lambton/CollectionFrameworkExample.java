package com.lambton;

import java.util.*;

public class CollectionFrameworkExample
{
    public static void main(String[] args)
    {
        ArrayList<String> mStringArrayList=new ArrayList<>();

        mStringArrayList.add("A");
        mStringArrayList.add("B");
        mStringArrayList.add("C");
        mStringArrayList.add("D");

        mStringArrayList.add("A");
        mStringArrayList.add("A");
       // System.out.println(mStringArrayList);
       for(int i=0;i<mStringArrayList.size();i++)
       {
           System.out.println(mStringArrayList.get(i));
       }

       /*for(String num: mStringArrayList)
       {
           System.out.println(num);
       }*/

       /* Iterator<String>iterator=mStringArrayList.iterator();
        while (iterator.hasNext())
        {
            String s=iterator.next();
            System.out.println(s);
        }*/
        Set<String>mySet=new HashSet<>();
        mySet.add("India");
        mySet.add("China");
        mySet.add("Canada");
        mySet.add("USA");
        System.out.println(mySet);
        //no duplication is allowed
        mySet.add("India");
        System.out.println(mySet);


        ArrayList<String>ilist=new ArrayList<>();
        ilist.add("Punjab");
        ilist.add("Haryana");

        ArrayList<String>clist=new ArrayList<>();
        clist.add("Ontario");
        clist.add("British Columbia");

        ArrayList<String>ulist=new ArrayList<>();
        ulist.add("New York");
        ulist.add("New Jersy");

        Map<String,ArrayList<String>> stringMap=new HashMap<>();
        stringMap.put("INDIA", ilist);
        stringMap.put("Canada", clist);
        stringMap.put("USA", ulist);

        System.out.println(stringMap);




    }
}
