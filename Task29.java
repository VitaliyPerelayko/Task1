package LastDigit;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

/*Имеется текст. Следует составить для него частотный словарь.
*
 */
public class Task29 {
    public static void main(String[] args) throws IOException {
        /*BufferedReader bufferedReader=new BufferedReader(new FileReader("\\text.txt"));
        String text="";
        while (bufferedReader.readLine()!=null){
            text+=bufferedReader.readLine();
        }
        bufferedReader.close();*/
        String text ="Television in Britain is a part of mass media, a single public structure. It provides the society with up-to-date detailed information, which concerns political, economical, social, cultural and other important aspects. British people are fond of watching TV. Most families watch TV more than 4 hours a day. Nowadays there is a big choice of channels and programmes. Everyone may choose something to their own taste.\n" +
                "Broadcasting by television and radio in Britain is regulated by the Minister of Posts and Telecommunications. Television services are provided by the British Broadcasting Corporation (BBC), the Independent Television Authority (ITA) and other companies. The history of British TV started in 1936, when the BBC launched the world’s first public television service. The BBC studio productions come from the London Television Theatre, eight main London studios, and fully equipped regional studios in Manchester, Birmingham, Cardiff Glasgow, Bristol and Belfast. In addition, eight small interview studios (used mainly for short insertions into the news) have been established in England, Scotland and Wales.\n" +
                "The first regular independent television (ITV) service appeared in September 1955, by a programme transmission from the ITA London station. By 1958 it had already 7 stations in all parts of Great Britain. The ITV programmes are produced at modern studio centres in London, Manchester, Birmingham, Cardiff, Glasgow, Southampton and Newcastle. The main items broadcast by the ITV were entertainment programmes, plays and serials, sport and films.\n" +
                "Both the BBC and the ITV services provide programmes of music, drama, light entertainment, and films. Most popular are programmes on the arts, children’s and family programmes, interviews with outstanding personalities, investigations into matters of public interests, news reports covering international and national news.\n" +
                "The point of discussion about TV in Britain is advertising. Advertising is excluded from the television programmes of the BBC. The ITV has advertising intervals in and between programmes, which is often criticized, as it often spoils the programmes. According to the Television Act advertising should have certain restrictions. The ITA has also agreed rules with the Postmaster General about certain classes of programmes, in which advertisements may not be inserted. The discussions about advertising continue, but British people are fond of their TV and receive a lot of fun watching it.";
        String [] splittedText = text.split(" ");

        for (int i=0; i<splittedText.length ;i++){
            splittedText[i] = splittedText[i].trim();
            splittedText[i]= splittedText[i].toLowerCase();
            if (splittedText[i].startsWith("(")){
                splittedText[i] = splittedText[i].substring(1);
            }
            if (splittedText[i].endsWith(")")||splittedText[i].endsWith(".")||splittedText[i].endsWith(",")||splittedText[i].endsWith("?")||
                    splittedText[i].endsWith("!")||splittedText[i].endsWith(";")){
                splittedText[i] = splittedText[i].substring(0,splittedText[i].length()-1);
            }
        }

        /*for (String word:splittedText){
            System.out.println(word);
        }*/

        Arrays.sort(splittedText);

        String [] words = new String[splittedText.length];
        int [] counts = new int[splittedText.length];
        int i = 0;
        words[i] = splittedText[0];
        counts[i]++;
        for (int j=1;j<splittedText.length;j++ ){
            if (splittedText[j].equals(words[i])){
                counts[i]++;
            }else{
                i++;
                words[i]=splittedText[j];
                counts[i]++;
            }
        }
       // System.out.println(text);
        for (int j=0;words[j]!=null;j++ ){
            System.out.println(words[j]+"   "+counts[j]);
        }


    }
}
