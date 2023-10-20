#  -------- Iniício das Variáveis Globais --------
lista_peca = []  
codigo_peca = 0  
#  -------- Fim das Variáveis Globais --------

#  -------- Início de cadastrar_peca()---------
def cadastrar_peca(codigo):  # variável para cadastrar a peça e definir um código para cada peça
    print('Bem-vindo ao menu de Cadastrar Peças')
    print('Código da Peça: {}' .format(codigo))
    nome = input('Entre com o NOME da peça: ')
    fabricante = input('Entre com o FABRICANTE da peça: ')
    preco = int(input('Entre com o PREÇO(R$) da peça: '))
    dicionario_peca = { 'codigo'    : codigo,  # variáveis armazenadas em um dicionário para facilitar a localização dos dados
                       'nome'       : nome,
                       'fabricante' : fabricante,
                        'preco'     : preco}
    lista_peca.append(dicionario_peca.copy())  # dicionário criado foi copiado para uma lista
#  -------- Fim de cadastrar_peca()---------

#  -------- Início de consultar_peca()---------
def consultar_peca():   # variável para consulta de peças
    print('Bem-vindo ao menu de Consultar Peças')
    while True:  # laço de repetição 
        opcao_consultar = input('\nEscolha a opção desejada:\n' +
                                '1-Consultar TODAS as Peças\n' +
                                '2-Consultar Peça por CÓDIGO\n' +
                                '3-Consultar Peça por FABRICANTE\n' +
                                '4-Retornar\n' +
                                '>>')
        if opcao_consultar == '1':
            print('Você escolheu a opção Consultar TODAS as Peças')
            for peca in lista_peca:  # produto vai varrer toda a lista de peças
                print('----------------------')
                for key,value in peca.items():  # varrer todos os conjuntos chaves e valor do dicionario_peca
                    print('{}: {}' .format(key,value))
                print('----------------------')
        elif opcao_consultar == '2':
            print('Você escolheu a opção Consultar Peça por CÓDIGO')
            valor_desejado = int(input('Entre com o CÓDIGO desejado: '))
            for peca in lista_peca:   # produto vai varrer toda a lista de peças
                if peca['codigo'] == valor_desejado:  # o valor do campo código desse dicionário é igual ao valor desejado
                    print('----------------------')
                    for key, value in peca.items():  # varrer todos os conjuntos chaves e valor do dicionario_peca
                        print('{}: {}'.format(key, value))
                print('----------------------')
        elif opcao_consultar == '3':
            print('Você escolheu a opção Consultar Peça por FABRICANTE')
            valor_desejado = input('Entre com o FABRICANTE desejado: ')
            for peca in lista_peca:   # produto vai varrer toda a lista de peças
                if peca['fabricante'] == valor_desejado:  # o valor do campo código desse dicionário é igual ao valor desejado
                    print('----------------------')
                    for key, value in peca.items():  # varrer todos os conjuntos chaves e valor do dicionario_peca
                        print('{}: {}'.format(key, value))
                print('----------------------')
        elif opcao_consultar == '4':
            return  # sai da função consultar_peca e volta para o Main
        else:
            print('Opção Inválida. Tente Novamente.')
            continue  # volta para o início do laço
#  -------- Fim de consultar_peca()---------

#  -------- Início de remover_peca()---------
def remover_peca():   # variável para remover uma peça
    print('Bem-vindo ao menu de Remover Peças')
    valor_desejado = int(input('entre com o CÓDIGO da peça que deseja remover: '))
    for peca in lista_peca:   # produto vai varrer toda a lista de peças
      if peca['codigo'] == valor_desejado:
        lista_peca.remove(peca)  # '.remove' irá remover a peça que queremos da lista_peca
        print('Peça Removida!')
#  -------- Fim de cadastrar_peca()---------

#  -------- Início de Main ---------
print('Bem Vindo(a) a Bicicletaria da Isabelle Gallo Silva RU: 4362773')
while True:  # laço de repetição
    opcao_principal = input('\nEscolha a opção desejada:\n'+
                            '1-Cadastrar Peças\n'+
                            '2-Consultar Peças\n'+
                            '3-Remover Peças\n'+
                            '4-Sair\n'+
                            '>>')
    if opcao_principal == '1':
        codigo_peca = codigo_peca + 1
        cadastrar_peca(codigo_peca)
    elif opcao_principal == '2':
        consultar_peca()
    elif opcao_principal == '3':
        remover_peca()
    elif opcao_principal == '4':
        break  # encerra o laço principal e o programa acaba
    else:
        print('Opção Inválida. Tente Novamente.')
        continue  # volta para o início do laço
#  -------- Fim de Main ---------
