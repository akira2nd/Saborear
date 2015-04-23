#include <stdio.h>
#include <string.h>
#include <math.h>

struct carro{
	char marca[15];
	int ano;
	char cor[10];
	double preco;
};

struct carro vCars[20];

int menu(){
	printf("1 - Cadastrar carro\n");
	printf("2 - Filtrar preço\n");
	printf("3 - Filtrar marca\n");
	printf("4 - Filtrar marca, ano e cor\n");
	printf("5 - Sair\n");
}

int cadastrar(int i){

}

int filtrarPreco(int i){

}

int filtrarMarca(int i){

}

int filtrarMAP(int i){

}


int main(){
	int i = 0;
	int menuUser = 0;
	do {
		menu();
		scanf("%d", &menuUser);

		switch(menuUser){
			case 1:
				cadastrar(i);
				break;
			case 2:
				filtrarPreco(i);
				break;
			case 3:
				filtrarMarca(i);
				break;
			case 4:
				filtrarMAP(i);
				break;
			case 5:
				break;
			default:
				printf("Menu inválido\n");
				break;
		}
	} while(menuUser != 5);

}
