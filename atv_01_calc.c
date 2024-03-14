#include <stdio.h>

void input_user_variables(char *operador, float *num1, float *num2) {
    printf("Digite a operação (+, -, *, /): ");
    scanf(" %c", operador);
    printf("Digite o primeiro número: ");
    scanf("%f", num1);
    printf("Digite o segundo número: ");
    scanf("%f", num2);
}

float answer_user_calculation(char operador, float num1, float num2) {
    float resultado;
    switch (operador) {
        case '+':
            resultado = num1 + num2;
            break;
        case '-':
            resultado = num1 - num2;
            break;
        case '*':
            resultado = num1 * num2;
            break;
        case '/':
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                printf("Erro! Divisão por zero.\n");
                resultado = 0;
            }
            break;
        default:
            printf("Operador inválido.\n");
            resultado = 0;
    }
    return resultado;
}

void print_answer_for_user(float resultado) {
    printf("Resultado: %.2f\n", resultado);
}

int main() {
    char operador;
    float num1, num2;
    
    input_user_variables(&operador, &num1, &num2);
    float resultado = answer_user_calculation(operador, num1, num2);
    print_answer_for_user(resultado);
    
    return 0;
}
