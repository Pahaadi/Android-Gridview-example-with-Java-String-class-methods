package com.raavam.trueenergy.androidjavastringclass.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;

import com.raavam.trueenergy.androidjavastringclass.Adapter.CodeAdapter;
import com.raavam.trueenergy.androidjavastringclass.Model.DataModel;
import com.raavam.trueenergy.androidjavastringclass.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView simpleList;
    ArrayList<DataModel> FuncList=new ArrayList<>();
    TextView txt_str;
    String string1 ="Forward";
    String string2 ="bAckward";
    String string3 = "  Entering to Dehradun, and to desi cafe  ";
    char[] myCharArray = {'H', 'e', 'l', 'l', 'o'};
    String sTemp="";
    String str="";
    String str2="";
    String str3="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // initViews();

        setData();

        simpleList = (GridView) findViewById(R.id.simpleGridView);
        txt_str=(TextView) findViewById(R.id.txt_strings);
        txt_str.setText("String 1 - "+ string1 +"\n"+"String 2 - "+ string2+"\n"+"String 3 - "+ string3);


        CodeAdapter codeAdapter=new CodeAdapter(getApplicationContext(),R.layout.custom_layout,FuncList);
        simpleList.setAdapter(codeAdapter);
    }


    public void setData(){
        //charAt(2)
        FuncList.add(new DataModel("string1.charAt(2)",string1.charAt(2)+"",
                "This method returns the character at given index."));
        //codePointAt(2
        FuncList.add(new DataModel("string1.codePointAt(2)",string1.codePointAt(2)+"",
                "This method returns the unicode value of character at given index." +
                "\nMain difference between ASCII and Unicode encoding is that, ASCII uses 7 bits to encode a " +
                        "character which is extended to 8 bits in extended ASCII,"+
                        "While Unicode gives choice to encrypt a character with 8,16, or 32 bit encodings."));
        //codePointBefore()
        FuncList.add(new DataModel("string1.codePointBefore(2)",string1.codePointBefore(2)+"",
                "This method returns the character at given 'index-1'."));
        //codePointCount(0,string1.length())
        FuncList.add(new DataModel("string1.codePointCount(0,str.length())",string1.codePointCount(0,string1.length())+"",
                "This method returns total values in the string."));
        //string1.compareTo(string2)
        FuncList.add(new DataModel("string1.compareTo(string2)",string1.compareTo(string2)+"",
                "This method is used for comparing two strings lexicographically.\n" +
                        "Which means each character of both the strings is converted into a Unicode value for comparison." +
                        "If both the strings are exactly same, the result is int value 0. If the total of unicode values in the" +
                        " first string is greater than the second string, the result is greater than 0, else vice versa." +
                        "\n In overall, it subtracts the total of converted unicode values of string2 by string1."));
        //string1.compareToIgnoreCase(string2)
        FuncList.add(new DataModel("string1.compareToIgnoreCase(string2)",string1.compareToIgnoreCase(string2)+"",
                "lexicographical comparison of two strings, ignoring the lower and upper case."));
        //string1.concat(string2)
        FuncList.add(new DataModel("string1.concat(string2)",string1.concat(string2)+"",
                "This method appends string 2 to string 1."));
        //string1.contains("ward")
        FuncList.add(new DataModel("string1.contains('ward')",string1.contains("ward")+"",
                "This method checks whether the string has the sequence of character(s)."));
        //string1.contentEquals("forward")
        FuncList.add(new DataModel("string1.contentEquals('Forward')",string1.contentEquals("forward")+"",
                "considering the lower and upper case, this method checks whether the string has exact same character sequence as given in StringBuffer."));
        //string1.copyValueOf("ward")
        FuncList.add(new DataModel("sTemp.copyValueOf(char[],index,count)",sTemp.copyValueOf(myCharArray,2,3)+"",
                "This method returns chars at array index and counts after it, into the string." +
                        "Note - Remember its index and offset(count in 2nd parameter), so second parameter should not exceed the" +
                        "limit of array summing up to the start index given"));
        //string1.copyValueOf(myCharArray)
        FuncList.add(new DataModel("sTemp.copyValueOf(myCharArray)",sTemp.copyValueOf(myCharArray)+"",
                "This method returns chars in array, into the string."));
        //string1.endsWith("e")
        FuncList.add(new DataModel("string1.endsWith('e')",string1.endsWith("e")+"",
                "This method check if the string ends with the given character."));
        //string1.equals("forward")
        FuncList.add(new DataModel("string1.equals(\"forward\")",string1.equals("forward")+"",
                "Regardless to compareTo(), this method checks if both the strings are same and generate results as true or false" +
                        ".(compare method returns" +
                        "whether the strings has any difference, which can be 0 for no difference, or any +ve/-ve values."));
        //string1.equals("forward")
        FuncList.add(new DataModel("string1.equalsIgnoreCase(\"forward\")",string1.equalsIgnoreCase("forward")+"",
                "This method checks if both the strings are same and generate results as true or false, ignoring the lower and upper case."));
        //string.formart('data type','data/agrs')
        FuncList.add(new DataModel("String.format('data type','data/agrs')" +
                "\nexample - String.format(\"Integer to string %d\", 101)",String.format("Integer to string %d", 101)+"\n"+
                String.format("Integer to string %d", 101)+"\n"+
                String.format("String to string %s", "Amar Singh")+"\n"+
                String.format("Float to string %f", 101.00)+"\n"+
                String.format("Hexadecimal to string %x", 101)+"\n"+
                String.format("Char to string %c", 'c'),
                "This method formats any given argument type to string."));
        //byte[] barr=string1.getBytes();
        byte[] barr=string1.getBytes();
        for(int i=0;i<barr.length;i++){
            str=str+","+barr[i];
        }
        //byte[] barr=string1.getBytes()
        FuncList.add(new DataModel("byte[] barr=string1.getBytes()",str+"",
                "This method converts every string into its byte sequence, where every character is converted into its" +
                        " unicode value."));

        //byte[] barr=string1.getBytes();
        char[] carr=new char[10];
        string1.getChars(0,6,carr,0);
        str="";
        for(int i=0;i<carr.length;i++){
            str=str+","+carr[i];
        }

        //string1.getChars(0,6,carr,0);
        FuncList.add(new DataModel("string1.getChars(0,6,carr,0)",str+"",
                "This method copy characters from the string to an array.Ihe four parameters to be supplied are -\n\n" +
                        "1 - srcBegin = where to begin copying from the source.\n" +
                        "2 - srcEnd = till where to be copied.\n" +
                        "3 - destArray[] = the array for copying the values.\n" +
                        "4 - dstBegin = location where pasting of the values will start in destination array.\n\n" +
                        "Note - The drawback with this method is that, in this special occasion we have to initialise the " +
                        "char array with some fixed value(unlike to toCharArray() or other methods where we supply input " +
                        "with dynamic length). There are high chances of running out of index(array size), or ending up with " +
                        "larger size array."));

        //string1.hashCode()
        FuncList.add(new DataModel("string1.hashCode()",string1.hashCode()+"",
                "This method returns hash code of the string, where each character is encoded in a hash value and thus " +
                        "added to a unique code as a sum, as below\n" +
                        "   s[0]*31^(n-1)+ s[1]*31^(n-2)+...... s[n-1]*31^(n-n).\n" +
                        "where s[i] is the ith character of the string, n is the length of the string, " +
                        "and ^ indicates exponentiation.\n\n" +
                        "In overall, every character is converted to its unicode value and multiplied with 31(with power length-1,length" +
                        "-2,.....length-length)"));
        //string1.indexOf('r')
        FuncList.add(new DataModel("string1.indexOf('r')",string1.indexOf('r')+"",
                "This method returns the position of the first occurrence of specified character(s) in a string"));
        //string1.indexOf('r',3)
        FuncList.add(new DataModel("string1.indexOf('r',3)",string1.indexOf('r',3)+"",
                "This method returns the position of the first occurrence of specified character(s) in a string, " +
                        "starting from the " +
                        "specified index"));
        //string1.lastIndexOf('r')
        FuncList.add(new DataModel("string1.lastIndexOf('r')",string1.lastIndexOf('r')+"",
                "This method returns the position of the last occurrence of specified character(s) in a string"));
        //string1.isEmpty()
        FuncList.add(new DataModel("string1.isEmpty()",string1.isEmpty()+"",
                "This method returns boolean value of if string is empty or not?"));
        //string1.length()
        FuncList.add(new DataModel("string1.length()",string1.length()+"",
                "This method returns length of the string"));

        //string1.matches()
        FuncList.add(new DataModel("string3.matches(..regex..)",
                "Searching word 'Dehradun' in string'\n" +
                        "string3.matches(\"(.*)Dehradun(.*)\")\n"+string3.matches("(.*)Dehradun(.*)")+
                        "\n----------------------------------"+
                        "\nSearching word 'to' in string\n" +
                        "string3.matches('to')\n"+string3.matches("to")+" , Wrong way to search"+
                        "\n----------------------------------"+
                        "\nDoes string starts with word 'Entering'\n" +
                        "string3.matches('to')\n"+string3.matches("Entering(.*)"),
                "This method returns if string matches given regular expression."));
        //string1.replace()
        FuncList.add(new DataModel("string1.replace(\"r\",\" :) \")",string1.replace("r"," :) ")+"",
                "This method replace old char(s) matches with new ones."));
        //string1.replaceFirst()
        FuncList.add(new DataModel("string1.replaceFirst(\"r\",\" :) \")",string1.replaceFirst("r"," :) ")+"",
                "This method replace first occurance of old char(s) matches with new ones."));
        //string1.replace()
        FuncList.add(new DataModel("case1 : string3.replaceAll(\"(.*)to(.*)\", \"in\")\ncase2: string3.replaceAll(\"\\\\s\"",
                "case1: "+string3.replaceAll("(.*)to(.*)", "in")+"\n"+
                        "case2: "+string3.replaceAll("\\s", ".."),
                "This method replace all old char(s)/substring matches with new ones." +
                        "the difference between replace and replaceAll is just that it allows to give regular " +
                        "expressions in arguments, which helps to perform more functions.\n\n" +
                        "Case 1 : It will replace everything with substring 'in'.\n" +
                        "Case 2 : It will replace every space character with '..'"));
        //string1.replaceFirst()
        String[] barrr=string3.split("\\s");//splits the string based on whitespace
        for(int i=0;i<barrr.length;i++){
            str2=str2+","+barrr[i];
        }
        FuncList.add(new DataModel("String[] barr1=string3.split(\"\\\\s\");\n--splits the string based on whitespace" +
                "\nfor(int i=0;i<words.length;i++){\n" +
                "            str=str+\",\"+barr[i];\n" +
                "        }",
                str2+"",
                "This method splits string into array of substrings."));
        //string1.startsWith("For")
        FuncList.add(new DataModel("case1: string1.startsWith(\"For\") \n " +
                "case2: string1.startsWith(\"For\",2)",string1.startsWith("For")
                +"\n"+string1.startsWith("For",2),
                "This method checks whether a string starts with specified characters."));
        //,string3.subSequence(0, 10)
        FuncList.add(new DataModel("string3.subSequence(0, 10)",string3.subSequence(0, 11)+"",
                "This method returns char sequence of given index."));
        //,string3.substring(0, 10)
        FuncList.add(new DataModel("string3.substring(0, 10)",string3.substring(0, 11)+"",
                "This method returns substring of given index."));
        //,string3.toCharArray()
        char s[]=string3.toCharArray();
        for(int i=0;i<s.length;i++){
            str3=str3+","+s[i];
        }
        FuncList.add(new DataModel("char s[]=string3.toCharArray();\n" +
                "        for(int i=0;i<s.length;i++){\n" +
                "            str3=str3+\",\"+s[i];\n" +
                "        }",str3,
                "This method converts this string to a new character array."));
        //,string3.toLowerCase()
        FuncList.add(new DataModel("string3.toLowerCase())",string3.toLowerCase()+"",
                "This method converts string to lowercase."));
        //,string3.toString()
        Integer integr=1290;
        int integr1=1290;
        FuncList.add(new DataModel("Integer integr=1290;\n" +
                "        int integr1=1290;" +
                "case1: integr.toString()\ncase2: Integer.toString(integr1)",
                "case1: "+ integr.toString()+"\n"+
                "case2: "+Integer.toString(integr1),
                "case1(toString()) − This returns a String object representing the value of *this* Integer." +
                        "\ncase2(toString(int i)) − This returns a String object representing the specified integer."));
        //,string3.trim()
        FuncList.add(new DataModel("case1: String.valueOf(3090)\ncase2: String.valueOf(true)",
                "case1: "+String.valueOf(3090)+"\n"+
                "case2: "+String.valueOf(true),
                "This method returns the primitive value of String object."));
    }
}