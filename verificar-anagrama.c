#include <stdio.h> 
#include <string.h>

char * ordAlfabetica(char * word){
	int menor, x, i, n = 0;
	int tamanho = strlen(word);
	int original = strlen(word);
	char ordem[50];
	while(tamanho){
		for(x = 0; word[x] != '\0'; x++){ //Analisa caracter por caracter da palavra
			for(i = 0; word[i] != '\0'; i++){
				if(word[x] > word[i]){
					menor = 0;  //Não é o menor caracter
					break; 		//Para e passa a verificar o próximo
				} else {
					menor = 1;  //Diz que o caracter é menor que os outros que foram comparados
				}
			}
			if(menor && n < original){ //verifica se o caracter é o menor e se o tamanho da nova palavra é menor que a original
				ordem[n] = word[x]; //ordem recebe o menor caracter encontrado
				n++; //incrimenta para adicionar o próximo caracter na próxima posição
				for(i = 0; i < tamanho; i++) 
					if(i < x)
						word[i] = word[i];	//copia a primeira parte da palavra
					else
						word[i] = word[i + 1]; //exclui o menor caracter e copia o resto
				word[i-1] = '\0'; //define o final da string
			tamanho--; //reduz tamanho pois um caracter foi removido
			}
		}
	}
	ordem[original] = '\0'; //Limita a nova string ao mesmo tamnho da original
	printf("%s\n", ordem);
	return 0; //return ordem da erro -> address of stack memory associated with local variable 'ordem'
}

int main() {
		int x, anagrama;
        char a[50],b[50]; 

        printf("Digite a primeira palavra\n"); 
        gets(a); 
        printf("Digite a segunda palavra\n"); 
        gets(b);
        

        ordAlfabetica(a); //testar função que deve retornar as letras em ordem alfabética
        ordAlfabetica(b); //testar função que deve retornar as letras em ordem alfabética


        //char ordA = ord(a); //preciso armazenar aqui o retorno na função
        //char ordB = ord(b); //preciso armazenar aqui o retorno na função


        //abaixo comparação dos retornos

        /*if(strlen(a) != strlen(b)) //se não tem o mesmo tamanho, não são anagramas
        	printf("%s não é anagrama de %s.", a, b);
        else {
	        for(x = 0; ordA[x] != '\0'; x++){
	        	if (ordA[x] != ordB[x]){ //compara posição com posição da palavra em ordem alfabética
	        		anagrama = 0; // se entrar no if não é anagrama, pois há caracteres diferentes
	        		printf("Não é anagrama\n");
	        		break;
	        	}
	        }
	        if(anagrama)
	        	printf("%s é anagrama de %s.\n", a, b);
	    }*/

        return 0; 
} 
