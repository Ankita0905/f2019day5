package com.lambton;

import java.util.*;

public class CollectionFrameworkExample
{
    public static void main(String[] args)
    {
       /* ArrayList<String> mStringArrayList=new ArrayList<>();

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
       }*/

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


        //new cass exercise

        /*ArrayList<String> data=new ArrayList<>();
        data.add("abc");
        data.add("cab");
        data.add("cat");
        data.add("mate");
        data.add("atem");
        data.add("bac");
        data.add("tac");
        data.add("atc");
        data.add("pop");
        data.add("pat");
        data.add("123");
        data.add("231");
        data.add("431");

        System.out.println(data);

        System.out.println();*/
        ArrayList<String>  mStringArrayList = new ArrayList<>();
        mStringArrayList.add("abc");
        mStringArrayList.add("cab");
        mStringArrayList.add("cat");
        mStringArrayList.add("mate");
        mStringArrayList.add("atem");
        mStringArrayList.add("bac");
        mStringArrayList.add("tac");
        mStringArrayList.add("atc");
        mStringArrayList.add("pop");
        mStringArrayList.add("pat");
        mStringArrayList.add("123");
        mStringArrayList.add("231");
        mStringArrayList.add("431");
        Map<String,ArrayList<String>> hm=new HashMap<>();

        for(String s:mStringArrayList)
        {
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String key=new String(c);

            ArrayList<String>al=hm.get(key);
            if(al==null)
            {
                al=new ArrayList<>();
            }
            al.add(s);
            hm.put(key,al);

        }
        System.out.println(hm);

    }
}
