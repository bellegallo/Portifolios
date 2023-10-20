print('Bem Vindo(a) a Lanchonete da Isabelle Gallo Silva RU: 4362773')  # Identificador
print('***************CARDÁPIO***************')
print('CÓDIGO |      DESCRIÇÃO        | VALOR')
print(' 100   |   Cachorro-Quente     | 9.00')
print(' 101   | Cachorro-Quente Duplo | 11.00')
print(' 102   |        X-Egg          | 12.00')
print(' 103   |        X-Salada       | 13.00')
print(' 104   |        X-Bacon        | 14.00')
print(' 105   |        X-Tudo         | 17.00')
print(' 200   |   Refrigerante Lata   | 5.00')
print(' 201   |       Chá Gelado      | 4.00')
print('**************************************')
acumulador = 0  # Definição de acumulador para que ele possa acumular os valores
while True:
    produto = input('Entre com o código do produto desejado:')
    if produto != '100' and produto != '101' and produto != '102' and produto != '103' and produto != '104' and produto != '105' and produto != '200' and produto != '201':
        print('Opção Inválida! Código inexistente.')
        continue  # se o usuário digitar um número inválido, voltará para o começo do while

    if produto == '100':
        print('Você escolheu o lanche: Cachorro-Quente')
        acumulador = acumulador + 9  # pegar o valor que tinha no acumulador e somar com 9

    elif produto == '101':
        print('Você escolheu o lanche: Cachorro-Quente Duplo')
        acumulador = acumulador + 11  # pegar o valor que tinha no acumulador e somar com 11

    elif produto == '102':
        print('Você escolheu o lanche: X-Egg')
        acumulador = acumulador + 12  # pegar o valor que tinha no acumulador e somar com 12

    elif produto == '103':
        print('Você escolheu o lanche: X-Salada')
        acumulador = acumulador + 13  # pegar o valor que tinha no acumulador e somar com 13

    elif produto == '104':
        print('Você escolheu o lanche: x-Bacon')
        acumulador = acumulador + 14  # pegar o valor que tinha no acumulador e somar com 14

    elif produto == '105':
        print('Você escolheu o lanche: X-Tudo')
        acumulador = acumulador + 17  # pegar o valor que tinha no acumulador e somar com 17

    elif produto == '200':
        print('Você escolheu um Refrigerante Lata')
        acumulador = acumulador + 5  # pegar o valor que tinha no acumulador e somar com 5

    elif produto == '201':
        print('Você escolheu um Chá Gelado')
        acumulador = acumulador + 4  # pegar o valor que tinha no acumulador e somar com 4

    pedir = input('Deseja mais alguma coisa (S/digite outra tecla)? :')
    pedir = pedir.upper()  # resolvo o problema de digitar 's' e 'S' ou 'n' e 'N'
    if pedir == 'S':
        continue  # se o usuário quiser pedir mais coisa, voltará ao início do programa
    else:
        print('O valor total a ser pago é: R$ {:.2f}' .format(acumulador))
        break  # quebra o laço, encerrando o programa

