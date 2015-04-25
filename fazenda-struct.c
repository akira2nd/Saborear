#include <stdio.h>
#include <string.h>
#include <stdlib.h>

//declarando estruturas de registros
struct data {
	char mes[2];
	char ano[4];
};

struct registro {
	char codigo[25];
	int leite;
	int alimentos;
	char abate[1];
	struct data nascimento;
};

struct registro gado[2000];

int menu(){
	printf("\n------------------ MENU ------------------\n");
	printf("1 - Leite produzido / semana\n");
	printf("2 - Alimento consumido / semana\n");
	printf("3 - Leite produzido / semana após abate\n");
	printf("4 - Alimento consumido / semana após abate\n");
	printf("5 - Gados que irão para abate\n");
	printf("6 - Finalizar\n");
	printf("------------------------------------------\n");
}

void leite(int * i){
	
}

void leiteAbate(int * i){
	
}

void alimento(int * i){
	
}

void alimentoAbate(int * i){
	
}

void gadosAbate(int * i){
	
}

int main(){
	int i = 0;

	int menuUser = 0;
	do {
		system("cls");
		menu();
		scanf("%d", &menuUser);

		switch(menuUser){
			case 1:
				leite(&i);  	//passa endereço de memória
				break;
			case 2:
				alimento(&i);
				break;
			case 3:
				leiteAbate(&i);
				break;
			case 4:
				alimentoAbate(&i);
				break;
			case 5:
				gadosAbate(&i);
				break;
			case 6:
				break;
			default:
				printf("Menu inválido\n");
				break;
		}
            system("pause");
	} while(menuUser != 6);
}