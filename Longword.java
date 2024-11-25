
public class Longword {
    
    public static void main(String[] args) {
        str  = "i came for you";
start = 0;
end = 0;
current = " ";
if ( str.charAt(end) ! = " ")
{
end++;
}
else 
{
start = end +1;
end = start;
}
for (int i = start; i < end; i++)
{
current += str.charAt(i);
    }
    
}