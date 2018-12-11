public class Phrase
{
    private static String currentPhrase;

    /** Constructs a new Phrase object. */
    public Phrase(String p)
    {
         currentPhrase = p;
    }

    /** Returns the index of the nth occurrence of str in the current phrase;
     *  returns -1 if the nth occurrence does not exist.
     *  Precondition: str.length() > 0 and n > 0
     *  Postcondition: the current phrase is not modified.
     */
    public static int findNthOccurrence(String str, int n)
    {
        /* implementation not shown */
        int loc = currentPhrase.indexOf(str);
        int i=1;
        int a=currentPhrase.subString(loc+1)).indexOf(str);
        while(i<=n && a!=-1){
        loc=(currentPhrase.subString(loc+1)).indexOf(str))+loc+1;
        i++;
        a=currentPhrase.subString(loc+1)).indexOf(str);
        }
        if(a!=n){
            return -1;
        }
        return loc;
    }
    {
        int start=0;
        int loc=currentPhrase.substring(start).indexOf(str);
        int count =0;
        int sub=currentPhrase.substring(start).indexOf(str);
        while(sub!=-1){
            count++;
            if(count==n){
                return loc;
            }
            
            sub=currentPhrase.substring(start).indexOf(str);
            start=loc+1;
            loc=loc+sub+1;
        }
        return -1;
    }
    public static int findNthOccurrence(String str, int n)
    {
        /* implementation not shown */
        int index = 0;
        while(n != 0){
            int i = currentPhrase.substring(index).indexOf(str);
            if(i == -1)
                return -1;
            else if(n == 1)
                index =index+i;
            else
                index = index+i + 1;
            n--;
        }
        return index;
    }
    /** Modifies the current phrase by replacing the nth occurrence of str with repl.
     *  If the nth occurrence does not exist, the current phrase is unchanged.
     *  Precondition: str.length() > 0 and n > 0
     */
    public void replaceNthOccurrence(String str, int n, String repl)
    {
        /* to be implemented in part(a) */
        int index=findNthOccurence(str,n); 
        currentPhrase=currentPhrase.subString(0,index)+repl+currentPhrase.subString(index+str.length());
        
    }

    /** Return the index of the last occurrence of str in the current phrase;
     *  returns -1 if str is not found.
     *  Precondition: str.length() > 0
     *  Postcondition: the current phrase is not modified.
     */
    public int findLastOccurrence(String str)
    {
        /* to be implemented in part(b) */
        int i=1;
        int index=-1;
        while(findNthOccurence(str,i)!=-1){
        index=findNthOccurence(str,i);
        i++;
        }
    return index;
    }
    /** Returns a string containing the current phrase */
    public String toString(){
        return currentPhrase;
    }
    public static void main(String[] args)
    {
        Phrase a = new Phrase("THis")；
        
    }
}
