package com.company;

public class Main {

    public static void main(String[] args) {
	int[][] table={    {27,23,31,69,150},
                        {10,45,40,32,40},
                        {30,54,35,57,80},
                        {90,70,50,60, }
	};
	Client client= new Client();
	int result=client.count(table,0,0);
        System.out.println(result);
    }
}
