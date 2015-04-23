#include <stdio.h>
#include <string.h>

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

void cadastrar(int * i){
	int newCar = 1;
	int k = * i;
	while(newCar){
		printf("Marca: ");
		scanf("%s", &vCars[k].marca);

		printf("Ano  : ");
		scanf("%d", &vCars[k].ano);

		printf("Cor  : ");
		scanf("%s", &vCars[k].cor);

		printf("Preço: ");
		scanf("%lf", &vCars[k].preco);

		printf("0 Finalizar  ou  1 Continuar\n");
		scanf("%d", &newCar);
		* i = * i + 1;
		k++;
	}
}

int filtrarPreco(int * i){

}

int filtrarMarca(int * i){

}

int filtrarMAC(int * i){

}


int main(){
	int i = 0;
	int menuUser = 0;
	do {
		menu();
		scanf("%d", &menuUser);

		switch(menuUser){
			case 1:
				cadastrar(&i);
				break;
			case 2:
				filtrarPreco(&i);
				break;
			case 3:
				filtrarMarca(&i);
				break;
			case 4:
				filtrarMAC(&i);
				break;
			case 5:
				break;
			default:
				printf("Menu inválido\n");
				break;
		}
	} while(menuUser != 5);

}
