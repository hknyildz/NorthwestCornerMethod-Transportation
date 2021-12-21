package com.company;

public class Client {

    int startindex = 0;
    int startcolumn = 0;

    public int count(int[][] table, int startrow, int startcolumn) {
        int result = 0;
        if ((table[startcolumn][table[startcolumn].length - 1] - table[table.length - 1][startrow] > 0)) {
            table[startcolumn][table[startcolumn].length - 1] = (table[startcolumn][table[startcolumn].length - 1] - table[table.length - 1][startcolumn]);
            result += table[startcolumn][startrow] * table[table.length - 1][startrow];
            startrow++;
            if (startrow == table[0].length - 2 && startcolumn == table.length - 2) {
                return result += table[startcolumn][startrow] * table[startcolumn][table.length - 1];
            }
            result += count(table, startrow, startcolumn);
        } else if (table[startcolumn][table[startcolumn].length - 1] - table[table.length - 1][startrow] < 0) {
            table[table.length - 1][startrow] = table[table.length - 1][startrow] - table[startcolumn][table[startcolumn].length - 1];
            result += table[startcolumn][table[startcolumn].length - 1] * table[startcolumn][startrow];
            startcolumn++;
            if (startrow == table[0].length - 2 && startcolumn == table.length - 2) {
                return result += table[startcolumn][startrow] * table[startcolumn][table.length - 1];
            }

            result += count(table, startrow, startcolumn);
        }

        return result;
    }

}
//2430 1380 450  1200 700 3249