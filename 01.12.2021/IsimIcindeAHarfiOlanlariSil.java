package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IsimIcindeAHarfiOlanlariSil {

    public static void main(String[] args) {
        /*
         * Input olarak verilen listteki isimlerden
         * icinde "a"-"A" harfi bulunanlari silen bir program yaziniz
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

    	List <String> name= new ArrayList<>();
    	name.add("Ali");
    	name.add("Veli");
    	name.add("Ayse");
    	name.add("Fatma");
    	name.add("Omer");
    	
    	List <String>newName=new ArrayList<>();
    	
    	for (String w : name) {
			if (!w.toUpperCase().contains("A")) {
				newName.add(w);
			}
    		
		}
    	
    	System.out.println(newName);
    }


}
