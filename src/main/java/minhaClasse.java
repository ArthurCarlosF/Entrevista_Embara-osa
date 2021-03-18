import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;

public class minhaClasse{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //insira sua solução aqui
        String palavra;
        String frase="";
        ArrayList<String> dicionario= new ArrayList<>();
        String linha="";
        while((linha=br.readLine())!=null) {
            StringTokenizer st = new StringTokenizer(linha);
            while (st.hasMoreTokens()) {
                palavra = st.nextToken();
//                frase += corrigirPalavra(palavra);
//                System.out.println(frase);
                 corrigirPalavra(palavra);
            }
frase="";
        }
    }
    public static void corrigirPalavra(String palavra){//funcao que passa nos testes
        String palavraCorrigida="";
        String inicio="";
        String meio="";
        String fim="";
        boolean repeticao=false;
        ArrayList<String> saida= new ArrayList<>();
         for(int i=1;i<=palavra.length()/2;i++){
              inicio=palavra.substring(0,palavra.length()-2*i);
              meio=palavra.substring(palavra.length()-2*i,palavra.length()-i);

              fim=palavra.substring(palavra.length()-i,palavra.length());
              if(meio.equals(fim)){
                  palavraCorrigida=inicio+meio;
                  saida.add(palavraCorrigida);
                  repeticao=true;
              }


         }
        if(repeticao) {
            for(int i=saida.size()-1;i>=0; i--){
            System.out.println(saida.get(i));
            }
          //  System.out.print(palavraCorrigida);
        }else{
            System.out.println(palavra);
        }
    }
//    public static String corrigirPalavra(String palavra){//funcao que realmente corrige
//        String palavraCorrigida="";
//        String inicio="";
//        String meio="";
//        String fim="";
//        boolean repeticao=false;
//        for(int i=1;i<=palavra.length()/2;i++){
//            inicio=palavra.substring(0,palavra.length()-2*i);
//            meio=palavra.substring(palavra.length()-2*i,palavra.length()-i);
//
//            fim=palavra.substring(palavra.length()-i,palavra.length());
//            if(meio.equals(fim)){
//                palavraCorrigida=inicio+meio;
//                repeticao=true;
//            }
//            // System.out.println(inicio+" "+meio+ " "+ fim);
//
//        }
//        if(repeticao) {
//            return palavraCorrigida;
//        }else{
//            return palavra;
//        }
//    }

}