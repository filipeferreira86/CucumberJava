# language: pt
Funcionalidade: Alugar filme
	Como usuário
	Eu quero cadastrar aluguéis de filmes
	para controlar preços e datas de entrega
	
Cenário: Dave alugar um filme com sucesso
	Dado um filme com estoque 2 unidades
	E que o preço do aluguel seja 3 reais
	Quando alugar
	Então o preço do aluguel será 3 reais
	E a data de entrega será no dia seguinte
	E o estoque do filme será 1 unidade
