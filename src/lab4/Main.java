/*
 1. В каждом слове текста k-ю букву заменить заданными симво­лами.
 Если k больше длины слова, корректировку не выполнять.
 */

package lab4;

import java.util.StringTokenizer;

/**
 *
 * @author lucian
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        task ("TEST string, it just a test string, ch, ls! libra", 'X', 3);
    }

    public static void task (String str, char ch, int k)
    {
        k--;
        StringTokenizer strTok = new StringTokenizer (str);
        while (strTok.hasMoreTokens())
        {
            StringBuffer tmpStrBuff  = new StringBuffer (strTok.nextToken());
            if (tmpStrBuff.length()>k)
            {
                if (tmpStrBuff.charAt(k)!='!' && tmpStrBuff.charAt(k)!='.' && tmpStrBuff.charAt(k)!=',' && tmpStrBuff.charAt(k)!='/' && tmpStrBuff.charAt(k)!='?' && tmpStrBuff.charAt(k)!=':' &&  tmpStrBuff.charAt(k)!=';')
                {
                    tmpStrBuff.insert(k, ch);
                    tmpStrBuff.delete(k+1, k+2);
                }
                System.out.print (tmpStrBuff+" ");
            }
        }
    }

}
